/**
 * Main.java
 * Created on 02/07/2023
 * Last modified on 03/07/2023
 * No copyright
 * This class represents the main GUI.
 * Version History: 1.0 - only pure code; 2.0 - comments added.
 *
 * @author Mathew Philip Peedikayil
 * @version 2.0
 */

package com.example.morsecodeconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Morse Code Converter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

// References
// https://capitalizemytitle.com/morse-code-translator/
// https://commons.wikimedia.org/wiki/Category:Audio_files_of_Morse_code_-_alphabet2