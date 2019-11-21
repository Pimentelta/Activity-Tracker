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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class NewSessionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button cancelButton;

    @FXML
    private Button submitButton;

    @FXML
    private AnchorPane rootPane;
    
    @FXML
    void cancelPressed(ActionEvent event) throws IOException {
    	Parent newSessionParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene newSessionScene = new Scene(newSessionParent);
    	
    	Stage stage = (Stage) submitButton.getScene().getWindow();
    	
    	stage.setScene(newSessionScene);
    	stage.show();
    	System.out.println("Cancel Pressed!");
    }

    @FXML
    void submitPressed(ActionEvent event) throws IOException {
    	System.out.println("Submit Pressed!");
    	Parent newSessionParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene newSessionScene = new Scene(newSessionParent);
    	
    	Stage stage = (Stage) submitButton.getScene().getWindow();
    	
    	stage.setScene(newSessionScene);
    	stage.show();
    	System.out.println("Submit changes saved successfully!");
    }
    @FXML
    void initialize(){
    	// TODO Auto-generated method stub
    }
 
}

