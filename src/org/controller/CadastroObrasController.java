package org.controller;

import java.util.List;

import org.model.Conta;
import org.model.Obra;
import org.service.impl.ContasDBService;
import org.view.Main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * 
 * O controller do Cadastro de Obra
 * @author Renan Pinto
 *
 */
public class CadastroObrasController {
	
	@FXML
	private TextField txtNomeObra;
	@FXML
	private TextField txtCustoObra;
	@FXML
    private ListView listFuncinarios;
	
	Obra obra;

	// metodos publicos para cliques de botao
	public void salvarObraPessoal() throws Exception {
		obra = new Obra();
		ContasDBService x = new ContasDBService();
		pegaValores(obra);
		x.salvarObra(obra.getName(),obra.getCustos(),"");

	}
	
	public List<Obra> getObraPessoalLista(){
		ContasDBService x = new ContasDBService();
		return x.listaObras();
	}
	
	public boolean editarObraPessoal(Obra obra) throws Exception {
		obra = new Obra();
		ContasDBService x = new ContasDBService();
		pegaValores(obra);
		return x.editObra(obra);
		
	}
	
	public boolean deleteObraPessoal(Obra obra){
		ContasDBService x = new ContasDBService();
		return x.deleteObra(obra);
	}
	
	private void pegaValores(Obra o) {
		o.setName(txtNomeObra.getText());
		o.setCustos(Double.parseDouble(txtCustoObra.getText()));
	}
		
}