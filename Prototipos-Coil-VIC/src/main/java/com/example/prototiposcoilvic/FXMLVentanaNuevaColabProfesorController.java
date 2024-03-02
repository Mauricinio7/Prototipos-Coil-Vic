package com.example.prototiposcoilvic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FXMLVentanaNuevaColabProfesorController {

    @FXML
    public TextArea textAreaObjetivoGeneral;
    @FXML
    public TextArea textAreaTemaInteres;
    @FXML
    public TextField textFieldModalidad;
    @FXML
    public TextField textFieldIdioma;
    @FXML
    public TextField textFieldExperienciaEducativa;
    @FXML
    public TextField textFieldTipoColaboracion;
    @FXML
    public TextField textFieldNombreColaboracion;
    @FXML
    private Pane PanelExpandible;

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
    public void botonMiColaboracion(ActionEvent event) {
        try {
            Parent ventanaAnterior = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FXMLVentanaMiColabProfesor.fxml")));
            Scene escenaAnterior = new Scene(ventanaAnterior);
            Stage ventanaActual = (Stage) ((Node)event.getSource()).getScene().getWindow();
            ventanaActual.setScene(escenaAnterior);
            ventanaActual.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    public void botonAceptar(ActionEvent event) {
        if (camposVacios()) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Faltan campos por llenar");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmacion");
            alert.setHeaderText(null);
            alert.setContentText("¿Está seguro que desea confirmar los datos del registro?");
            alert.showAndWait();
        }
    }

    @FXML
    public void botonCancelar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmacion");
        alert.setHeaderText(null);
        alert.setContentText("Se reiniciarán los campos\n¿Está seguro que desea cancelar el registro?");
        alert.showAndWait();
    }

    private boolean camposVacios() {

        TextField[] camposField = {textFieldIdioma, textFieldExperienciaEducativa, textFieldNombreColaboracion, textFieldModalidad, textFieldNombreColaboracion, textFieldTipoColaboracion};
        TextArea[] camposArea = {textAreaObjetivoGeneral, textAreaTemaInteres};

        for (TextField campoTexto : camposField) {
            if (campoTexto.getText().isBlank()) {
                return true;
            }
        }
        for (TextArea campoTexto: camposArea) {
            if (campoTexto.getText().isBlank()) {
                return true;
            }
        }
        return false;
    }
}
