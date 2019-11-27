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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SleepController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<com.csci360.activitytracker.model.sleep, String> date;

    @FXML
    private TableColumn<com.csci360.activitytracker.model.sleep, String> sleep;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<com.csci360.activitytracker.model.sleep, String> tsleep;
    
    @FXML
    private TableView<com.csci360.activitytracker.model.sleep> table;

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
    	assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert sleep != null : "fx:id=\"sleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert tsleep != null : "fx:id=\"tsleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'Sleep.fxml'.";
        
    }
}
