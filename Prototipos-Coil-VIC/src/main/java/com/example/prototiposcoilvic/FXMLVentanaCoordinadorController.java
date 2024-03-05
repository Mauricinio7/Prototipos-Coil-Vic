package com.example.prototiposcoilvic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;

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

    // Métodos de acción para los botones (si los necesitas)
    @FXML
    public void botonInicio() {
        // Acción para el botón de Inicio
    }

    @FXML
    public void botonNuevaColaboracion() {
        // Acción para el botón de Nueva Colaboración
    }

    // Otros métodos de acción para los botones
}
