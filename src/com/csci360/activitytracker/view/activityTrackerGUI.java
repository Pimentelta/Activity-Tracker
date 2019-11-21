package com.csci360.activitytracker.view;

//Imports are listed in full to show what's being used
//could just import javafx.*
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import com.csci360.activitytracker.model.ActivityGraph;

//import javafx.*;
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

//starting point for the application
//this is where we put the code for the user interface
	public Stage stage;
	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("Trying to Load Main Menu");
		/*	
			BorderPane root = new BorderPane();
			FXMLLoader menuLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
			//menuLoader.setController(new MainMenuController());//this works!!!
			root.setCenter(menuLoader.load());
			//MainMenuController menuController = menuLoader.getController();
			
			
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("StatsWrap");
			stage.show();
			System.out.println("Main Menu Loaded Successfully!");
	*/
		// From tutorial by Jaret Wright. Didn't work though** now it works...
			Parent root = FXMLLoader.load(getClass().getResource("../view/MainMenu.fxml"));
			
			Scene scene = new Scene(root);
			
			stage.setScene(scene);
			stage.setTitle("StatsWrap");
			stage.show();
			System.out.println("Main Menu Loaded Successfully!");
			
	}
/*		private void showMainMenu() throws IOException {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(activityTrackerGUI.class.getResource("MainMenu.fxml"));
			mainLayout = loader.load();
			Scene scene = new Scene(mainLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	/*  
		private void showNewSession() throws IOException {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(activityTrackerGUI.class.getResource("NewSession.fxml"));
			BorderPane sessionMenu = loader.load();
			mainLayout.setCenter(sessionMenu);
			Scene scene = new Scene(sessionMenu);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		*/
	/**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
		launch(args);
	}
}
