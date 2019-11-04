package controller;
import javafx.animation.*;
import java.net.URL;
/*import java.time.Duration;
import java.time.LocalTime; */
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

   /* @FXML //should be the code to the clock. 
    public void initialize() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {        
            LocalTime currentTime = LocalTime.now();
            time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        }),
             new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    } */
}
