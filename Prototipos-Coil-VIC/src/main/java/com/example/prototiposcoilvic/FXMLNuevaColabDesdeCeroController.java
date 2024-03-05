package com.example.prototiposcoilvic;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLNuevaColabDesdeCeroController implements Initializable {

    @FXML
    public TextField textFieldHoras;
    @FXML
    private ComboBox<String> comboBoxPeriodo;
    @FXML
    private TextArea textAreaObjetivoGeneral;
    @FXML
    private TextArea textAreaTemaInteres;
    @FXML
    private TextField textFieldModalidad;
    @FXML
    private TextField textFieldIdioma;
    @FXML
    private TextField textFieldExperienciaEducativa;
    @FXML
    private TextField textFieldTipoColaboracion;
    @FXML
    private TextField textFieldNombreColaboracion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboBoxPeriodo.setItems(FXCollections.observableArrayList("Febrero2024-Julio2024", "Agosto2024-Enero2025"));
    }

    @FXML
    public void botonAceptar(ActionEvent event) {
        if (camposVacios()) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Faltan campos por llenar");
            alert.showAndWait();
        } else if (!camposErroneos()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Aviso");
            alert.setHeaderText(null);
            alert.setContentText("Existen datos erroneos. Verifique por favor");
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
        TextField[] camposField = {textFieldIdioma, textFieldExperienciaEducativa, textFieldNombreColaboracion, textFieldModalidad, textFieldNombreColaboracion, textFieldTipoColaboracion, textFieldHoras};
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

    private boolean camposErroneos() {
        try {
            Integer.parseInt(textFieldHoras.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
