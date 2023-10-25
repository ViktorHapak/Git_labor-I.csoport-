module com.example.git_labor_icsoport {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires mysql.connector.j;
    requires fontawesomefx;

    opens com.example.git_labor_icsoport to javafx.fxml;
    exports com.example.git_labor_icsoport;
}