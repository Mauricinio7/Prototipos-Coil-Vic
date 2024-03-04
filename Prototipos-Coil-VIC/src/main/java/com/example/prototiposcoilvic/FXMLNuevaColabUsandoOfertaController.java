package com.example.prototiposcoilvic;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLNuevaColabUsandoOfertaController implements Initializable {

    @FXML
    private ComboBox<String> comboBoxPeriodo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxPeriodo.setItems(FXCollections.observableArrayList("Febrero24-Julio24", "Agosto24-Enero25"));
    }

    @FXML
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

    /**
     * FALTA MODIFICAR EL botonAceptar CON UN METODO AQUI
     */
}
