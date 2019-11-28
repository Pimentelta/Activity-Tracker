package com.csci360.activitytracker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.csci360.activitytracker.model.PTime;
import com.csci360.activitytracker.model.Person;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class ChangeTimeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button submitButton;
    @FXML
    private Button backButton;
    
    @FXML
    private ComboBox<String> time;

    @FXML
    private ComboBox<String> mtime;

    @FXML
    void showTime(ActionEvent event) throws IOException {
    	
    }
    @FXML
    void showM(ActionEvent event) throws IOException {
    	
    }

    @FXML
    void submitPressed(ActionEvent event) throws IOException {
    	System.out.println("Submit Pressed!");
    	Parent changeTimeParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene changeTimeScene = new Scene(changeTimeParent);
    	
    	Stage stage = (Stage) submitButton.getScene().getWindow();
    	
    	stage.setScene(changeTimeScene);
    	stage.show();
    	System.out.println("New Time Set!");
    }
    @FXML
    void backPressed(ActionEvent event) throws IOException {
    	System.out.println("Cancel Pressed!");
    	Parent changeTimeParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene changeTimeScene = new Scene(changeTimeParent);
    	
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	
    	stage.setScene(changeTimeScene);
    	stage.show();
    }
    @FXML
    void initialize() {
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'ChangeTime.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ChangeTime.fxml'.";
        assert time != null : "fx:id=\"time\" was not injected: check your FXML file 'ChangeTime.fxml'.";
        assert mtime != null : "fx:id=\"mtime\" was not injected: check your FXML file 'ChangeTime.fxml'.";
        
        time.getItems().setAll("01:00", "02:00", "03:00","04:00","05:00", "06:00", "07:00","08:00", "09:00", "10:00", "11:00", "12:00");
        mtime.getItems().setAll("AM", "PM"); 
        						
     // bind the selected fruit label to the selected fruit in the combo box.
        //selectedFruit.textProperty().bind(amount.getSelectionModel().selectedItemProperty());

        // listen for changes to the amount combo box selection and updates the time accordingly.
        time.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         
        	@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "01:00": PTime.setHour(oldSelection); break;
                case "02:00": PTime.setHour(oldSelection); break;
                case "03:00": PTime.setHour(oldSelection); break;
                case "04:00": PTime.setHour(oldSelection); break;
                case "05:00": PTime.setHour(oldSelection); break;
                case "06:00": PTime.setHour(oldSelection); break;
                case "07:00": PTime.setHour(oldSelection); break;
                case "08:00": PTime.setHour(oldSelection); break;
                case "09:00": PTime.setHour(oldSelection); break;
                case "10:00": PTime.setHour(oldSelection); break;
                case "11:00": PTime.setHour(oldSelection); break;
                case "12:00": PTime.setHour(oldSelection); break;
                //case "12:00": PTime.setHour(Integer.parseInt(oldSelection)); break;

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "01:00": PTime.setHour("01:00"); break;
                case "02:00": PTime.setHour("02:00"); break;
                case "03:00": PTime.setHour("03:00"); break;
                case "04:00": PTime.setHour("04:00"); break;
                case "05:00": PTime.setHour("05:00"); break;
                case "06:00": PTime.setHour("06:00"); break;
                case "07:00": PTime.setHour("07:00"); break;
                case "08:00": PTime.setHour("08:00"); break;
                case "09:00": PTime.setHour("09:00"); break;
                case "10:00": PTime.setHour("10:00"); break;
                case "11:00": PTime.setHour("11:00"); break;
                case "12:00": PTime.setHour("12:00"); break;
                
               // case "12:00": PTime.setHour(12); break;
              }
            }
        System.out.println("New Time should be: " + PTime.getHour());
    
    }
 
}
        );
        mtime.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            
        	@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "AM": PTime.setMeridian(oldSelection); break;
                case "PM": PTime.setMeridian(oldSelection); break;
               

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "AM": PTime.setMeridian("AM"); break;
                case "PM": PTime.setMeridian("PM"); break;
              }}
            System.out.println("New Meridian should be: " + PTime.getMeridian());
            
            
            
            }
         
        }
                );
        
    }
}
