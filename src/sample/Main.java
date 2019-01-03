package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.Timer;


public class Main extends Application {


    long timeStep;
    boolean scoring = true;
    int clicked = 0;
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        Button button1 = new Button("0");
        //Text txt = new Text(10,0,"Click Score");
        primaryStage.setScene(new Scene(button1, 300, 275));
        primaryStage.show();
        timeStep = System.nanoTime() + 10000000000L;

        new AnimationTimer() {
            public void handle(long now) {
                if (now > timeStep) {
                    timeStep = now + 10000000000L;
                    scoring = !scoring;
                }
                if (!scoring) {
                    button1.setText("Amount of clicks:" + clicked);


                }
                else {
                    button1.setText("timer active");

                }
               // txt.setText("Score:" + Integer.toString(score));

            }
        }.start();
        button1.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent actionEvent) {
                clicked++;
                button1.setText(String.valueOf(clicked));
            }
        });




    }



    public static void main(String[] args) {
        launch(args);
    }
}
