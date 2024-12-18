package javaclass;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Customer.Customer;

import java.util.AbstractList;
import java.util.ArrayList;

public class firstfx {

    public TextField txtname;
    public TextField txtAge;
    public TextField txtAddress;
    public TextField txtSalary;

    ArrayList<Customer> customerList = new ArrayList<>();
    public void btnCutomerAddOnAction(ActionEvent actionEvent) {

        String name=txtname.getText();
        String age=txtAge.getText();
        String address=txtAddress.getText();
        Double salary=Double.parseDouble(txtSalary.getText());

        Customer c1=new Customer(name,age,address,salary);


        customerList.add(c1);
        System.out.println(customerList);


    }
}
