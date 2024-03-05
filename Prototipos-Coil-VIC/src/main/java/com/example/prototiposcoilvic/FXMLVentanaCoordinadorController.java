package com.example.prototiposcoilvic;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        Label label1 = new Label("Inicio");
        label1.setLayoutX(75);
        label1.setLayoutY(40);
        PanelExpandible.getChildren().add(label1);
        label1.setStyle("-fx-text-fill: white;");

        Label label2 = new Label("Nueva\nColaboracion");
        label2.setLayoutX(75);
        label2.setLayoutY(90);
        PanelExpandible.getChildren().add(label2);
        label2.setStyle("-fx-text-fill: white;");

        Label label3 = new Label("Mi\nColaboracion");
        label3.setLayoutX(75);
        label3.setLayoutY(155);
        PanelExpandible.getChildren().add(label3);
        label3.setStyle("-fx-text-fill: white;");

        Label label4 = new Label("Mi\nConsulta");
        label4.setLayoutX(75);
        label4.setLayoutY(210);
        PanelExpandible.getChildren().add(label4);
        label4.setStyle("-fx-text-fill: white");
    }

    @FXML
    public void contraerPanel() {
        // Contraer el panel
        PanelExpandible.setPrefWidth(79);

        PanelExpandible.getChildren().removeIf(node -> node instanceof Label);
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

