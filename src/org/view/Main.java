//package application;
//	
//import gui.CadastrarObra;
//import javafx.application.Application;
//import javafx.stage.Stage;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.effect.Glow;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontPosture;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//
//
//public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try {
////			//Crian��o de texto 
////			Funcionario F1 = new Funcionario(1, 123, "Diego Ernesto");
////			Funcionario F2 = new Funcionario(1, 123, "Renan Pinto");
////			
////			Text text = new Text();      
////			text.setText(F1.getNome());
////			text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
////			text.setX(20); 
////			text.setY(50);
////		  
////			Text text2 = new Text();      
////			text2.setText(F2.getNome()); 
////			text2.setX(20); 
////			text2.setY(80);
////			
////			//Cria��o de imagem
////			Image image = new Image("https://st2.depositphotos.com/1000792/5623/v/950/depositphotos_56232035-stock-illustration-piggy-in-a-puddle.jpg"); 
////
////			ImageView imageView = new ImageView(image); 
////
////			imageView.setX(400); 
////			imageView.setY(10);  
////
////			imageView.setFitHeight(200);
////			imageView.setFitWidth(300); 
////
////			//Setting the preserve ratio of the image view 
////			imageView.setPreserveRatio(true); 
////
////			Group root = new Group(text, text2, imageView);   
////			Scene scene = new Scene(root, 800, 600); 
//			
//			//Scene scene = CadastrarObra.TelaCadastroObra();
//		  
//			//Setting title to the Stage 
//			primaryStage.setTitle("PDFBalance"); 
//		     
//			//Adding scene to the stage 
//			primaryStage.setScene(scene); 
//		     
//			//Displaying the contents of the stage 
//			primaryStage.show(); 
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

package org.view;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Main extends Application {

	@FXML
	AnchorPane anchoPane;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		URL fxml = getClass().getResource("main.fxml");
//		Parent parent = (Parent) FXMLLoader.load(fxml);
//		stage.setTitle("Contas a pagar!");
//		stage.setScene(new Scene(parent));
//		stage.show();
		Parent root = null;
	    try {
	    	URL fxml = getClass().getResource("main.fxml");
			root = (Parent) FXMLLoader.load(fxml);
	    } catch (Exception ex) {
	    }
	    

	    Scene scene = new Scene(root);

	    Stage stage = new Stage();
	    stage.setTitle("APP - Informa��es");
	    stage.setScene(scene);
	    stage.show();
	}
	
}
