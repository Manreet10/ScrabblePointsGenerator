package com.example.assignment3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.Map;

public class ScrabblePointsGeneratorController {

    @FXML
    private Button AlphaA;

    public Button getAlphaA() {
        return AlphaA;
    }

    public void setAlphaA(Button alphaA) {
        AlphaA = alphaA;
    }

    @FXML
    private Button AlphaB;

    public Button getAlphaB() {
        return AlphaB;
    }

    public void setAlphaB(Button alphaB) {
        AlphaB = alphaB;
    }

    @FXML
    private Button AlphaC;

    public Button getAlphaC() {
        return AlphaC;
    }

    public void setAlphaC(Button alphaC) {
        AlphaC = alphaC;
    }

    @FXML
    private Button AlphaD;

    public Button getAlphaD() {
        return AlphaD;
    }

    public void setAlphaD(Button alphaD) {
        AlphaD = alphaD;
    }

    @FXML
    private Button AlphaE;

    public Button getAlphaE() {
        return AlphaE;
    }

    public void setAlphaE(Button alphaE) {
        AlphaE = alphaE;
    }


    @FXML
    private Button AlphaF;

    public Button getAlphaF() {
        return AlphaF;
    }

    public void setAlphaF(Button alphaF) {
        AlphaF = alphaF;
    }

    @FXML
    private Button AlphaG;

    public Button getAlphaG() {
        return AlphaG;
    }

    public void setAlphaG(Button alphaG) {
        AlphaG = alphaG;
    }

    @FXML
    private Button AlphaH;

    public Button getAlphaH() {
        return AlphaH;
    }

    public void setAlphaH(Button alphaH) {
        AlphaH = alphaH;
    }

    @FXML
    private Button AlphaI;

    public Button getAlphaI() {
        return AlphaI;
    }

    public void setAlphaI(Button alphaI) {
        AlphaI = alphaI;
    }

    @FXML
    private Button AlphaJ;

    public Button getAlphaJ() {
        return AlphaJ;
    }

    public void setAlphaJ(Button alphaJ) {
        AlphaJ = alphaJ;
    }

    @FXML
    private Button AlphaK;

    public Button getAlphaK() {
        return AlphaK;
    }

    public void setAlphaK(Button alphaK) {
        AlphaK = alphaK;
    }

    @FXML
    private Button AlphaL;

    public Button getAlphaL() {
        return AlphaL;
    }

    public void setAlphaL(Button alphaL) {
        AlphaL = alphaL;
    }

    @FXML
    private Button AlphaM;

    public Button getAlphaM() {
        return AlphaM;
    }

    public void setAlphaM(Button alphaM) {
        AlphaM = alphaM;
    }

    @FXML
    private Button AlphaN;

    public Button getAlphaN() {
        return AlphaN;
    }

    public void setAlphaN(Button alphaN) {
        AlphaN = alphaN;
    }

    @FXML
    private Button AlphaP;

    public Button getAlphaP() {
        return AlphaP;
    }

    public void setAlphaP(Button alphaP) {
        AlphaP = alphaP;
    }

    @FXML
    private Button AlphaQ;

    public Button getAlphaQ() {
        return AlphaQ;
    }

    public void setAlphaQ(Button alphaQ) {
        AlphaQ = alphaQ;
    }

    @FXML
    private Button AlphaR;

    public Button getAlphaR() {
        return AlphaR;
    }

    public void setAlphaR(Button alphaR) {
        AlphaR = alphaR;
    }

    @FXML
    private Button AlphaS;

    public Button getAlphaS() {
        return AlphaS;
    }

    public void setAlphaS(Button alphaS) {
        AlphaS = alphaS;
    }

    @FXML
    private Button AlphaT;

    public Button getAlphaT() {
        return AlphaT;
    }

    public void setAlphaT(Button alphaT) {
        AlphaT = alphaT;
    }

    @FXML
    private Button AlphaU;

    public Button getAlphaU() {
        return AlphaU;
    }

    public void setAlphaU(Button alphaU) {
        AlphaU = alphaU;
    }

    @FXML
    private Button AlphaV;

