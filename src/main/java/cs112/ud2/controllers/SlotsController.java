package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SlotsController {
    @FXML
    private Label slotsWinLabel;
    @FXML
    private Label slotsMoneyLabel;
    @FXML
    private Button slotsBetButton;
    @FXML
    private Button slotsPlayButton;
    @FXML
    private Button slotsExitButton;
    @FXML
    private TextField slotsBetTextField;
    @FXML
    private ImageView slotsLeftImageView;
    @FXML
    private ImageView slotsCenterImageView;
    @FXML
    private ImageView slotsRightImageView;
    @FXML
    protected void onSlotsBetButtonClick(){
        slotsWinLabel.setText("slots bet button clicked");
    }
    @FXML
    protected void onSlotsPlayButtonClick(){
        slotsWinLabel.setText("slots play button clicked");
    }
    @FXML
    protected void onSlotsExitButtonClick(){
        slotsWinLabel.setText("slots exit button clicked");
    }
    @FXML
    protected void onSlotsBetTextFieldAction(){
        slotsWinLabel.setText(slotsBetTextField.getText());
        slotsBetTextField.setText("");
    }
}
