package LapS6;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class FromThemSp {
   public TextField txtTenSP = new TextField();
   public TextField txtMoTa = new TextField();
   public TextField txtGia = new TextField();
   public TextField txtSoLuong = new TextField();

   public void themSP()throws Exception
   {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           String url = "jdbc:mysql://localhost:3306/t1907m";
           Connection conn = DriverManager.getConnection(url,"root","");
           String name = txtTenSP.getText();
           String description = txtMoTa.getText();
           Integer price = Integer.parseInt(txtGia.getText()) ;
           Integer quantity = Integer.parseInt(txtSoLuong.getText());
           Product pd = new Product(0,name,description,price,quantity);
           Statement stm = conn.createStatement();
           int i =stm.executeUpdate("INSERT INTO product(name,description,price,quantity) VALUES ('"+name+"','"+description+"','"+price+"','"+quantity+"')");
           if (i>0){
               Parent list = FXMLLoader.load(getClass().getResource("showSp.fxml"));
               Main.mainStage.getScene().setRoot(list);
           }else {
               System.out.println("ko thanh cong");
           }

       }catch (Exception e)
       {
           System.out.println("khong inset dc");
       }
   }


}
