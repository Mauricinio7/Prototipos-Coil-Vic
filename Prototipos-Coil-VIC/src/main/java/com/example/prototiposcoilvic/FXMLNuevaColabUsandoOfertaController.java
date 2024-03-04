package com.example.prototiposcoilvic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class FXMLNuevaColabUsandoOfertaController {

    public void botonAceptar(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmacion");
            alert.setHeaderText(null);
            alert.setContentText("¿Está seguro que desea confirmar los datos del registro?");
            alert.showAndWait();
    }
    @FXML
    public void botonCancelar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmacion");
        alert.setHeaderText(null);
        alert.setContentText("Se reiniciarán los campos\n¿Está seguro que desea cancelar el registro?");
        alert.showAndWait();
    }
}
