package com.csci360.activitytracker.view;

import java.net.URL;
import javafx.*;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
//comes from DeleteModify fxml
public class HomeButtonController {

	void onSubmitClick(ActionEvent event) {
		System.out.println("Hello");
	}
		
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }
}
