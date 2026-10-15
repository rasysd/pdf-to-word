package br.com.rayson.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label rotulo = new Label("Conversor do PDF para WORD");
        Scene cena = new Scene(rotulo, 400, 200);
        stage.setTitle("pdf to word");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}