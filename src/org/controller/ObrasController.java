package org.controller;

import java.net.URL;
//import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.model.Conta;
import org.model.Obra;
import org.service.ContasService;
import org.service.impl.ContasDBService;
import org.view.CadastrarObra;

import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * 
 * O controller da aplicação, onde a mágica acontece
 * @author wsiqueir
 *
 */
public class ObrasController implements Initializable {

	@FXML
	private TableView<Conta> tblContas;
	@FXML
	private TableColumn<Conta, String> clConsc;
	@FXML
	private TableColumn<Conta, String> clDesc;
	@FXML
	private TableColumn<Conta, Date> clVenc;
	@FXML
	private TextField txtConsc;
	@FXML
	private TextField txtDesc;
	@FXML
	private DatePicker dpVencimento;
	@FXML
	private Button btnSalvar;
	@FXML
	private Button btnAtualizar;
	@FXML
	private Button btnApagar;
	@FXML
	private Button btnLimpart;
	@FXML
    private ListView listViewObraPessoal;
	@FXML
    private ListView listViewObraEmpreiteira;
	
	private ContasService service;

	// metodos publicos para cliques de botao
	public void cadastrarObraPessoal() throws Exception {
		System.out.println("---- INICIAR cadastrarObraPessoall-----------");
		new CadastrarObra().start();
		System.out.println("---- NOVA OBRA CRIADA -----------");
	}
	
	public void cadastrarObraEmpreiteira() throws Exception {
		System.out.println("---- INICIAR cadastrarObraEmpreiteira -----------");
		new CadastrarObra().start();
	}
	
	@Override
    public void initialize(URL url, ResourceBundle rb) {
        // change next line to DB load
        List<String> valuesPessoal = Arrays.asList("Obra Pessoal 1", "Obra Pessoal 2", "Obra Pessoal 3");
        listViewObraPessoal.setItems(FXCollections.observableList(valuesPessoal));
        
        List<String> valuesEmpreiteira = Arrays.asList("Obra Empreiteira 1", "Obra Empreiteira 2", "Obra Empreiteira 3");
        listViewObraEmpreiteira.setItems(FXCollections.observableList(valuesEmpreiteira));
    }
	
	public void salvar() {
		Conta c = new Conta();
		pegaValores(c);
		service.salvar(c);
		atualizaDadosTabela();
	}

	public void atualizar() {
		Conta c = tblContas.getSelectionModel().getSelectedItem();
		pegaValores(c);
		service.atualizar(c);
		atualizaDadosTabela();
	}

	public void apagar() {
		Conta c = tblContas.getSelectionModel().getSelectedItem();
		service.apagar(c.getId());
		atualizaDadosTabela();
	}

	public void limpar() {
		tblContas.getSelectionModel().select(null);
		txtConsc.setText("");
		txtDesc.setText("");
		dpVencimento.setValue(null);
	}
	
	// metodos privados do controller
	// pega os valores entrados pelo usuario e adiciona no objeto conta
	private void pegaValores(Conta c) {
		c.setConcessionaria(txtConsc.getText());
		c.setDescricao(txtDesc.getText());
		c.setDataVencimento(dataSelecionada());
	}

	// método utilitário para pega a data que foi selecionada (que usa o tipo novo do java 8 LocalDateTime)
	private Date dataSelecionada() {
		LocalDateTime time = dpVencimento.getValue().atStartOfDay();
		return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
	}

	// chamado quando acontece alguma operação de atualização dos dados
	private void atualizaDadosTabela() {
		tblContas.getItems().setAll(service.buscarTodas());
		limpar();
	}

	// configura as colunas para mostrar as propriedades da classe Conta
	private void configuraColunas() {
		clConsc.setCellValueFactory(new PropertyValueFactory<>("concessionaria"));
		clDesc.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		clVenc.setCellValueFactory(new PropertyValueFactory<>("dataVencimento"));
	}
	
	// configura a logica da tela
	private void configuraBindings() {
		// esse binding só e false quando os campos da tela estão preenchidos
		BooleanBinding camposPreenchidos = txtConsc.textProperty().isEmpty().or(txtDesc.textProperty().isEmpty())
				.or(dpVencimento.valueProperty().isNull());
		// indica se há algo selecionado na tabela
		BooleanBinding algoSelecionado = tblContas.getSelectionModel().selectedItemProperty().isNull();
		// alguns botões só são habilitados se algo foi selecionado na tabela
		btnApagar.disableProperty().bind(algoSelecionado);
		btnAtualizar.disableProperty().bind(algoSelecionado);
		btnLimpart.disableProperty().bind(algoSelecionado);
		// o botão salvar só é habilitado se as informações foram preenchidas e não tem nada na tela
		btnSalvar.disableProperty().bind(algoSelecionado.not().or(camposPreenchidos));
		// quando algo é selecionado na tabela, preenchemos os campos de entrada com os valores para o 
		// usuário editar
		tblContas.getSelectionModel().selectedItemProperty().addListener((b, o, n) -> {
			if (n != null) {
				LocalDate data = null;
				data = n.getDataVencimento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				txtConsc.setText(n.getConcessionaria());
				txtDesc.setText(n.getDescricao());
				dpVencimento.setValue(data);
			}
		});
	}
}