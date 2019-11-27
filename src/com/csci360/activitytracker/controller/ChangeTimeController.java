package com.csci360.activitytracker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

        // listen for changes to the amount combo box selection and update something accordingly.
        time.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         
        	@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "01:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "02:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "03:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "04:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "05:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "06:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "07:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "08:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "09:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "10:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "11:00": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "12:00": Person.setAge(Integer.parseInt(oldSelection)); break;

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "01:00": Person.setAge(20); break;
                case "02:00": Person.setAge(21); break;
                case "03:00": Person.setAge(22); break;
                case "04:00": Person.setAge(23); break;
                case "05:00": Person.setAge(24); break;
                case "06:00": Person.setAge(25); break;
                case "07:00": Person.setAge(26); break;
                case "08:00": Person.setAge(27); break;
                case "09:00": Person.setAge(28); break;
                case "10:00": Person.setAge(29); break;
                case "11:00": Person.setAge(30); break;
                case "12:00": Person.setAge(30); break;
              }
            }
        System.out.println("New Time should be: " + Person.getAge());
    
    
    
    }
 
}
        );
        time.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            
        	@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "AM": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "PM": Person.setAge(Integer.parseInt(oldSelection)); break;
               

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "AM": Person.setAge(20); break;
                case "PM": Person.setAge(21); break;
              }}
            System.out.println("New Meridian should be: " + Person.getAge());
            
            
            
            }
         
        }
                );
        
    }
}
