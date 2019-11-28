package com.csci360.activitytracker.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.csci360.activitytracker.model.sleep;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class SleepController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private TableColumn<com.csci360.activitytracker.model.sleep, String> sleept;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<com.csci360.activitytracker.model.sleep, String> tsleep;
    
    @FXML
    private TableView<com.csci360.activitytracker.model.sleep> table;
    
    @FXML
    private Label dsleep;

    @FXML
    private Label lsleep;

    @FXML
    private Label rsleep;

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
        assert sleept != null : "fx:id=\"sleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert tsleep != null : "fx:id=\"tsleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert dsleep != null : "fx:id=\"dsleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert lsleep != null : "fx:id=\"lsleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        assert rsleep != null : "fx:id=\"rsleep\" was not injected: check your FXML file 'Sleep.fxml'.";
        /*
        sleep.setCellValueFactory(new PropertyValueFactory<>("Amount of Sleep"));
        tsleep.setCellValueFactory(new PropertyValueFactory<>("Type of Sleep"));
        table.setItems(observableList);
       
    }
    ObservableList<com.csci360.activitytracker.model.sleep> observableList = FXCollections.observableArrayList{
    	new com.csci360.activitytracker.model.sleep()
    	);
    */
        //sleep s = sleep.getSleep();
        String[] data = sleep.generateSleep(60); //generates 60 minutes of sleep
        rsleep.setText(data[0]);
        dsleep.setText(data[1]);
        lsleep.setText(data[2]);
    }
}
