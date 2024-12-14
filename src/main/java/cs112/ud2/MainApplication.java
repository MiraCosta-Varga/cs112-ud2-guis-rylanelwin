package cs112.ud2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //TITLE WINDOW TEST

        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("title-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Casino");

        //GAMES WINDOW TEST

//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("games-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        stage.setTitle("Games");

        //SLOTS WINDOW TEST

//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("slots-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        stage.setTitle("Slots");

        //RPS WINDOW TEST

//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("rps-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        stage.setTitle("Rock Paper Scissors");

        //BLACKJACK WINDOW TEST

//        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("blackjack-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        stage.setTitle("Blackjack");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}