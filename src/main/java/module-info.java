module com.example.morsecodeconverter {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.morsecodeconverter to javafx.fxml;
    exports com.example.morsecodeconverter;
}