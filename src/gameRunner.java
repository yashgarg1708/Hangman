import java.util.ArrayList;
import java.util.Scanner;

public class gameRunner {
    public gameRunner(String word, String Clue) {

        ArrayList<Character> wordList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            wordList.add('_');
        }

        word = word.toUpperCase();

        Scanner scanner = new Scanner(System.in);

        int guesses = 0;

        while (true) {
            drawFigure.figureDisplay(guesses);
            System.out.println(" ");
            System.out.print("Word : ");
            for (char i : wordList) {
                System.out.print(i);
            }
            System.out.println("");
            System.out.println("CLUE : " + Clue);
            System.out.print("Enter Guess : ");

            char guess = scanner.next().charAt(0);
            guess = Character.toUpperCase(guess);
            if (word.contains(String.valueOf(guess))) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordList.set(i, guess);
                    }
                }
            } else {
                System.out.println("*****Wrong Guess*****");
                guesses++;
            }

            if (guesses == 6) {
                drawFigure.figureDisplay(6);
                System.out.println("************** YOU LOSE!! THE WORD WAS " + word + " *****************");

                break;
            }
            if (!wordList.contains('_')) {
                drawFigure.figureDisplay(guesses);
                System.out.println(" ");
                System.out.print("Word : ");
                for (char i : wordList) {
                    System.out.print(i);
                }
                System.out.println("********** YOU WIN!! *************** ");
                break;
            }


        }
    }

}
