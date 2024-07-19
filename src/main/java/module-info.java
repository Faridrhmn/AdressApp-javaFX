module id.dojo.addressapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens id.dojo.addressapp to javafx.fxml;
    exports id.dojo.addressapp;
}