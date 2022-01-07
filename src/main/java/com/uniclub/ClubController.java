package com.uniclub;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ClubController implements Initializable {

    @FXML
    private Label label_username;

    @FXML
    private Button btn_logout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        btn_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event, "login.fxml", "Log in", null, 400, 600);
            }
        });
    }

    public void setUserInformation(String username) {
        label_username.setText(username);
    }
}