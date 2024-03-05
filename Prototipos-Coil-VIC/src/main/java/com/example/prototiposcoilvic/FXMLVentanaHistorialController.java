package com.example.prototiposcoilvic;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class FXMLVentanaHistorialController{

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

        // Agregar etiquetas para los cursos
        VBox cursosVBox = new VBox();

        // Etiqueta para el primer curso
        Label curso1Nombre = new Label("Curso 1");
        Label curso1Id = new Label("1");
        Label curso1Estado = new Label("Activo");

        // Etiqueta para el segundo curso
        Label curso2Nombre = new Label("Curso 2");
        Label curso2Id = new Label("2");
        Label curso2Estado = new Label("Terminado");

        // Agregar las etiquetas al VBox
        cursosVBox.getChildren().addAll(curso1Nombre, curso1Id, curso1Estado,
                curso2Nombre, curso2Id, curso2Estado);

        // Agregar el VBox al PanelExpandible
        PanelExpandible.getChildren().add(cursosVBox);
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
