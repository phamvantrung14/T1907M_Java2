package lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Stage mainStage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("123.fxml"));
        primaryStage.setTitle("Nhap thong tin sinh vien");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }
}
