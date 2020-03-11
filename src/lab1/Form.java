package lab1;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import lab1.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Form {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();

    public void submitStudent() throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username ="root";
            String password = "";

            Connection conn = DriverManager.getConnection(url,username,password);
            String name = txtName.getText();
            Integer age = Integer.parseInt(txtAge.getText());
            Integer mark = Integer.parseInt(txtMark.getText());
            Student s =new Student(name,age,mark);

            String sql_text = "INSERT INTO students(name,age,mark) VALUES('"+name+"',"+age+","+mark+")";
            Statement stm = conn.createStatement();
            int row_number = stm.executeUpdate(sql_text);
            if (row_number>0){
                Parent List = FXMLLoader.load(getClass().getResource("List.fxml"));
                Main.mainStage.getScene().setRoot(List);
            }else{

            }

        }catch (Exception e){

        }
    }

}
