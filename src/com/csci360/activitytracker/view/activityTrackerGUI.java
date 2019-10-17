package com.csci360.activitytracker.view;

//Imports are listed in full to show what's being used
//could just import javafx.*
import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Application;

import com.csci360.activitytracker.model.ActivityGraph;

import javafx.*;
public class activityTrackerGUI extends Application {
	void viewGraphs() {
		
	}
	void swapGraphView() {
		
	}
	void viewData() {
		
	}
	void chooseCategory(Object type) {
		
	}
	void stopRecordingData() {
		
	}
	void setNewGoal() {
		
	}
	void enterGoalValue(Object value) {
		
	}
	void enterGoalDate() {
		
	}
	void graph( String goalType,  int goalValue, String goalDate) {
		
	}
	void displayGraph(ActivityGraph newGoalGraph){
		
	}
	boolean beginSession(boolean yes) {
		return yes;
	}
	void inputData(int data) {
		
	}
	String dataLogged(int data) {
		return "Logged!";
	}
//JavaFX application still use the main method.
//It should only ever contain the call to the launch method
	public static void main(String[] args) {
		Application.launch(args);
}
//starting point for the application
//this is where we put the code for the user interface
	@Override
	public void start(Stage stage) throws Exception {
//The primaryStage is the top-level container
	
	    Parent root = FXMLLoader.load(getClass().getResource("DeleteModify.fxml"));
	    Scene scene = new Scene(root);
	    
	    String css = activityTrackerGUI.class.getResource("application.css").toExternalForm();
	    //Parent root1 = (Parent) root.load();
	    scene.getStylesheets().add(css);
	    stage.setTitle("StatsWrap");
	   // Stage stage = new Stage();
	    stage.initModality(Modality.APPLICATION_MODAL);
	    stage.initStyle(StageStyle.UNDECORATED);
	    //stage.setTitle("StatsWrap");
	    stage.setScene(scene);  
	    stage.show();
	    
	
/*
	//The BorderPane has the same areas laid out as the
//BorderLayout layout manager
BorderPane componentLayout = new BorderPane();
componentLayout.setPadding(new Insets(20,0,20,20));
//The FlowPane is a container that uses a flow layout
final FlowPane choicePane = new FlowPane();
choicePane.setHgap(100);
Label choiceLbl = new Label("Fruits");
//The choicebox is populated from an observableArrayList
ChoiceBox fruits = new ChoiceBox(FXCollections.observableArrayList("Asparagus", "Beans", "Broccoli", "Cabbage"
, "Carrot", "Celery", "Cucumber", "Leek", "Mushroom"
, "Pepper", "Radish", "Shallot", "Spinach", "Swede"
, "Turnip"));
//Add the label and choicebox to the flowpane
choicePane.getChildren().add(choiceLbl);
choicePane.getChildren().add(fruits); 
//put the flowpane in the top area of the BorderPane
componentLayout.setTop(choicePane);
final FlowPane listPane = new FlowPane();
listPane.setHgap(100);
Label listLbl = new Label("Vegetables");
ListView vegetables = new ListView(FXCollections.observableArrayList("Apple", "Apricot", "Banana"
,"Cherry", "Date", "Kiwi", "Orange", "Pear", "Strawberry"));
listPane.getChildren().add(listLbl);
listPane.getChildren().add(vegetables);
listPane.setVisible(false);
componentLayout.setCenter(listPane);
//The button uses an inner class to handle the button click event
Button vegFruitBut = new Button("Fruit or Veg");
vegFruitBut.setOnAction(new EventHandler() {
@Override
public void handle(ActionEvent event) {
//switch the visibility for each FlowPane
choicePane.setVisible(!choicePane.isVisible());
listPane.setVisible(!listPane.isVisible());
}
});
componentLayout.setBottom(vegFruitBut);
//Add the BorderPane to the Scene */
//Scene appScene = new Scene(componentLayout,500,500);
//Add the Scene to the Stage 
//primaryStage.setScene(appScene);
	   
}
}