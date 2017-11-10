package org.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class CadastrarObra {
	
	public void start() {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("cadastrarObra.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root, 800, 600);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
