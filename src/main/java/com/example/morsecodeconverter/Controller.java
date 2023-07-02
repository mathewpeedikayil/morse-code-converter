package com.example.morsecodeconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import java.util.HashMap;

public class Controller {

    private String englishText;
    private HashMap<Character, String> map = new HashMap<>();

    @FXML
    private TextArea englishInput;

    @FXML
    private TextArea morseOutput;

    @FXML
    private Button playSoundButton;

    public Controller() {
        map.put('A', ".-");
        map.put('B', "-…");
        map.put('C', "-.-.");
        map.put('D' , "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "–.");
        map.put('H', "….");
        map.put('I', "..");
        map.put('J', ".—");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "–");
        map.put('N', "-.");
        map.put('O', "—");
        map.put('P', ".–.");
        map.put('Q', "–.-");
        map.put('R', ".-.");
        map.put('S', "…");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "…-");
        map.put('W', ".–");
        map.put('X', "-..-");
        map.put('Y', "-.–");
        map.put('Z', "–..");
    }

    @FXML
    void displayMorseCodeWhenKeyReleased(KeyEvent event) {
        englishText = englishInput.getText();

    }

    @FXML
    void playMorseCodeSoundWhenButtonClicked(MouseEvent event) {

    }

}

