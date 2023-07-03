package com.example.morsecodeconverter;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.scene.media.Media;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

    private HashMap<String, String> map = new HashMap<>();
    private ArrayList<String> alphabetsAToZ = new ArrayList<>();
    private ArrayList<String> morsecodeAToZ = new ArrayList<>();
    private ArrayList<String> audioFilePaths = new ArrayList<>();
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

        audioFilePaths.add("audio/Morse-A.ogg");
        audioFilePaths.add("audio/Morse-B.ogg");
        audioFilePaths.add("audio/Morse-C.ogg");
        audioFilePaths.add("audio/Morse-D.ogg");
        audioFilePaths.add("audio/Morse-E.ogg");
        audioFilePaths.add("audio/Morse-F.ogg");
        audioFilePaths.add("audio/Morse-G.ogg");
        audioFilePaths.add("audio/Morse-H.ogg");
        audioFilePaths.add("audio/Morse-I.ogg");
        audioFilePaths.add("audio/Morse-J.ogg");
        audioFilePaths.add("audio/Morse-K.ogg");
        audioFilePaths.add("audio/Morse-L.ogg");
        audioFilePaths.add("audio/Morse-M.ogg");
        audioFilePaths.add("audio/Morse-N.ogg");
        audioFilePaths.add("audio/Morse-O.ogg");
        audioFilePaths.add("audio/Morse-P.ogg");
        audioFilePaths.add("audio/Morse-Q.ogg");
        audioFilePaths.add("audio/Morse-R.ogg");
        audioFilePaths.add("audio/Morse-S.ogg");
        audioFilePaths.add("audio/Morse-T.ogg");
        audioFilePaths.add("audio/Morse-U.ogg");
        audioFilePaths.add("audio/Morse-V.ogg");
        audioFilePaths.add("audio/Morse-W.ogg");
        audioFilePaths.add("audio/Morse-X.ogg");
        audioFilePaths.add("audio/Morse-Y.ogg");
        audioFilePaths.add("audio/Morse-Z.ogg");
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
//        for(int j = 0; j < letters.length; j++) {
//            String fileName = audioFilePaths.get(alphabetsAToZ.indexOf(letters[j]));
//            URL resourceURL = getClass().getResource(fileName);
//            String path = resourceURL.toString();
//            System.out.println(path);
//            Media media = new Media(path);
//            MediaPlayer mediaPlayer = new MediaPlayer(media);
//            mediaPlayer.play();
//        }

        String fileName = "/audio/Morse-A.ogg";
        String path = getClass().getResource(fileName).getPath();
        System.out.println(new File(path).toURI().toString());
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

}