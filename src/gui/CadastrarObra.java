package gui;

import application.Funcionario;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CadastrarObra {

	public static Group TelaCadastroObra() {

			
			Text nomeLabel = new Text();      
			nomeLabel.setText("Nome:");
			nomeLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));

			TextField nomeText = new TextField(); 
		  
			Text custoLabel = new Text();      
			custoLabel.setText("Custo:");
			custoLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));

			TextField custoText = new TextField(); 
			
			Button buttonOk = new Button("OK"); 
		    Button buttonCancelar = new Button("Cancelar"); 
		    
		    GridPane gridPane = new GridPane();    
		      
		    gridPane.setMinSize(640, 480);
		    gridPane.setPadding(new Insets(10, 10, 10, 10)); 
		    gridPane.setVgap(10); 
		    gridPane.setHgap(5);
		    gridPane.setAlignment(Pos.CENTER);
		    //(name, col, lin)
		    gridPane.add(nomeLabel, 0, 0);
		    gridPane.add(nomeText, 1, 0);
		    gridPane.add(custoLabel, 0, 1);
		    gridPane.add(custoText, 1, 1);
		    gridPane.add(buttonOk, 0, 4);
		    gridPane.add(buttonCancelar, 1, 4);
			
			Group root = new Group(gridPane);         
			//Scene scene = new Scene(root, 640, 480);  
		  
			return root;
	}
}
