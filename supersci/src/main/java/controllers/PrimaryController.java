package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;

    @FXML
    private TextField txt_password;

    @FXML
    private TextField txt_username;

    @FXML
    void login(ActionEvent event) {
        String username = txt_username.getText();
        String password = txt_password.getText();
        System.out.println("Username is"+ username);

        // SuperSci superSci = new SuperSci(null);
        // boolean login = superSci.login(username, password, userlist); //ALWAYS TYPE IN PASSWORD
        
        

    }

}
