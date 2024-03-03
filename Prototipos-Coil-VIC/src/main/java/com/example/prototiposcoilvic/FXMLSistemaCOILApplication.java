package com.example.prototiposcoilvic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLSistemaCOILApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FXMLVentanaPrincipalProfesor.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
//        stage.setTitle("Sistema COIL");
//        stage.setScene(scene);
//        stage.show();

        FXMLLoader fxmlLoaderCoordinador = new FXMLLoader(HelloApplication.class.getResource("FXMLVentanaCoordinador.fxml"));
        Scene scene2 = new Scene(fxmlLoaderCoordinador.load(), 700, 500);
        stage.setTitle("Sistema COIL Coordinador");
        stage.setScene(scene2);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}