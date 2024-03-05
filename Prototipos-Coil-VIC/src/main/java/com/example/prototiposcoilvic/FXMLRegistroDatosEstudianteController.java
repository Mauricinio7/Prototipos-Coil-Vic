package com.example.prototiposcoilvic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class FXMLRegistroDatosEstudianteController {

    @FXML
    private TextField textFieldCorreo;
    @FXML
    private TextField textFieldMatricula;
    @FXML
    private TextField textFieldNombre;

    @FXML
    public void botonRegistrar(ActionEvent event) {
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
        TextField[] camposField = {textFieldCorreo, textFieldMatricula, textFieldNombre};

        for (TextField campoTexto : camposField) {
            if (campoTexto.getText().isBlank()) {
                return true;
            }
        }
        return false;
    }
}
