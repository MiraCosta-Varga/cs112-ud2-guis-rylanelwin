package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class GamesController {
    @FXML
    private Label gamesMoneyLabel;
    @FXML
    private Label gamesSlotsLabel;
    @FXML
    private Label gamesRpsLabel;
    @FXML
    private Label gamesBlackjackLabel;
    @FXML
    private ImageView gamesSlotsImageView;
    @FXML
    private ImageView gamesRpsImageView;
    @FXML
    private ImageView gamesBlackjackImageView;
    @FXML
    private Button gamesSlotsPlayButton;
    @FXML
    private Button gamesRpsPlayButton;
    @FXML
    private Button gamesBlackjackPlayButton;
    @FXML
    protected void onGamesSlotsPlayButtonClick(){
        gamesMoneyLabel.setText("slots play button clicked");
    }
    @FXML
    protected void onGamesRpsPlayButtonClick(){
        gamesMoneyLabel.setText("rps play button clicked");
    }
    @FXML
    protected void onGamesBlackjackPlayButtonClick(){
        gamesMoneyLabel.setText("blackjack play button clicked");
    }
}
