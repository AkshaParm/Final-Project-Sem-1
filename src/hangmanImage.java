public class hangmanImage {

    public int count;
    public String word;

    public hangmanImage(int count, String word)
    {
        this.count = count;
        this.word = word;
    }
    public void hangmanActualImage(int count) {
        //completely uneccessary but gives a decription of the journey of the hangman
        if (count == 1) {
            System.out.println("Letter not in word: Try again\nthe materials for the hanging stand have been collected");
        }
        if (count == 2) {
            System.out.println("Letter not in word: Try again\nthe hanging stand has been made");
        }
        if (count == 3) {
            System.out.println("Letter not in word: Try again\nthe person is walking up to the noose");
        }
        if (count == 4) {
            System.out.println("Letter not in word: Try again\nthe person has the noose around their neck");
        }
        if (count == 5) {
            System.out.println("Letter not in word: Try again\nthe person is pleading with the crowd");
        }
        if (count == 6) {
            System.out.println("Letter not in word: Try again\nthe person is saying their last wishes");
        }
        if (count == 7) {
            System.out.println("GAME OVER!\nthe person was hung\n The word was " + word);
        }
    }
}
