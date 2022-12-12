import java.util.Scanner;
import java.lang.*;
public class Hangman {
    private static Scanner scr = new Scanner(System.in);
    private static String word = scr.nextLine();
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    static hangmanImage newHang = new hangmanImage(count, word);

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
            newHang.hangmanActualImage(count);
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
        return newasterisk;
    }


}
