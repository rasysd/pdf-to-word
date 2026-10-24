package br.com.rayson.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        Label rotulo = new Label("Conversor do PDF para WORD");
        Button botao = new Button("Selecionar PDF");
        VBox layout = new VBox(10, rotulo, botao);
        Scene cena = new Scene(layout, 400, 200);
        stage.setTitle("...");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}