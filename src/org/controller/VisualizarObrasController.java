package org.controller;

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
public class VisualizarObrasController {

	// metodos publicos para cliques de botao
	public void salvarObraPessoal() throws Exception {
		System.out.println("---- SALVAR ObraPessoall-----------");
		Main.changeScreen("main");
		
	}
	
	public void cancelar() throws Exception {
		System.out.println("---- CANCELAR ----------");
		Main.changeScreen("main");
		
	}
	
	public void editarObra() throws Exception {
		System.out.println("---- EDITANDO ----------");
		Main.changeScreen("cadastrarObra");
		
	}
		
}