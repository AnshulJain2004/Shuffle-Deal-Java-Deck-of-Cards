import java.util.Scanner;

// This is the main class of the program.
public class Main {
    // The main method, where the execution of the program starts.
    public static void main(String[] args) {
        // Create an instance of the Deck class to work with a deck of cards.
        Deck deck = new Deck();

        // Call the createDeck method to initialize the deck with cards.
        deck.createDeck();

        // Call the displayMenu method to show the menu options to the user.
        deck.displayMenu();
    }
}