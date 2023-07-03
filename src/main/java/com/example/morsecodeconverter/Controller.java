/**
 * Controller.java
 * Created on 02/07/2023
 * Last modified on 03/07/2023
 * No copyright
 * This class represents all the functionality.
 * Version History: 1.0 - only pure code; 2.0 - comments added.
 *
 * @author Mathew Philip Peedikayil
 * @version 2.0
 */

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
import java.util.List;

public class Controller {

    private HashMap<String, String> map = new HashMap<>();
    private List<MediaPlayer> mediaPlayers = new ArrayList<>();
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
        // alphabets
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

        // morse code
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
        morsecodeAToZ.add(" / ");

        // audio
        audioFilePaths.add("/audio/Morse-A.mp3");
        audioFilePaths.add("/audio/Morse-B.mp3");
        audioFilePaths.add("/audio/Morse-C.mp3");
        audioFilePaths.add("/audio/Morse-D.mp3");
        audioFilePaths.add("/audio/Morse-E.mp3");
        audioFilePaths.add("/audio/Morse-F.mp3");
        audioFilePaths.add("/audio/Morse-G.mp3");
        audioFilePaths.add("/audio/Morse-H.mp3");
        audioFilePaths.add("/audio/Morse-I.mp3");
        audioFilePaths.add("/audio/Morse-J.mp3");
        audioFilePaths.add("/audio/Morse-K.mp3");
        audioFilePaths.add("/audio/Morse-L.mp3");
        audioFilePaths.add("/audio/Morse-M.mp3");
        audioFilePaths.add("/audio/Morse-N.mp3");
        audioFilePaths.add("/audio/Morse-O.mp3");
        audioFilePaths.add("/audio/Morse-P.mp3");
        audioFilePaths.add("/audio/Morse-Q.mp3");
        audioFilePaths.add("/audio/Morse-R.mp3");
        audioFilePaths.add("/audio/Morse-S.mp3");
        audioFilePaths.add("/audio/Morse-T.mp3");
        audioFilePaths.add("/audio/Morse-U.mp3");
        audioFilePaths.add("/audio/Morse-V.mp3");
        audioFilePaths.add("/audio/Morse-W.mp3");
        audioFilePaths.add("/audio/Morse-X.mp3");
        audioFilePaths.add("/audio/Morse-Y.mp3");
        audioFilePaths.add("/audio/Morse-Z.mp3");
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
        playAudioFilesSequentially(0);
    }

    private void playAudioFilesSequentially(int index) {
        String temp = englishInput.getText();
        temp = temp.replaceAll("\\s+",""); // removed space as no audio file for space
        letters = temp.split("");

        if (index < letters.length) {
            String fileName = audioFilePaths.get(alphabetsAToZ.indexOf(letters[index]));
            String path = getClass().getResource(fileName).getPath();
            System.out.println(new File(path).toURI());
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);

            mediaPlayer.setOnEndOfMedia(() -> {
                mediaPlayer.stop();
                mediaPlayer.dispose();
                playAudioFilesSequentially(index + 1); // play next audio file after the current one finishes
            });

            mediaPlayers.add(mediaPlayer); // store MediaPlayer instance in the list
            mediaPlayer.play();
        }
    }

}