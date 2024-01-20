module com.example.catastrophemaisgraphique {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires pokeapi;
    //V important sinon exception
    requires java.sql;

    opens com.example.pokegen to javafx.fxml;
    exports com.example.pokegen;
}