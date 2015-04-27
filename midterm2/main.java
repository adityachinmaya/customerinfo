package midterm2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		try {
			Parent source = FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"));
			Scene scene = new Scene(source,450,600);
			primaryStage.setScene(scene);
			primaryStage.show();	
		} 
		
		catch(Exception e) {	
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
