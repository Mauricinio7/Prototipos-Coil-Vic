module com.example.prototiposcoilvic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prototiposcoilvic to javafx.fxml;
    exports com.example.prototiposcoilvic;
}