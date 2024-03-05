package com.example.prototiposcoilvic;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLVentanaConsultasCursosController implements Initializable {

    @FXML
    private ComboBox<String> comboBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Agregar valores al ComboBox
        comboBox.getItems().addAll("PENDIENTE", "RECHAZADA", "APROBADA");
    }
}
