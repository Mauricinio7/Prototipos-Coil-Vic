package com.example.prototiposcoilvic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class FXMLVentanaCoordinadorController {

    @FXML
    private Pane PanelExpandible;

    @FXML
    public void initialize() {
        // Configurar tooltips para los botones
        for (javafx.scene.Node node : PanelExpandible.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                Tooltip tooltip = (Tooltip) button.getTooltip();
                if (tooltip != null) {
                    Tooltip.install(button, tooltip);
                }
            }
        }
    }

    @FXML
    public void expandirPanel() {
        // Expandir el panel
        PanelExpandible.setPrefWidth(150);
    }

    @FXML
    public void contraerPanel() {
        // Contraer el panel
        PanelExpandible.setPrefWidth(79);
    }

    // Método de acción para el botón Historial
    @FXML
    public void botonHistorial() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLVentanaHistorial"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Otros métodos de acción para los botones
}

