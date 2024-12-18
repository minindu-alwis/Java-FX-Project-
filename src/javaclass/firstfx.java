package javaclass;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import Customer.Customer;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.AbstractList;
import java.util.ArrayList;

public class firstfx {

    public TextField txtname;
    public TextField txtAge;
    public TextField txtAddress;
    public TextField txtSalary;
    public TableView tblcustomer;
    public TableColumn colname;
    public TableColumn colage;
    public TableColumn coladdress;
    public TableColumn colsalary;

    ArrayList<Customer> customerList = new ArrayList<>();
    public void btnCutomerAddOnAction(ActionEvent actionEvent) {

        String name=txtname.getText();
        String age=txtAge.getText();
        String address=txtAddress.getText();
        Double salary=Double.parseDouble(txtSalary.getText());

        Customer c1=new Customer(name,age,address,salary);


        customerList.add(c1);
        System.out.println(customerList);
        LoadTabel();


    }

    private void LoadTabel(){

        ObservableList<Customer> CustomerObservablesList=FXCollections.observableArrayList();
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        colage.setCellValueFactory(new PropertyValueFactory<>("age"));
        coladdress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colsalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        customerList.forEach(obj->{

            CustomerObservablesList.add(obj);
        });

        tblcustomer.setItems(CustomerObservablesList);
    }
}
