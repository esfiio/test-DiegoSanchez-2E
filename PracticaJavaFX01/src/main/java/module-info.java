module com.example.practicajavafx01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.practicajavafx01 to javafx.fxml;
    exports com.example.practicajavafx01;
}