package com.csci360.activitytracker.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SleepController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    void backPressed(ActionEvent event) throws IOException {
    	Parent sleepParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene sleepScene = new Scene(sleepParent);
    	
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	
    	stage.setScene(sleepScene);
    	stage.show();
    	System.out.println("Back Button Pressed!");
    }

    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'Sleep.fxml'.";

    }
}