    public Button getAlphaV() {
        return AlphaV;
    }

    public void setAlphaV(Button alphaV) {
        AlphaV = alphaV;
    }

    @FXML
    private Button AlphaW;

    public Button getAlphaW() {
        return AlphaW;
    }

    public void setAlphaW(Button alphaW) {
        AlphaW = alphaW;
    }

    @FXML
    private Button AlphaX;

    public Button getAlphaX() {
        return AlphaX;
    }

    public void setAlphaX(Button alphaX) {
        AlphaX = alphaX;
    }

    @FXML
    private Button AlphaY;

    public Button getAlphaY() {
        return AlphaY;
    }

    public void setAlphaY(Button alphaY) {
        AlphaY = alphaY;
    }

    @FXML
    private Button AlphaZ;

    public Button getAlphaZ() {
        return AlphaZ;
    }

    public void setAlphaZ(Button alphaZ) {
        AlphaZ = alphaZ;
    }

    @FXML
    private Button AlphaO;

    public Button getAlphaO() {
        return AlphaO;
    }

    public void setAlphaO(Button alphaO) {
        AlphaO = alphaO;
    }

    @FXML
    private TextField InputTextField;
    public TextField getInputTextField()
    {
        return InputTextField;
    }
    public void setInputTextField(TextField InputTextField)
    {
        InputTextField = InputTextField;
    }


    @FXML
    private ListView<String> PreviousWords;

    public ListView<String> getPreviousWords() {
        return PreviousWords;
    }

    public void setPreviousWords(ListView<String> previousWords) {
        PreviousWords = previousWords;
    }


    @FXML
    private Label Score;

