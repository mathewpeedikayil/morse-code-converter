module com.example.morsecodeconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morsecodeconverter to javafx.fxml;
    exports com.example.morsecodeconverter;
}