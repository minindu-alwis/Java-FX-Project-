package javaclass;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class firstfx {
    public Label hellolbl;

    public void btnClickmeOnAction(ActionEvent actionEvent) {
        System.out.println("Hello World");
        hellolbl.setText("Hello Java Fx");

    }
}