    public Label getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score.setText(score);
    }

    @FXML
    private Label WordsA;

    public Label getWordsA() {
        return WordsA;
    }

    public void setWordsA(Label wordsA) {
        WordsA = wordsA;
    }

    @FXML
    private Label WordsB;

    public Label getWordsB() {
        return WordsB;
    }
    public void setWordsB(Label wordsB)
    {
        WordsB = WordsB;
    }

    @FXML
    private Label WordsC;

    public Label getWordsC() {
        return WordsC;
    }

    public void setWordsC(Label wordsC) {
        WordsC = wordsC;
    }

    @FXML
    private Label WordsD;

    public Label getWordsD() {
        return WordsD;
    }

    public void setWordsD(Label wordsD) {
        WordsD = wordsD;
    }

    @FXML
    private Label WordsE;

    public Label getWordsE() {
        return WordsE;
    }

    public void setWordsE(Label wordsE) {
        WordsE = wordsE;
    }

    @FXML
    private Label WordsF;

    public Label getWordsF() {
        return WordsF;
    }

    public void setWordsF(Label wordsF) {
        WordsF = wordsF;
    }

    @FXML
    private Label WordsG;

    public Label getWordsG() {
        return WordsG;
    }

    public void setWordsG(Label wordsG) {
        WordsG = wordsG;
    }

    @FXML
    private Label WordsH;

    public Label getWordsH() {
        return WordsH;
    }

    public void setWordsH(Label wordsH) {
        WordsH = wordsH;
    }

    @FXML
    private Label WordsI;

    public Label getWordsI() {
        return WordsI;
    }

    public void setWordsI(Label wordsI) {
        WordsI = wordsI;
    }

    @FXML
    private Label WordsJ;

    public Label getWordsJ() {
        return WordsJ;
    }

    public void setWordsJ(Label wordsJ) {
        WordsJ = wordsJ;
    }

    @FXML
    private Label WordsK;

    public Label getWordsK() {
        return WordsK;
    }

    public void setWordsK(Label wordsK) {
        WordsK = wordsK;
    }

    @FXML
    private Label WordsL;

    public Label getWordsL() {
        return WordsL;
    }

    public void setWordsL(Label wordsL) {
        WordsL = wordsL;
    }

    @FXML
    private Label WordsM;

    public Label getWordsM() {
        return WordsM;
    }

    public void setWordsM(Label wordsM) {
        WordsM = wordsM;
    }

    @FXML
    private Label WordsN;

    public Label getWordsN() {
        return WordsN;
    }

    public void setWordsN(Label wordsN) {
        WordsN = wordsN;
    }

    @FXML
    private Label WordsO;

    public Label getWordsO() {
        return WordsO;
    }

    public void setWordsO(Label wordsO) {
        WordsO = wordsO;
    }

    @FXML
    private Label WordsP;

    public Label getWordsP() {
        return WordsP;
    }

    public void setWordsP(Label wordsP) {
        WordsP = wordsP;
    }

    @FXML
    private Label WordsQ;

    public Label getWordsQ() {
        return WordsQ;
    }

    public void setWordsQ(Label wordsQ) {
        WordsQ = wordsQ;
    }

    @FXML
    private Label WordsR;

    public Label getWordsR() {
        return WordsR;
    }

    public void setWordsR(Label wordsR) {
        WordsR = wordsR;
    }

    @FXML
    private Label WordsS;

    public Label getWordsS() {
        return WordsS;
    }

    public void setWordsS(Label wordsS) {
        WordsS = wordsS;
    }

    @FXML
    private Label WordsT;

    public Label getWordsT() {
        return WordsT;
    }

    public void setWordsT(Label wordsT) {
        WordsT = wordsT;
    }

    @FXML
    private Label WordsU;

    public Label getWordsU() {
        return WordsU;
    }

    public void setWordsU(Label wordsU) {
        WordsU = wordsU;
    }

    @FXML
    private Label WordsV;

    public Label getWordsV() {
        return WordsV;
    }

    public void setWordsV(Label wordsV) {
        WordsV = wordsV;
    }

    @FXML
    private Label WordsW;

    public Label getWordsW() {
        return WordsW;
    }

    public void setWordsW(Label wordsW) {
        WordsW = wordsW;
    }

    @FXML
    private Label WordsX;

    public Label getWordsX() {
        return WordsX;
    }

    public void setWordsX(Label wordsX) {
        WordsX = wordsX;
    }

    @FXML
    private Label WordsY;

    public Label getWordsY() {
        return WordsY;
    }

    public void setWordsY(Label wordsY) {
        WordsY = wordsY;
    }

    @FXML
    private Label WordsZ;

    public Label getWordsZ() {
        return WordsZ;
    }

    public void setWordsZ(Label wordsZ) {
        WordsZ = wordsZ;
    }

    @FXML
    private AnchorPane rootPane;

    public void setRootPane(AnchorPane rootPane) {
        this.rootPane = rootPane;
    }

    public AnchorPane getRootPane() {
        return rootPane;
    }

    @FXML
    private Label invalidLabel;

    public Label getInvalidLabel() {
        return invalidLabel;
    }

    public void setInvalidLabel(String text) {
        invalidLabel.setText(text);
    }


    @FXML
    private Button submitword;

    public Button getSubmitword() {
        return submitword;
    }

    public void setSubmitword(Button submitword) {
        this.submitword = submitword;
    }

    private ScrabblePointsGenerator mainApp;

    private Map<Character, Integer > letterScores;
    public Map<Character, Integer> getLetterScores()
    {
        return letterScores;
    }

    public void setLetterScores(Map<Character, Integer> letterScores) {
        this.letterScores = letterScores;
    }

    private Map<Character, Integer > letterCount;
    public Map<Character, Integer> getLetterCount()
    {
        return letterCount;
    }

    public void setLetterCount(Map<Character, Integer> letterScores) {
        this.letterCount = letterCount;
    }

    private ObservableList<String> previousWordsList = FXCollections.observableArrayList();

    public ObservableList<String> getPreviousWordsList() {
        return previousWordsList;
    }

    public void setPreviousWordsList(ObservableList<String> previousWordsList) {
        this.previousWordsList = previousWordsList;
    }

    private int totalScore = 0;

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setMainApp(ScrabblePointsGenerator mainApp)
    {
        this.mainApp = mainApp;
    }

    @FXML
    public void initialize()
    {
        submitword.setOnAction(actionEvent -> mainApp.receiveWord());

    }




}
