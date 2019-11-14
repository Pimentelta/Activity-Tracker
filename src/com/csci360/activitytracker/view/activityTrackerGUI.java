package com.csci360.activitytracker.view;

//Imports are listed in full to show what's being used
//could just import javafx.*
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

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
	//@Override
	private Stage primaryStage;
	private BorderPane mainLayout;
	@Override
	public void start(Stage primaryStage) throws IOException {
			BorderPane root = new BorderPane();
			this.primaryStage = primaryStage;
			FXMLLoader menuLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
			menuLoader.setController(new MainMenuController());//this works!!!
			root.setCenter(menuLoader.load());
			//MainMenuController menuController = menuLoader.getController();
			
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("StatsWrap");
			primaryStage.show();
			System.out.println("Main Menu Loaded Successfully!");
			//showMainMenu();
			//showNewSession();
		
			
		/* catch(Exception e) {
			e.printStackTrace();
		} */
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
	public static void main(String[] args) {
		launch(args);
	}
}
