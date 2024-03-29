package com.example.prototiposcoilvic;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class FXMLVentanaMiColabProfesorController  implements Initializable{



    @FXML
    private ComboBox<String> comboBoxRegistrarEstudiante;
    @FXML
    private Pane PanelExpandible;
    @FXML

    private ComboBox cbFiltro;
    @FXML
    private ComboBox cbFiltro2;
    @FXML
    private AnchorPane paneCambiable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxRegistrarEstudiante.setItems(FXCollections.observableArrayList("Registrar Estudiante", "Busqueda Estudiantes"));
        comboBoxRegistrarEstudiante.setValue("Busqueda Estudiantes");

        comboBoxRegistrarEstudiante.getSelectionModel().selectedItemProperty().addListener((options, oldValue, newValue) -> {
            try {
                Node nodo;
                if (newValue.equals("Registrar Estudiante")) {
                    nodo = FXMLLoader.load(getClass().getResource("FXMLRegistroDatosEstudiante.fxml"));
                    paneCambiable.getChildren().setAll(nodo);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            ObservableList<String> list = FXCollections.observableArrayList("Todos", "Profesor UV", "Estudiantes UV", "Profesor Externo", "Estudiantes Externos");
            cbFiltro.setItems(list);
            cbFiltro2.setItems(list);
            cbFiltro.setValue("Todos");
            cbFiltro2.setValue("Todos");
        });
    }


    @FXML
    public void aumentarTamaño() {
        // Aumentar el tamaño del panel al pasar el mouse sobre él
        PanelExpandible.setPrefWidth(170);
        PanelExpandible.setPrefHeight(500);
        Label label1 = new Label("Inicio");
        label1.setLayoutX(75); // Posición X en el espacio adicional
        label1.setLayoutY(40); // Posición Y en el espacio adicional
        PanelExpandible.getChildren().add(label1);
        label1.setStyle("-fx-text-fill: white;");

        Label label2 = new Label("Nueva\nColaboracion");
        label2.setLayoutX(75); // Posición X en el espacio adicional
        label2.setLayoutY(90); // Posición Y en el espacio adicional
        PanelExpandible.getChildren().add(label2);
        label2.setStyle("-fx-text-fill: white;");

        Label label3 = new Label("Mi\nColaboracion");
        label3.setLayoutX(75); // Posición X en el espacio adicional
        label3.setLayoutY(155); // Posición Y en el espacio adicional
        PanelExpandible.getChildren().add(label3);
        label3.setStyle("-fx-text-fill: white;");
    }

    @FXML
    public void restaurarTamaño() {
        // Restaurar el tamaño original del panel al retirar el mouse
        PanelExpandible.setPrefWidth(79);
        PanelExpandible.setPrefHeight(500);

        PanelExpandible.getChildren().removeIf(node -> node instanceof Label);
    }

    @FXML
    public void botonInicio(ActionEvent event) {
        try {
            Parent ventanaAnterior = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXMLVentanaPrincipalProfesor.fxml")));
            Scene escenaAnterior = new Scene(ventanaAnterior);
            Stage ventanaActual = (Stage) ((Node)event.getSource()).getScene().getWindow();
            ventanaActual.setScene(escenaAnterior);
            ventanaActual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void botonNuevaColaboracion(ActionEvent event) {
        try {
            Parent ventanaAnterior = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXMLVentanaNuevaColabProfesor.fxml")));
            Scene escenaAnterior = new Scene(ventanaAnterior);
            Stage ventanaActual = (Stage) ((Node)event.getSource()).getScene().getWindow();
            ventanaActual.setScene(escenaAnterior);
            ventanaActual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
