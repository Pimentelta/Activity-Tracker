package com.csci360.activitytracker.controller;
import com.csci360.activitytracker.model.Person; //how we plan on getting goal
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

public class NewGoalController {
	public boolean submit = false;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> amount;

    @FXML
    private ComboBox<String> goal;

    @FXML
    private Button backButton;

    @FXML
    private Button confirmButton;


    @FXML
    void backPressed(ActionEvent event) throws IOException {
    	Parent newGoalParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene newGoalScene = new Scene(newGoalParent);
    	submit = false;
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	
    	stage.setScene(newGoalScene);
    	stage.show();
    	System.out.println("Back Button Pressed!");
    }
    
    @FXML
    void confirmPressed(ActionEvent event) throws IOException {
    	Parent newGoalParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene newGoalScene = new Scene(newGoalParent);
    	submit = true;
    	Stage stage = (Stage) confirmButton.getScene().getWindow();
    	
    	stage.setScene(newGoalScene);
    	stage.show();
    	System.out.println("Back Button Pressed!");
    	System.out.println("Confirm Button Pressed! All changes saved successfully!");
    }
    
    @FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'SetNewGoal.fxml'.";
        assert amount != null : "fx:id=\"amount\" was not injected: check your FXML file 'SetNewGoal.fxml'.";
        assert goal != null : "fx:id=\"goal\" was not injected: check your FXML file 'SetNewGoal.fxml'.";
        assert confirmButton != null : "fx:id=\"confirmButton\" was not injected: check your FXML file 'SetNewGoal.fxml'.";
        
        Person p = Person.getPerson();
        amount.getItems().setAll("1000", "2000", "3000","4000","5000", "6000", "7000","8000", "9000", "10000");
        goal.getItems().setAll("Steps", "Calories");
     // bind the selected fruit label to the selected fruit in the combo box.
        //selectedFruit.textProperty().bind(amount.getSelectionModel().selectedItemProperty());

        // listen for changes to the amount combo box selection and update something accordingly.
        amount.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         
        	@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "1000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "2000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "3000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "4000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "5000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "6000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "7000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "8000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "9000": p.setGoal(Integer.parseInt(oldSelection)); break;
                case "10000": p.setGoal(Integer.parseInt(oldSelection)); break;
              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "1000": p.setGoal(1000); break;
                case "2000": p.setGoal(2000); break;
                case "3000": p.setGoal(3000); break;
                case "4000": p.setGoal(4000); break;
                case "5000": p.setGoal(5000); break;
                case "6000": p.setGoal(6000); break;
                case "7000": p.setGoal(7000); break;
                case "8000": p.setGoal(8000); break;
                case "9000": p.setGoal(9000); break;
                case "10000": p.setGoal(10000); break;
              }
            }
        System.out.println("Value of Goal: " + p.getGoal());
        
        
    }
});

    }
}