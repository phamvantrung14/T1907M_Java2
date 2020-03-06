package LapS6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){launch();}
    //khaibao de chuyen form
    public static Stage mainStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.mainStage = primaryStage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("showSp.fxml"));
            primaryStage.setTitle("Product");
            primaryStage.setScene(new Scene(root,600,600));
            primaryStage.show();
        }catch (Exception e){
            System.out.println("erros");
        }
    }
}
