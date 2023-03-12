package com.example.tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class UIStyle {
    public void buttonStyle(Button button, int positionX, int positionY) {
        button.setFont(new Font("Verdana", 30));
        button.setTranslateX(positionX);
        button.setTranslateY(positionY);
        button.setMinWidth(60);
        button.setMinHeight(60);
    }

    public void playerButton(Button button, int positionX, int positionY) {
        button.setFont(new Font("Verdana", 30));
        button.setStyle("-fx-background-color: none");
        button.setTranslateX(positionX);
        button.setTranslateY(positionY);
    }

    public void labelStyle(Label label, int positionX, int positionY) {
        label.setFont(new Font("Verdana", 30));
        label.setTranslateX(positionX);
        label.setTranslateY(positionY);
        if (label.getText() == " X :   ")
            label.setStyle("-fx-background-color:#457b9d");
        else if (label.getText() == " O :   ")
            label.setStyle("-fx-background-color:#e63946");
    }

    public void labelStyle2(Label label, int positionX, int positionY) {
        label.setFont(new Font("Verdana", 20));
        label.setTranslateX(positionX);
        label.setTranslateY(positionY);
    }

}
