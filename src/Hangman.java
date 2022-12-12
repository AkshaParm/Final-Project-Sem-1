import java.util.Scanner;
import java.lang.*;
public class Hangman {
    private static Scanner scr = new Scanner(System.in);
    private static String word = scr.nextLine();
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sets limit to 7 guesses
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            System.out.println(hang(guess));
        }
        sc.close();
    }

    public static String hang(String guess) {
        String newasterisk = "";
        //checks whether the guessed letter is in the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }
        //returns different results based on whether the guess was correct or not
        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage(count);
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
        return newasterisk;
    }

    public static String hangmanImage(int input) {
        //completely uneccessary but gives a fun picture of a hangman
        if (count == 1) {
            System.out.println("Letter not in word: Try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Letter not in word: Try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Letter not in word: Try again");
            System.out.println("   __________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Letter not in word: Try again");
            System.out.println("   __________");
            System.out.println("   |        _|_");
            System.out.println("   |       /   \\");
            System.out.println("   |      |     |");
            System.out.println("   |       \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Letter not in word: Try again");
            System.out.println("   __________");
            System.out.println("   |        _|_");
            System.out.println("   |       /   \\");
            System.out.println("   |      |     |");
            System.out.println("   |       \\_ _/");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Letter not in word: Try again");
            System.out.println("   __________");
            System.out.println("   |        _|_");
            System.out.println("   |       /   \\");
            System.out.println("   |      |     |");
            System.out.println("   |       \\_ _/");
            System.out.println("   |         |");
            System.out.println("   |         |");
            System.out.println("   |        / \\ ");
            System.out.println("___|___    /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   __________");
            System.out.println("   |        _|_");
            System.out.println("   |       /   \\");
            System.out.println("   |      |     |");
            System.out.println("   |       \\_ _/");
            System.out.println("   |        _|_");
            System.out.println("   |       / | \\");
            System.out.println("   |        / \\ ");
            System.out.println("___|___    /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
        return null;
    }
}
