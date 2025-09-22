import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("***********************************************************************");
        System.out.println("                        WELCOME TO HANGMAN");
        System.out.println("***********************************************************************");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int randomIndex = (int) (Math.random() * Dictionary.words.size());

            String word = Dictionary.words.get(randomIndex);
            String Clue = Dictionary.clues.get(randomIndex);
            new gameRunner(word, Clue);
            System.out.println("Press any key to continue...");
            System.out.print("Press Q to quit...");
            String input = scanner.nextLine();  // read entire line
            if (input.length() > 0) {
                char ch = Character.toLowerCase(input.charAt(0));
                if (ch == 'q') {
                    break;
                }
            }

        }

    }


}




