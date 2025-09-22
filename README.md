# Hangman - A Simple Java Game

## Overview
Hangman is a simple console-based word guessing game implemented in Java. The game randomly selects a word from an extensive dictionary and challenges the player to guess it one letter at a time. Incorrect guesses progressively draw the hangman figure until the player either wins or loses.

---

## Features

- **Extensive Word List**: The `Dictionary.java` class contains 100 unique words, each with an associated clue.  
- **Random Selection**: Each round randomly selects a word and its clue from the dictionary.  
- **Console-Based Gameplay**: Play directly in your terminal or command prompt.  
- **Hangman Visuals**: ASCII art represents the Hangman figure as incorrect guesses accumulate.  

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed on your system.  

### Steps
1. Save the source files: Ensure `Main.java`, `Dictionary.java`, and any other classes (`gameRunner.java`, `drawFigure.java`) are in the same directory.  

2. Open your terminal and navigate to the directory containing the files.  

3. Compile the project:
```bash
javac Main.java Dictionary.java gameRunner.java drawFigure.java
