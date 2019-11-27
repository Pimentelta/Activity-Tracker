package com.csci360.activitytracker.controller;
import com.csci360.activitytracker.model.Person;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import com.csci360.activitytracker.model.Calories;
import com.csci360.activitytracker.model.HeartRate;
import com.csci360.activitytracker.model.steps;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ViewDataController {
	//public static int goal=0;
	 
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Label heartbeat;

    @FXML
    private Hyperlink backButton;

    @FXML
    private Label stepsTaken;
    
    @FXML
    private Label goalMet;

    @FXML
    private Label calories;

    @FXML
    void backPressed(ActionEvent event) throws IOException {
    	Parent viewDataParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene viewDataScene = new Scene(viewDataParent);
    	
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	
    	stage.setScene(viewDataScene);
    	stage.show();
    	System.out.println("Back Button Pressed!");
    }

    @FXML
    void initialize() throws InterruptedException {
    	assert heartbeat != null : "fx:id=\"heartbeat\" was not injected: check your FXML file 'ViewData.fxml'.";
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'ViewData.fxml'.";
        assert stepsTaken != null : "fx:id=\"stepsTaken\" was not injected: check your FXML file 'ViewData.fxml'.";
        assert calories != null : "fx:id=\"calories\" was not injected: check your FXML file 'ViewData.fxml'.";
       
        HeartRate heartsim = new HeartRate();
        steps stpsview = new steps();
       Calories calorie = new Calories();
      //Person p = new Person();
        int[] temp = heartsim.hrLog(10);
        int[]temp2 = stpsview.addSteps(10);
        for(int i=0; i<temp.length;i++) {
        	TimeUnit.SECONDS.sleep(1);
        	temp[i] = heartsim.average();
        	//heartsim.updateHR(temp);
        	
        	//if(i%5 <= 0) {
        		//heartsim.average(heartsim.getHeartRate());
        		heartbeat.setText("HeartRate:" + temp[i] + "bpm");
        //	}
        		
        		
        		stepsTaken.setText("Steps: " + temp2[temp2.length-1]);
        		goalMet.setText("% of Goal Met: " + String.valueOf((temp2[temp2.length-1])/(Person.getGoal())));
        		calories.setText("Calories Burned: " + String.valueOf(calorie.caloriesBurned(temp2[temp2.length-1])));
        }
       // heartsim.updateHR(heartsim.rng());
      //  heartbeat.setText("HeartRate: " + get);
    }
}
