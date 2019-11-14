package com.csci360.activitytracker.view;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class MainMenuController implements Initializable{

	@FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    	BorderPane root = new BorderPane();
		FXMLLoader lgLoader = new FXMLLoader(getClass().getResource("LiveGraph.fxml"));
		lgLoader.setController(new LiveGraphController());//this works!!!
		root.setCenter(lgLoader.load());
    }

    @FXML
    void showNewSession(ActionEvent event) throws IOException {
    	System.out.println("Show the New Session Window!");//works
    	//BorderPane pane = new BorderPane();//broke
		
    	FXMLLoader nsLoader = new FXMLLoader();
    	nsLoader.setLocation(getClass().getResource("NewSession.fxml"));
    	nsLoader.setController(new NewSessionController());
    	rootPane = nsLoader.load();
    	
		rootPane.getChildren().setAll(rootPane);//this seems to work. 
		
		/*
		  BorderPane root = new BorderPane();
		//this.primaryStage.setTitle("Activity Tracker");
		//Parent root = FXMLLoader.load(getClass().getResource("/com/csci360/activitytracker/view/MainMenu.fxml"));
		//FXMLLoader menuLoader = new FXMLLoader(getClass().getClassLoader().getResource("src/com/csci360/activitytracker/view/MainMenu.fxml"));
		FXMLLoader menuLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
		menuLoader.setController(new MainMenuController());//this works!!!
		root.setCenter(menuLoader.load());
		*/
    }

    @FXML
    void showSetNewGoal(ActionEvent event) throws IOException {
    	BorderPane root = new BorderPane();
		FXMLLoader sngLoader = new FXMLLoader(getClass().getResource("SetNewGoal.fxml"));
		sngLoader.setController(new NewGoalController());//this works!!!
		root.setCenter(sngLoader.load());
		//MainMenuController menuController = menuLoader.getController();
		
		
    }

    @FXML
    void showSleep(ActionEvent event) throws IOException {
    	BorderPane root = new BorderPane();
		FXMLLoader sLoader = new FXMLLoader(getClass().getResource("Sleep.fxml"));
		sLoader.setController(new SleepController());//this works!!!
		root.setCenter(sLoader.load());
    }

    @FXML
    void showViewData(ActionEvent event) throws IOException {
    	BorderPane root = new BorderPane();
		FXMLLoader vdLoader = new FXMLLoader(getClass().getResource("ViewData.fxml"));
		vdLoader.setController(new ViewDataController());//this works!!!
		root.setCenter(vdLoader.load());
    }

    @FXML
    void showChangeTime(ActionEvent event) throws IOException {
    	BorderPane root = new BorderPane();
		FXMLLoader ctLoader = new FXMLLoader(getClass().getResource("ChangeTime.fxml"));
		ctLoader.setController(new ChangeTimeController());//this works!!!
		root.setCenter(ctLoader.load());
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

        BorderPane pane = new BorderPane();//FXMLLoader(getClass().getResource("NewSession.fxml"));//currently broken
		
		//menuLoader.setController(new MainMenuController());//this works!!!
    	FXMLLoader nsLoader = new FXMLLoader(getClass().getResource("NewSession.fxml"));
    	nsLoader.setController(new NewSessionController());
    	pane.setCenter(nsLoader.load());
		rootPane.getChildren().setAll(pane);//this seems to work.
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
