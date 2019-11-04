package com.csci360.activitytracker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.*;
public class MainMenuController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane rootPane;

    @FXML
    void showLiveGraph(ActionEvent event) {

    }

    @FXML
    void showNewSession(ActionEvent event) {

    }

    @FXML
    void showSetNewGoal(ActionEvent event) {

    }

    @FXML
    void showSleep(ActionEvent event) {

    }

    @FXML
    void showViewData(ActionEvent event) {

    }

    @FXML
    void showChangeTime(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert rootPane != null : "fx:id=\"rootPane\" was not injected: check your FXML file 'MainMenu.fxml'.";

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
