package com.csci360.activitytracker.controller;
import com.csci360.activitytracker.controller.*;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
//import java.time.Duration;
import java.util.ResourceBundle;

import com.csci360.activitytracker.model.PTime;
import com.csci360.activitytracker.model.steps;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
public class MainMenuController implements Initializable{

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private Label clock;
    @FXML
    private Button vdButton;

    @FXML
    private Button nsButton;

    @FXML
    public AnchorPane rootPane;

    @FXML
    private Button sngButton;

    @FXML
    private Button sButton;

    @FXML
    private Button lgButton;

    @FXML
    private Button ctButton;

    @FXML
    void showLiveGraph(ActionEvent event) throws IOException {
    	System.out.println("Show the Live Graph Window!");
    	Parent liveGraphParent = FXMLLoader.load(getClass().getResource("../view/LiveGraph.fxml"));
    	Scene liveGraphScene = new Scene(liveGraphParent);
    	
    	Stage stage = (Stage) lgButton.getScene().getWindow();
    	stage.setScene(liveGraphScene);
//Parent lineChart = new XYChart.Series();
		//    	XYChart.Series dataSeries1 = new XYChart.Series();
//    	dataSeries1.setName("Live Graphs");
//    	for(int i =0; i < steps.length; i++) {
//    		dataSeries1.getData().add(new XYChart.Data(i, steps[i]))
//    	//}
    	//display = true;
//    	lineChart.getData().add(new XYChart.Data("5",10));
 //   	Scene scene = new Scene(lineChart, 600, 600);
    	
    	stage.show();
    	
    	System.out.println("Live Graph Loaded Successfully!");
    	}

    @FXML
    void showNewSession(ActionEvent event) throws IOException {
    	System.out.println("Show the New Session Window!");//works
    	
    	Parent newSessionParent = FXMLLoader.load(getClass().getResource("../view/NewSession.fxml"));
    	Scene newSessionScene = new Scene(newSessionParent);
    	
    	Stage stage = (Stage) nsButton.getScene().getWindow();
    	stage.setScene(newSessionScene);
    	stage.show();
    	System.out.println("New Session Loaded Successfully!");
    }

    @FXML
    void showSetNewGoal(ActionEvent event) throws IOException {
    	System.out.println("Show the Set New Goal Window!");
    	Parent setNewGoalParent = FXMLLoader.load(getClass().getResource("../view/SetNewGoal.fxml"));
    	Scene setNewGoalScene = new Scene(setNewGoalParent);
    	
    	Stage stage = (Stage) sngButton.getScene().getWindow();
    	stage.setScene(setNewGoalScene);
    	stage.show();
    	System.out.println("Set New Goal Loaded Successfully!");
    	}

    @FXML
    void showSleep(ActionEvent event) throws IOException {
    	System.out.println("Show the Sleep Window!");
    	Parent sleepParent = FXMLLoader.load(getClass().getResource("../view/Sleep.fxml"));
    	Scene sleepScene = new Scene(sleepParent);
    	
    	Stage stage = (Stage) sButton.getScene().getWindow();
    	stage.setScene(sleepScene);
    	stage.show();
    	System.out.println("Sleep Loaded Successfully!");
    }

    @FXML
    void showViewData(ActionEvent event) throws IOException {
    	System.out.println("Show the View Data Window!");
    	Parent viewDataParent = FXMLLoader.load(getClass().getResource("../view/ViewData.fxml"));
    	Scene viewDataScene = new Scene(viewDataParent);
    	
    	Stage stage = (Stage) vdButton.getScene().getWindow();
    	stage.setScene(viewDataScene);
    	stage.show();
    	System.out.println("View Data Loaded Successfully!");
    }

    @FXML
    void showChangeTime(ActionEvent event) throws IOException {
    	System.out.println("Show the Change Time Window!");
    	Parent changeTimeParent = FXMLLoader.load(getClass().getResource("../view/ChangeTime.fxml"));
    	Scene changeTimeScene = new Scene(changeTimeParent);
    	
    	Stage stage = (Stage) ctButton.getScene().getWindow();
    	stage.setScene(changeTimeScene);
    	stage.show();
    	System.out.println("Change Time Loaded Successfully!");
    }

    @FXML
    void initialize() throws IOException{
        assert vdButton != null : "fx:id=\"vdButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert nsButton != null : "fx:id=\"nsButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert sngButton != null : "fx:id=\"sngButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert sButton != null : "fx:id=\"sButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert lgButton != null : "fx:id=\"lgButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert ctButton != null : "fx:id=\"ctButton\" was not injected: check your FXML file 'MainMenu.fxml'.";
        assert clock != null : "fx:id=\"clock\" was not injected: check your FXML file 'MainMenu.fxml'.";
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
//		
		/*
		 * Updates the time shown at the top of the main menu
		 */
		final Timeline timeline = new Timeline(new KeyFrame(Duration.millis( 500 ),
	        event ->{clock.setText(PTime.getTime());} ));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
		//clock.setText(PTime.getTime());//this updates the time shown at the top of the main menu
		//clock.textProperty().bind(t);
	}
}
