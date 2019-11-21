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

public class ChangeTimeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button submitButton;

    @FXML
    void showTime(ActionEvent event) throws IOException {
    	
    }

    @FXML
    void submitPressed(ActionEvent event) throws IOException {
    	System.out.println("Submit Pressed!");
    	Parent changeTimeParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene changeTimeScene = new Scene(changeTimeParent);
    	
    	Stage stage = (Stage) submitButton.getScene().getWindow();
    	
    	stage.setScene(changeTimeScene);
    	stage.show();
    }

    @FXML
    void initialize() {
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'ChangeTime.fxml'.";

    }
}
