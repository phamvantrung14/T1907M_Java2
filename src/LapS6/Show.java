package LapS6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

public class Show implements Initializable {
    @FXML
    private TableView JTable;
    @FXML
    private TableColumn idColumn;
    @FXML
    private TableColumn tenSPColumn;
    @FXML
    private TableColumn moTaColumn;
    @FXML
    private TableColumn giaColumn;
    @FXML
    private TableColumn soLuongColumn;
//    public TableView<Product> ls = new TableView();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/t1907m";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM product");

            ObservableList ls = FXCollections.observableArrayList();
            while (rs.next())
            {
                Product pd=new Product(rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("price"),rs.getInt("quantity"));
                ls.add(pd);
            }

            idColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("id"));
            tenSPColumn.setCellValueFactory(new PropertyValueFactory<Product ,String>("tenSp"));
            moTaColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("moTa"));
            giaColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("gia"));
            soLuongColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("soLuong"));
            JTable.setItems(ls);


        }catch (Exception e)
        {
            System.out.println("loi");
        }
    }
    public void addSP(){
        try {
            Parent form = FXMLLoader.load(getClass().getResource("fromThemSanPham.fxml"));
            Main.mainStage.getScene().setRoot(form);
        }catch (Exception e){

        }
    }
}
