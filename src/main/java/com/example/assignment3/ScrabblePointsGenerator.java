package com.example.assignment3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScrabblePointsGenerator extends Application {
    private ScrabblePointsGeneratorController controller;
    private Button[] alphaButtons;
    private String currentWord = "";

    private Map<Character, Integer> letterScores = new HashMap<>()
    {{
      put('A',1);
      put('B',3);
      put('C',3);
      put('D',2);
      put('E',1);
      put('F',4);
      put('G',2);
      put('H',4);
      put('I',1);
      put('J',8);
      put('K',5);
      put('L',1);
      put('M',3);
      put('N',1);
      put('O',1);
      put('P',3);
      put('Q',10);
      put('R',1);
      put('S',1);
      put('T',1);
      put('U',1);
      put('V',4);
      put('W',4);
      put('X',8);
      put('Y',4);
      put('Z',10);

    }};

    private Map<Character, Integer> letterCount = new HashMap<>()
    {{
        put('A',9);
        put('B',2);
        put('C',2);
        put('D',4);
        put('E',12);
        put('F',2);
        put('G',3);
        put('H',2);
        put('I',8);
        put('J',1);
        put('K',1);
        put('L',4);
        put('M',2);
        put('N',6);
        put('O',8);
        put('P',2);
        put('Q',1);
        put('R',6);
        put('S',4);
        put('T',6);
        put('U',4);
        put('V',2);
        put('W',2);
        put('X',1);
        put('Y',2);
        put('Z',1);

    }};

    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception{
        this.stage = stage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ScrabblePointsGenerator.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setTitle("Scrabble Points Generator");
        stage.setScene(scene);
        stage.show();
        

        controller = loader.getController();

        controller.setMainApp(this);


        // collection to button to implement onActionEvent on all the buttons
        Button[] alphaButtons = {controller.getAlphaA(),controller.getAlphaB(),controller.getAlphaC(), controller.getAlphaD(),
                controller.getAlphaE(), controller.getAlphaF(),controller.getAlphaG(),controller.getAlphaH(),
                controller.getAlphaI(), controller.getAlphaJ(), controller.getAlphaK(), controller.getAlphaL(),
                controller.getAlphaM(), controller.getAlphaN(), controller.getAlphaO(), controller.getAlphaP(),
                controller.getAlphaQ(), controller.getAlphaR(), controller.getAlphaS(), controller.getAlphaT(),
                controller.getAlphaU(),controller.getAlphaV(),controller.getAlphaW(), controller.getAlphaX(),
                controller.getAlphaY(), controller.getAlphaZ()};

        //loop for implementing onAction that adds letter to input field when alphabet letter button is clicked
       for (Button button : alphaButtons)
       {

            button.setOnAction(event -> {
                String letter = button.getText();
                currentWord += letter;
                controller.getInputTextField().setText(currentWord);
            });
        }


       controller.setLetterScores(letterScores);
       controller.getLetterScores().putAll(letterScores);
       controller.getPreviousWords().setItems(controller.getPreviousWordsList());


    }

    public static void main(String[] args) {
        launch(args);
    }

    // receiveWord receives the word and implements process word method if the word is valid, else displays an error message
    public void receiveWord() {
        String wordR = controller.getInputTextField().getText();

        //changes word to uppercase for regularity
        String word = wordR.toUpperCase();

        //processes word if valid
        if(isValidWord(word))
        {
            controller.setInvalidLabel("");

            //adds word to a list of previous words that has all the  words submitted
            controller.getPreviousWordsList().add(word);

            // Reset input text field
            controller.getInputTextField().setText("");

            // Reset currentWord variable
            currentWord = "";

            //processes the word
            processWord(word);

        }
        else
        {
            //displays invalid word message
            controller.setInvalidLabel("Invalid Word");

            // Reset input text field
            controller.getInputTextField().setText("");

            // Reset currentWord variable
            currentWord = "";
        }

    }

    // checks the validity based on different criteria
    public boolean isValidWord(String word)
    {
        // check length to be min 2 and max 8
        if(word.length() < 2 || word.length() > 8)
        {
            return false;
        }

        // check if the word has a vowel
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for(int i = 0; i < word.length(); i++)
        {
            char l = word.charAt(i);
            if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U' )
            {
                hasVowel = true;
            }
            else
            {
                hasConsonant = true;
            }

            // if there is letter count left
            if(letterCount.get(Character.toUpperCase(l)) == 0 || letterCount.get(Character.toUpperCase(l)) < 0 )
            {
                return false;
            }
        }

        // invalid if no vowel is present
        if(!hasVowel)
        {
            return false;
        }

        // check the word in the previous word record , if present, its invalid
        List<String> previousWords = controller.getPreviousWordsList();
        if(previousWords.contains(word)) {
            return false;
        }

        return true;
    }

    // processWord method does calculate score, update word count,
    public void processWord(String word)
    {

        calculateScore(word);
        String previousWordsText = String.join(", ", controller.getPreviousWordsList());
        controller.getPreviousWords().setItems(FXCollections.observableArrayList(previousWordsText));

        // update count in letterCount
        for (char c : word.toCharArray())
        {
            char upperChar = Character.toUpperCase(c);
            if (letterCount.containsKey(upperChar))
            {
                int count = letterCount.get(upperChar);
                if(count > 0)
                {
                    letterCount.put(upperChar, count - 1);
                }

                else
                {
                    letterCount.put(upperChar,0);
                }
            }
        }


        // reset word label using function
        resetWordLabels(letterCount,stage.getScene());

        if (isGameOver()) {
            displayGameOver();
        }

    }

    //reset word labels
    public void resetWordLabels(Map<Character, Integer> letterCount, Scene scene)
    {

        //lookup for label with fx:id WordsA,WordsB .. and buttons with fx:id AlphaA, AlphaB, .. and get letter count and set to the label in letterCount
        for (char c = 'A'; c <= 'Z'; c++) {
            String labelName = "Words" + c;
            Label label = (Label) scene.lookup("#" + labelName);
            String buttonName = "Alpha" + c;
            Button button = (Button) scene.lookup("#" + buttonName);
            int count = letterCount.get(Character.toUpperCase(c));
            label.setText(String.valueOf(count));

            // if count is 0, disable the letter and grey it out
            if(count == 0 || count < 0)
            {
                button.setDisable(true);
                button.setStyle("-fx-opacity: 0.5;");
            }

            else
            {
                button.setDisable(false);
            }
        }
    }



    //calculate score based on points in the letterScore map
    public void calculateScore(String word)
    {
        int totalScore = controller.getTotalScore();

        //calculate score
        int score = 0;
        Map<Character, Integer> letterScores = controller.getLetterScores();

        //get points for each char and keep adding it to total
        for(char c: word.toCharArray())
        {
            char upperChar = Character.toUpperCase(c);
            if(letterScores.containsKey(upperChar))
            {
                score += letterScores.get(upperChar);
            }

        }

        //keep adding to the previous score

        totalScore += score;

        controller.setTotalScore(totalScore);

        controller.setScore(Integer.toString(totalScore));
    }

    // if number of letters left in the bag is less than 2 with no vowels left, there will be no valid word formed
    public boolean isGameOver()
    {
        int totalLetterCount = 0;
        int vowelLetterCount = 0;

        for(char c = 'A'; c <= 'Z'; c++)
        {
            int count = letterCount.get(Character.toUpperCase(c));
            totalLetterCount += count;
            if(isVowel(c))
            {
                vowelLetterCount += count;
            }
        }

        return totalLetterCount == 1 || (totalLetterCount ==0 && vowelLetterCount ==0) || vowelLetterCount == 0 || (totalLetterCount == 1 && vowelLetterCount == 0) ;

    }

    // adds to the vowel count, if any char is a vowel
    public boolean isVowel(char c)
    {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    // display game over message if gameOver is true
    public void displayGameOver()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Over");
        alert.setHeaderText("No more possible valid words to enter.");
        alert.showAndWait();
    }

}
