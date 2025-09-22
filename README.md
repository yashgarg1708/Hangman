# Hangman
A simple Hangman game in JAVA.

Features
Extensive Word List: A Dictionary.java class contains 100 unique words, each with an associated clue.

Random Selection: The game randomly selects a word and clue from the dictionary for each new round.

Console-Based: All gameplay is handled directly in the command line interface.

How to Run
To run this project, you need to have the Java Development Kit (JDK) installed on your system.

Save the files: Ensure that both Main.java and Dictionary.java are in the same directory.

Compile the code: Open your terminal or command prompt, navigate to the directory where you saved the files, and compile them using the Java compiler.

javac Main.java Dictionary.java

Run the game: After a successful compilation, run the main class.

java Main

Current State
The current version of the code is set up as a foundation for the full game. It successfully starts a new game loop, selects a random word and clue from the Dictionary class, and displays them. The game loop will continue until you press 'Q' to quit.

Next Steps
To make this a fully functional game, you can add the following features:

Game Logic: Implement a gameRunner class or add the logic to the Main class to handle the core gameplay. This would include:

Displaying a hidden word (e.g., _ _ _ _).

Taking letter guesses from the user.

Checking if the guessed letter is in the word.

Tracking the number of incorrect guesses and updating the Hangman visual.

Ending the game when the word is guessed or the user runs out of guesses.

Visuals: Add ASCII art to represent the Hangman figure as the user makes incorrect guesses.

Feel free to expand on this project and add new features to make it your own!
