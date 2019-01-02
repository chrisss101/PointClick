package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Timer;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        Button button1 = new Button("Click");
        primaryStage.setScene(new Scene(button1, 300, 275));
        primaryStage.show();
        Timer timer = new Timer();
        button1.setOnAction(new EventHandler<ActionEvent>() {
            int clicked = 0;
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
