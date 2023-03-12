package com.example.tictactoe;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class HelloApplication extends Application {

    @Override
    public void start(Stage stage)  {
        GameManager gameManager = new GameManager();
        Pane root = new Pane();
        gameManager.createGame();
        root.getChildren().addAll(gameManager.raundText,gameManager.X, gameManager.O, gameManager.pointX, gameManager.pointO,
                gameManager.xPlayer, gameManager.oPlayer,gameManager.button1, gameManager.button2, gameManager.button3,
                gameManager.button4, gameManager.button5, gameManager.button6, gameManager.button7, gameManager.button8, gameManager.button9,gameManager.roundCountText);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Tic Tac Toe!");
        stage.getIcons().add(new Image("file:src/main/resources/tic-tac-toe.png"));
        stage.setScene(scene);
        stage.show();
    }
}