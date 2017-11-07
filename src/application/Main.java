package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.net.URISyntaxException; 
import java.net.URL; 

import java.io.File; 
import java.util.ArrayList; 
import com.almworks.sqlite4java.SQLiteConnection; 
import com.almworks.sqlite4java.SQLiteConstants; 
import com.almworks.sqlite4java.SQLiteException; 
import com.almworks.sqlite4java.SQLiteStatement;
	 

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("printa");
		try {
		 SQLiteConnection db = new SQLiteConnection(new File("C:\\Users\\digust10\\Documents\\SQLiteBDteste\\test.db"));
		 db.open(true);
		 SQLiteStatement st = db.prepare("SELECT sum(custo) FROM ObraTable");
		 if(st.step()){
			 int x = st.columnInt(0);
			 System.out.println("Eai?" + x);
		 }
		   // System.out.println("Eai?" + st.columnDouble(1));
		} catch(Exception e) {
			System.out.println("Nao");
			e.printStackTrace();
		}
		launch(args);
	}
	

}
