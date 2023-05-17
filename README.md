# ScrabblePointsGenerator - JavaFX application

## Introduction
The application will allow the user to TYPE in a word and it will calculate how many points that word is using the scrabble point system.
The application will also decrease the letter counter when the user has entered a word. For example, there are 9 “A” letters in the bag in scrabble. If the user enters the words “ha” and “able”, he or she has only 7 “A” letter remaining.
The Total Points area will run a running total
The grid of letters will display the point values for each letter (please put 26 instead of 10). Also note that the point values are NOT according to Scrabble rules.
The Submit Word button will determine if word is valid.
The Previous Words section will store previous words.


## Requirements
This application follows the following requirements:
The restrictions for valid words are as follows:

• Two letters minimum

• One letter must be vowel

• A, E, I, O, U or Y

• 8 letters maximum

• Cannot have duplicate words

Submit button initializes processing
History to Previous Words is kept as any data structure desired

User can type using keyboard to submit a word

User can click on GUI letter to submit a word

Previous Words node displays valid previous words in format “Word1, Word2” (notice the commas in-between words and no trailing comma)

Counter of Letters remaining “in bag” is accurate according to the chart

Letter is either greyed out, disabled or disappears when no more remaining

Error message is displayed when user clicks Submit Word and

  • Word is too short (only 1 character)

  • Word does not include vowel
  
  • Word is blank
  
  • Word is too long (more than 8 characters) 
  
  • Word contains letter that is no longer available “in bag”

Error message disappears when error is corrected

Message of “Game Over” displayed when they are no possible valid words to enter
  
  • only one letter remaining in bag
  
  • only consonants remaining in bagHistory of Previous Words
