package com.example.morsecodeconverter;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    private HashMap<String, String> map = new HashMap<>();
    private ArrayList<String> alphabetsAToZ = new ArrayList<>();
    private ArrayList<String> morsecodeAToZ = new ArrayList<>();
    private String[] letters;
    private String englishToMorse;

    @FXML
    private TextArea englishInput;
    @FXML
    private Text morseOutput;

    public Controller() {
        alphabetsAToZ.add("A");
        alphabetsAToZ.add("B");
        alphabetsAToZ.add("C");
        alphabetsAToZ.add("D");
        alphabetsAToZ.add("E");
        alphabetsAToZ.add("F");
        alphabetsAToZ.add("G");
        alphabetsAToZ.add("H");
        alphabetsAToZ.add("I");
        alphabetsAToZ.add("J");
        alphabetsAToZ.add("K");
        alphabetsAToZ.add("L");
        alphabetsAToZ.add("M");
        alphabetsAToZ.add("N");
        alphabetsAToZ.add("O");
        alphabetsAToZ.add("P");
        alphabetsAToZ.add("Q");
        alphabetsAToZ.add("R");
        alphabetsAToZ.add("S");
        alphabetsAToZ.add("T");
        alphabetsAToZ.add("U");
        alphabetsAToZ.add("V");
        alphabetsAToZ.add("W");
        alphabetsAToZ.add("X");
        alphabetsAToZ.add("Y");
        alphabetsAToZ.add("Z");
        alphabetsAToZ.add(".");
        alphabetsAToZ.add(" ");

        morsecodeAToZ.add(".-");
        morsecodeAToZ.add("-...");
        morsecodeAToZ.add("-.-.");
        morsecodeAToZ.add("-..");
        morsecodeAToZ.add(".");
        morsecodeAToZ.add("..-.");
        morsecodeAToZ.add("–.");
        morsecodeAToZ.add("....");
        morsecodeAToZ.add("..");
        morsecodeAToZ.add(".—");
        morsecodeAToZ.add("-.-");
        morsecodeAToZ.add(".-..");
        morsecodeAToZ.add("–");
        morsecodeAToZ.add("-.");
        morsecodeAToZ.add("—");
        morsecodeAToZ.add(".–.");
        morsecodeAToZ.add("–.-");
        morsecodeAToZ.add(".-.");
        morsecodeAToZ.add("…");
        morsecodeAToZ.add("-");
        morsecodeAToZ.add("..-");
        morsecodeAToZ.add("...-");
        morsecodeAToZ.add(".–");
        morsecodeAToZ.add("-..-");
        morsecodeAToZ.add("-.–");
        morsecodeAToZ.add("–..");
        morsecodeAToZ.add(".-.-.-");
        morsecodeAToZ.add(" ");
    }

    @FXML
    void displayMorseCodeWhenButtonClicked(MouseEvent event) {
        englishToMorse = "";
        letters = englishInput.getText().split("");
        for(int i = 0; i < letters.length; i++) {
            englishToMorse += morsecodeAToZ.get(alphabetsAToZ.indexOf(letters[i]));
        }
        morseOutput.setText(englishToMorse);
    }

    @FXML
    void playMorseCodeSoundWhenButtonClicked(MouseEvent event) {

    }

}