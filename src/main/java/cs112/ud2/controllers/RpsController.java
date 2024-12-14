package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class RpsController {
    @FXML
    private Label rpsWinLabel;
    @FXML
    private Label rpsMoneyLabel;
    @FXML
    private Label rpsChoiceLabel;
    @FXML
    private Label rpsOtherChoiceLabel;
    @FXML
    private Button rpsBetButton;
    @FXML
    private Button rpsPlayButton;
    @FXML
    private Button rpsExitButton;
    @FXML
    private TextField rpsBetTextField;
    @FXML
    private ImageView rpsRockImageView;
    @FXML
    private ImageView rpsOtherRockImageView;
    @FXML
    private ImageView rpsPaperImageView;
    @FXML
    private ImageView rpsOtherPaperImageView;
    @FXML
    private ImageView rpsScissorsImageView;
    @FXML
    private ImageView rpsOtherScissorsImageView;
    @FXML
    protected void onRpsBetButtonClick(){
        rpsWinLabel.setText("rps bet button clicked");
    }
    @FXML
    protected void onRpsPlayButtonClick(){
        rpsWinLabel.setText("rps play button clicked");
    }
    @FXML
    protected void onRpsExitButtonClick(){
        rpsWinLabel.setText("rps exit button clicked");
    }
    @FXML
    protected void onRpsBetTextFieldAction(){
        rpsWinLabel.setText(rpsBetTextField.getText());
        rpsBetTextField.setText("");
    }
    @FXML
    protected void onRpsRockImageViewClick(){
        rpsChoiceLabel.setText("Your Choice: Rock");
        rpsRockImageView.setOpacity(1);
        rpsPaperImageView.setOpacity(0.2);
        rpsScissorsImageView.setOpacity(0.2);
    }
    @FXML
    protected void onRpsPaperImageViewClick(){
        rpsChoiceLabel.setText("Your Choice: Paper");
        rpsRockImageView.setOpacity(0.2);
        rpsPaperImageView.setOpacity(1);
        rpsScissorsImageView.setOpacity(0.2);
    }
    @FXML
    protected void onRpsScissorsImageViewClick(){
        rpsChoiceLabel.setText("Your Choice: Scissors");
        rpsRockImageView.setOpacity(0.2);
        rpsPaperImageView.setOpacity(0.2);
        rpsScissorsImageView.setOpacity(1);
    }
}
