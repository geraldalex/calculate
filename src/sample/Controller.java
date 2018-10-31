
package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    private String number = "";
    private double secondNumber;
    private double firstNumber;


    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField textfield;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    public void onClickListener(ActionEvent actionEvent){
        String text = ((Button)actionEvent.getSource()).getText();
        number =  number+text;
        textfield.setText(number);


    }

    public void clearValue(){
        number = "";
        textfield.setText("");

    }

    public void calculate(ActionEvent actionEvent){


    }

}
