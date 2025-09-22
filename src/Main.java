import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



        System.out.println("***********************************************************************");
        System.out.println("                        WELCOME TO HANGMAN");
        System.out.println("***********************************************************************");


        String word ="PIZZA";
        word= word.toUpperCase();
        String Clue =" clue for word";

        ArrayList<Character> wordList = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            wordList.add('_');
        }

        Scanner scanner =new Scanner(System.in);

        int guesses =0;

        while(true) {
            figureDisplay(guesses);
            System.out.println(" ");
            System.out.print("Word : ");
            for(char i: wordList){
                System.out.print(i);
            }
            System.out.println("");
            System.out.println("CLUE : "+ Clue);
            System.out.print("Enter Guess : ");

            char guess=scanner.next().charAt(0);
            guess=Character.toUpperCase(guess);
            if(word.contains(String.valueOf(guess))){
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i)==guess){
                        wordList.set(i,guess);
                    }
                }
            }
            else{
                System.out.println("*****Wrong Guess*****");
                guesses++;
            }

            if(guesses==6){
                figureDisplay(6);
                System.out.println("YOU LOSE!! ");
                break;
            }
            if(!wordList.contains('_')){
                System.out.println("YOU WIN!! ");
                break;
            }



    }

        scanner.close();

    }


   static void figureDisplay(int i) {
        switch (i) {
            case 0:
                System.out.println(
                "  +---+\n" +
                        "  |   |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "========="
                );
                break;
            case 1:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 2:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "  |   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 3:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 4:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 5:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " /    |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 6:
                System.out.println(
                        "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " / \\  |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            default:
                System.out.println("Invalid state!");
        }
    }
}


