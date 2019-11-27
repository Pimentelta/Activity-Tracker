package com.csci360.activitytracker.controller;

import java.io.IOException;

import java.net.URL;

import java.util.ResourceBundle;
import com.csci360.activitytracker.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.concurrent.TimeUnit;
//import MainMenuController.java;
//import Math;

public class LiveGraphController {
	public boolean display = true;
    @FXML
    private ResourceBundle resources;
    public static int[] stepsArray;
    @FXML
    private NumberAxis yAxis;

    @FXML
    private CategoryAxis xAxis;
    
    @FXML
    private static LineChart<?, ?> lineChart;
    @FXML
    private URL location;

    @FXML
    private Button backButton;
    
    private static XYChart.Series series;
    private static double xval =0;
    
    public static double incrementer=0.0;
    @FXML
    void backPressed(ActionEvent event) throws IOException {
    	Parent liveGraphParent = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
    	Scene liveGraphScene = new Scene(liveGraphParent);
    	
    	Stage stage = (Stage) backButton.getScene().getWindow();
    	
    	stage.setScene(liveGraphScene);
    	display = false;
    	stage.show();
    	System.out.println("Back Button Pressed!");
    }
    static void updateGraph(double xval, double data) throws InterruptedException {
    		series.getData().add(new XYChart.Data<>(xval, data));
  
    		
    	}
    	
    static steps stepEx = new steps();
	static int[] stepsArr = steps.getSteps();
	
    @SuppressWarnings("unchecked")
	static void setup() {
//    	NumberAxis xAxis = new NumberAxis(0,1000, 10);
//    	xAxis.setLabel("Time");
//    	
    	CategoryAxis xAxis = new CategoryAxis();
    	//xAxis.setCategories(<String>observableArrayList);		
    	NumberAxis yAxis = new NumberAxis(0, 1000, 10);
    	yAxis.setLabel("Steps");
    	xAxis.setLabel("Time");
    	
    	LineChart lineChart = new LineChart(xAxis, yAxis);
    	//Stage stage = (Stage) .getScene().getWindow();
    	XYChart.Series series = new XYChart.Series();
    	series.setName("Steps taken");
    
    	for( int i = 0; i <50; i++) {
    		series.getData().add(new XYChart.Data(i, stepsArr[i]));
    	lineChart.getData().add(series);
    	
    	}
    	Scene scene = new Scene(lineChart,800,600);
    	lineChart.getData().add(series);
    	
    	
    	
    }
    public void start(Stage stage) throws Exception{
    	
    }
//    static double rng() throws InterruptedException {
//    	TimeUnit.SECONDS.sleep(3);
//    	xval++;
//    	return Math.random()*(100-0);
//    }
    
//    	static void main(String[]args) throws InterruptedException {
//    		setup();
//    		for(int i = 0; i<10;i++) {
//    			double tempData = rng();
//    			incrementer = incrementer + tempData;
//    			updateGraph(i, tempData);
//    		}
//    		
//    	}

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@FXML
    void initialize() {
        assert backButton != null : "fx:id=\"backButton\" was not injected: check your FXML file 'LiveGraph.fxml'.";
        /*XYChart.Series series = new XYChart.Series<>();
        
        series.getData().add(new XYChart.Data("1",10));
        series.getData().add(new XYChart.Data("2", 12));
        
        linechart.getData().addAll(series);
        */
    }
}