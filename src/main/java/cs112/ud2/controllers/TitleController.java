package cs112.ud2.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TitleController {
    @FXML
    private Label titleLabel;
    @FXML
    private ImageView titleImageView;
    @FXML
    private Button enterButton;
    @FXML
    private Button exitButton;
    @FXML
    protected void onEnterButtonClick() {
        titleLabel.setText("enter button clicked");
    }
    @FXML
    protected void onExitButtonClick(){
        titleLabel.setText("exit button clicked");
    }
}