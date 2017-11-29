package org.controller;

import org.model.Conta;
import org.model.Obra;
import org.service.impl.ContasDBService;

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
		System.out.println("---- SALVAR ObraPessoall-----------");
		obra = new Obra();
		
		pegaValores(obra);
		
		System.out.println("nome: " + obra.getName());
		System.out.println("Custo: " + obra.getCustos());
		new ContasDBService().salvarObra(obra.getName() , obra.getCustos(), "");
		
		System.out.println("----SALVOU-----------");
		
	}
	
	private void pegaValores(Obra o) {
		o.setName(txtNomeObra.getText());
		o.setCustos(Double.parseDouble(txtCustoObra.getText()));
	}
		
}