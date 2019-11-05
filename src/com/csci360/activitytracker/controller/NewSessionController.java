package com.csci360.activitytracker.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class NewSessionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() throws IOException{
    	/* BorderPane pane = new BorderPane();//FXMLLoader(getClass().getResource("NewSession.fxml"));//currently broken
 		//FXMLLoader(getClass().getResource("MainMenu.fxml"));
 		//menuLoader.setController(new MainMenuController());//this works!!!
     	FXMLLoader nsLoader = new FXMLLoader(getClass().getResource("NewSession.fxml"));
     	nsLoader.setController(new newSessionController());
     	pane.setCenter(nsLoader.load());
 		Pane rootPane = null;
		rootPane.getChildren().setAll(pane);//this seems to work.
		*/
    }
}

