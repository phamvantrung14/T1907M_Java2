package QLStudent;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.table.DefaultTableModel;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Vector;

public class Form  {
    public TextField txtName = new TextField();
    public TextField txtAge = new TextField();
    public TextField txtMark = new TextField();


    public void nhapMoi() throws Exception{
         txtName.setText("");
         txtAge.setText("");
         txtMark.setText("");
    }



    public void submitStudent() throws Exception{
        String name = txtName.getText();
        Integer age;
        Integer mark;
        try{
            age = Integer.parseInt(txtAge.getText());
            mark = Integer.parseInt(txtMark.getText());
        }catch (Exception e){
            throw new Exception("Loi mat roi"); // Crash app
        }
        QLStudent.Student s = new Student(name,age,mark);
        QLStudent.Main.students.add(s);

        // Show ra danh sach
        Main.students.stream().forEach(e->{
            System.out.println(e.getName()+"-"+e.getAge()+"-"+e.getMark());
        });
        String url = "jdbc:mysql://localhost:3306/t1907m";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,"root","");
            PreparedStatement ps= (PreparedStatement) conn.prepareStatement("INSERT INTO student(name,age,mark) VALUES (?,?,?)");
            ps.setString(1,txtName.getText());
            ps.setString(2,txtAge.getText());
            ps.setString(3,txtMark.getText());
            int i = ps.executeUpdate();
            if (i<0){
                System.out.println("insert ko thanh cong");
            }else{
                System.out.println("insert thanh cong");
            }
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql_text);
            while (rs.next()){

                String line = rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
            }
        }catch (Exception e){

        }

    }
    public void data(){
        try {
            // Step 2:Khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            // Step3: Tao URL DB
            String url = "jdbc:mysql://localhost:3306/t1907m";
            String username="root";
            String password="";//"" neu dung xampp ,"root" neu dung mamp
            // Step4: Ket noi DB
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Ket noi MYSQL thanh cong");
            // thu truy van lay students
            Statement stm = conn.createStatement();
            String sql_text = "SELECT * FROM student";
            ResultSet rs = stm.executeQuery(sql_text);
            while (rs.next()){

                String line = rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
            }

        }catch (Exception e){
            System.out.println("loi roi");
        }
    }



}
