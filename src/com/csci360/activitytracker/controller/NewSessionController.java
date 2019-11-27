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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

@SuppressWarnings("unused")
public class NewSessionController {
	//Person Person = new Person(); 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Button cancelButton;

    @FXML
    private Button submitButton;

    @FXML
    private ComboBox<String> height;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ComboBox<String> weight;

    @FXML
    private ComboBox<String> age;
    
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
    	System.out.println("Submitted changes saved successfully!");
    }
    @FXML
    void initialize(){
    	// TODO Auto-generated method stub
    	assert cancelButton != null : "fx:id=\"cancelButton\" was not injected: check your FXML file 'NewSession.fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'NewSession.fxml'.";
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'NewSession.fxml'.";
        assert weight != null : "fx:id=\"weight\" was not injected: check your FXML file 'NewSession.fxml'.";
        assert age != null : "fx:id=\"age\" was not injected: check your FXML file 'NewSession.fxml'.";
        assert height != null : "fx:id=\"height\" was not injected: check your FXML file 'NewSession.fxml'.";
       
       // 
        age.getItems().setAll("20", "21", "22","23","24", "25", "26","27", "28", "29", "30");
        height.getItems().setAll("49", "50", 
        						"51","52","53", "54", "55","56", "57", "58", "59", 
        						"60", "61", "62","63", "64", "65","66", "67", "68", "69", 
        						"70", "71", "72" );
        weight.getItems().setAll("100", "110", "120","130","140", "150", "160",
        						"170", "180", "190", "200", "210", "220","230","240", "250", 
        						"260","270", "280", "290", "300");
     // bind the selected fruit label to the selected fruit in the combo box.
        //selectedFruit.textProperty().bind(amount.getSelectionModel().selectedItemProperty());

        // listen for changes to the amount combo box selection and update something accordingly.
        age.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
         
        	@SuppressWarnings({ "static-access", "static-access", "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "20": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "21": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "22": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "23": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "24": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "25": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "26": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "27": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "28": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "29": Person.setAge(Integer.parseInt(oldSelection)); break;
                case "30": Person.setAge(Integer.parseInt(oldSelection)); break;

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "20": Person.setAge(20); break;
                case "21": Person.setAge(21); break;
                case "22": Person.setAge(22); break;
                case "23": Person.setAge(23); break;
                case "24": Person.setAge(24); break;
                case "25": Person.setAge(25); break;
                case "26": Person.setAge(26); break;
                case "27": Person.setAge(27); break;
                case "28": Person.setAge(28); break;
                case "29": Person.setAge(29); break;
                case "30": Person.setAge(30); break;
              }
            }
        System.out.println("Value of Age: " + Person.getAge());
    
    
    
    }
 
}
        );
        weight.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            
        	@SuppressWarnings({ "static-access", "static-access" })
			@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "100": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "110": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "120": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "130": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "140": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "150": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "160": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "170": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "180": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "190": Person.setWeight(Integer.parseInt(oldSelection)); break;
                case "200": Person.setWeight(Integer.parseInt(oldSelection)); break;

              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "100": Person.setWeight(100); break;
                case "110": Person.setWeight(110); break;
                case "120": Person.setWeight(120); break;
                case "130": Person.setWeight(130); break;
                case "140": Person.setWeight(140); break;
                case "150": Person.setWeight(150); break;
                case "160": Person.setWeight(160); break;
                case "170": Person.setWeight(170); break;
                case "180": Person.setWeight(180); break;
                case "190": Person.setWeight(190); break;
                case "200": Person.setWeight(200); break;
                case "210": Person.setWeight(210); break;
                case "220": Person.setWeight(220); break;
                case "230": Person.setWeight(230); break;
                case "240": Person.setWeight(240); break;
                case "250": Person.setWeight(250); break;
                case "260": Person.setWeight(260); break;
                case "270": Person.setWeight(270); break;
                case "280": Person.setWeight(280); break;
                case "290": Person.setWeight(290); break;
                case "300": Person.setWeight(300); break;
              
              }
            }
        System.out.println("Value of Weight: " + Person.getWeight());
    
    
    
    }
 
}
        );
        height.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            
        	@Override 
          public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
            if (oldSelection != null) {
              switch(oldSelection) {
                case "49": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "50": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "51": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "52": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "53": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "54": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "55": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "56": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "57": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "58": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "59": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "60": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "61": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "62": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "63": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "64": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "65": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "66": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "67": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "68": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "69": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "70": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "71": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "72": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "73": Person.setHeight(Integer.parseInt(oldSelection)); break;
                case "74": Person.setHeight(Integer.parseInt(oldSelection)); break;
              }
            }
            if (newSelection != null) {
              switch(newSelection) {
                case "49": Person.setHeight(49); break;
                case "50": Person.setHeight(50); break;
                case "51": Person.setHeight(51); break;
                case "52": Person.setHeight(52); break;
                case "53": Person.setHeight(53); break;
                case "54": Person.setHeight(54); break;
                case "55": Person.setHeight(55); break;
                case "56": Person.setHeight(56); break;
                case "57": Person.setHeight(57); break;
                case "58": Person.setHeight(58); break;
                case "59": Person.setHeight(59); break;
                case "60": Person.setHeight(60); break;
                case "61": Person.setHeight(61); break;
                case "62": Person.setHeight(62); break;
                case "63": Person.setHeight(63); break;
                case "64": Person.setHeight(64); break;
                case "65": Person.setHeight(65); break;
                case "66": Person.setHeight(66); break;
                case "67": Person.setHeight(67); break;
                case "68": Person.setHeight(68); break;
                case "69": Person.setHeight(69); break;
                case "70": Person.setHeight(70); break;
                case "71": Person.setHeight(71); break;
                case "72": Person.setHeight(72); break;
                case "73": Person.setHeight(73); break;
                case "74": Person.setHeight(74); break;
              }
            }
        System.out.println("Value of Height: " + Person.getHeight());
    
    
    
    }
 
}
        );
   
           


    }
}

