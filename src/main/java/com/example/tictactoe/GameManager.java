package com.example.tictactoe;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class GameManager {

    //region Object
    private UIStyle UIstyle = new UIStyle();
    //endregion
    //region UI
    protected Button button1 = new Button();
    protected Button button2 = new Button();
    protected Button button3 = new Button();
    protected Button button4 = new Button();
    protected Button button5 = new Button();
    protected Button button6 = new Button();
    protected Button button7 = new Button();
    protected Button button8 = new Button();
    protected Button button9 = new Button();
    private Button[] buttons = new Button[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
    protected Button oPlayer = new Button("O");
    protected Button xPlayer = new Button("X");
    protected Button player = new Button();
    protected Label pointX = new Label("0");
    protected Label pointO = new Label("0");
    protected Label X = new Label(" X :   ");
    protected Label O = new Label(" O :   ");
    protected Label raundText = new Label("Round : ");
    protected Label roundCountText = new Label(" O");
    private int totalX = 0, totalO = 0;
    private int roundCount = 0;
    //endregion
    private void shapeButtonLabel() {
        UIstyle.playerButton(xPlayer, 180, 125);
        UIstyle.playerButton(oPlayer, 255, 125);
        UIstyle.buttonStyle(button1, 140, 200);
        UIstyle.buttonStyle(button2, 220, 200);
        UIstyle.buttonStyle(button3, 300, 200);
        UIstyle.buttonStyle(button4, 140, 280);
        UIstyle.buttonStyle(button5, 220, 280);
        UIstyle.buttonStyle(button6, 300, 280);
        UIstyle.buttonStyle(button7, 140, 360);
        UIstyle.buttonStyle(button8, 220, 360);
        UIstyle.buttonStyle(button9, 300, 360);
        UIstyle.labelStyle(X, 150, 75);
        UIstyle.labelStyle(pointX, 210, 75);
        UIstyle.labelStyle(O, 255, 75);
        UIstyle.labelStyle(pointO, 315, 75);
        UIstyle.labelStyle2(raundText, 180, 25);
        UIstyle.labelStyle2(roundCountText,280,25);
    }
    protected void createGame() {
        player = xPlayer;
        player.setStyle("-fx-background-color:#457b9d");
        shapeButtonLabel();
        clear();
        //region Set On Action
        for (int i = 0; i < buttons.length; i++) {
            int finalI = i;
            buttons[i].setOnAction(actionEvent -> {
                buttons[finalI].setDisable(true);
                player.setStyle("-fx-background-color:none");
                if (player == xPlayer) {
                    buttons[finalI].setText(player.getText());
                    checkAnswer();
                    player = oPlayer;
                    player.setStyle("-fx-background-color:#e63946");
                } else {
                    buttons[finalI].setText(player.getText());
                    checkAnswer();
                    player = xPlayer;
                    player.setStyle("-fx-background-color:#457b9d");
                }
            });
        }
        //endregion
    }
    protected void checkAnswer() {
        if (buttons[0].getText() != "" && buttons[1].getText() != "" && buttons[2].getText() != "" &&
                buttons[0].getText() == buttons[1].getText() && buttons[0].getText() == buttons[2].getText() && buttons[1].getText() == buttons[2].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[0].getText() != "" && buttons[3].getText() != "" && buttons[6].getText() != "" &&
                buttons[0].getText() == buttons[3].getText() && buttons[0].getText() == buttons[6].getText() && buttons[3].getText() == buttons[6].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }

        } else if (buttons[0].getText() != "" && buttons[4].getText() != "" && buttons[8].getText() != "" &&
                buttons[0].getText() == buttons[4].getText() && buttons[0].getText() == buttons[8].getText() && buttons[4].getText() == buttons[8].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[1].getText() != "" && buttons[4].getText() != "" && buttons[7].getText() != "" &&
                buttons[1].getText() == buttons[4].getText() && buttons[1].getText() == buttons[7].getText() && buttons[4].getText() == buttons[7].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[3].getText() != "" && buttons[4].getText() != "" && buttons[5].getText() != "" &&
                buttons[3].getText() == buttons[4].getText() && buttons[3].getText() == buttons[5].getText() && buttons[4].getText() == buttons[5].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[2].getText() != "" && buttons[4].getText() != "" && buttons[6].getText() != "" &&
                buttons[2].getText() == buttons[4].getText() && buttons[2].getText() == buttons[6].getText() && buttons[4].getText() == buttons[6].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[2].getText() != "" && buttons[5].getText() != "" && buttons[8].getText() != "" &&
                buttons[2].getText() == buttons[5].getText() && buttons[2].getText() == buttons[8].getText() && buttons[5].getText() == buttons[8].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        } else if (buttons[6].getText() != "" && buttons[7].getText() != "" && buttons[8].getText() != "" &&
                buttons[6].getText() == buttons[7].getText() && buttons[6].getText() == buttons[8].getText() && buttons[7].getText() == buttons[8].getText()) {
            if (player == this.xPlayer) {
                clear();
                totalX++;
                pointX.setText(String.valueOf(totalX));
            } else {
                clear();
                totalO++;
                pointO.setText(String.valueOf(totalO));
            }
        }

        //berabere durumu
        else if (buttons[0].getText() != "" && buttons[1].getText() != "" && buttons[2].getText() != "" && buttons[3].getText() != ""
                && buttons[4].getText() != "" && buttons[5].getText() != "" &&
                buttons[6].getText() != "" && buttons[7].getText() != "" && buttons[8].getText() != "")
            clear();
    }
    protected void clear() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setDisable(false);
            buttons[i].setText("");
            buttons[i].setStyle("-fx-background-color:#e4e4e4");
        }
        roundCount++;
        roundCountText.setText(String.valueOf(roundCount));
    }
}
