import java.util.Vector;
import java.util.Collections;
import java.util.Scanner;

// This class represents a deck of cards.
public class Deck {
    // Private field to hold the deck of cards as a Vector.
    private Vector<Card> Deck;

    // Constructor to initialize the deck with a capacity of 52 cards.
    public Deck() {
        Deck = new Vector<>(52);
    }

    // Method to create a standard deck of 52 cards.
    public void createDeck() {
        for (int rank = 1; rank <= 13; rank++) {
            for (String suit : Card.suits) {
                Card card = new Card(rank, suit);
                Deck.add(card);
            }
        }
    }

    // Method to display the menu and handle user choices.
    public void displayMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            // Display the menu options to the user.
            System.out.println("***************************\n");
            System.out.println("1. Display the deck of cards");
            System.out.println("2. Shuffle the deck of cards");
            System.out.println("3. Draw a card from the deck");
            System.out.println("4. Empty the deck");
            System.out.println("5. Print a card from the deck");
            System.out.println("6. Compare two cards");
            System.out.println("7. Check if two cards are the same");
            System.out.println("8. Find a card by rank and suit");
            System.out.println("9. Deal a hand of cards");
            System.out.println("10. Quit");
            // Get user choice.
            System.out.print("Enter your choice (1-10): ");
            int choice = input.nextInt();

            System.out.println("***************************\n");

            // Handle user choice using a switch statement.
            switch (choice) {
                case 1:
                    printDeck();
                    break;
                case 2:
                    shuffleDeck();
                    break;
                case 3:
                    drawCard();
                    break;
                case 4:
                    emptyDeck();
                    break;
                case 5:
                    printCard();
                    break;
                case 6:
                    compareCard();
                    break;
                case 7:
                    sameCard();
                    break;
                case 8:
                    findCard();
                    break;
                case 9:
                    dealHand();
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Method to print all cards in the deck.
    private void printDeck() {
        for (Card card : Deck) {
            System.out.println(card);
        }
    }

    // Method to shuffle the deck.
    private void shuffleDeck() {
        Collections.shuffle(Deck);
        System.out.println("Deck shuffled.");
    }

    // Method to draw a card from the deck.
    private void drawCard() {
        if (!Deck.isEmpty()) {
            Card drawnCard = Deck.remove(Deck.size() - 1);
            System.out.println("Drawn card: " + drawnCard);
        } else {
            System.out.println("Deck is empty. Cannot draw a card.");
        }
    }

    // Method to empty the deck.
    private void emptyDeck() {
        Deck.clear();
        System.out.println("Deck emptied.");
    }

    // Method to print a card from the deck based on index.
    private void printCard() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index of the card to print (0-" + (Deck.size() - 1) + "): ");
        int index = input.nextInt();
        if (index >= 0 && index < Deck.size()) {
            System.out.println(Deck.get(index));
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }

    // Method to compare two cards in the deck.
    private void compareCard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the indices of two cards to compare (0-" + (Deck.size() - 1) + "): ");
        System.out.print("Index of first card: ");
        int index1 = input.nextInt();
        System.out.print("Index of second card: ");
        int index2 = input.nextInt();

        if (index1 >= 0 && index1 < Deck.size() && index2 >= 0 && index2 < Deck.size()) {
            Card card1 = Deck.get(index1);
            Card card2 = Deck.get(index2);
            int comparison = card1.compareTo(card2);
            if (comparison < 0) {
                System.out.println(card1 + " comes before " + card2);
            } else if (comparison > 0) {
                System.out.println(card1 + " comes after " + card2);
            } else {
                System.out.println(card1 + " is the same as " + card2);
            }
        } else {
            System.out.println("Invalid indices. Please try again.");
        }
    }

    // Method to check if two cards in the deck are the same.
    private void sameCard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the indices of two cards to check if they are the same (0-" + (Deck.size() - 1) + "): ");
        System.out.print("Index of first card: ");
        int index1 = input.nextInt();
        System.out.print("Index of second card: ");
        int index2 = input.nextInt();

        if (index1 >= 0 && index1 < Deck.size() && index2 >= 0 && index2 < Deck.size()) {
            Card card1 = Deck.get(index1);
            Card card2 = Deck.get(index2);
            if (card1.equals(card2)) {
                System.out.println("The two cards are the same.");
            } else {
                System.out.println("The two cards are different.");
            }
        } else {
            System.out.println("Invalid indices. Please try again.");
        }
    }

    // Method to find a card in the deck by rank and suit.
    private void findCard() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rank of the card (1-13): ");
        int rank = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter the suit of the card (Hearts, Diamonds, Clubs, Spades): ");
        String suit = input.nextLine();

        Card targetCard = new Card(rank, suit);
        int index = Deck.indexOf(targetCard);
        if (index != -1) {
            System.out.println("Card found at index: " + index);
        } else {
            System.out.println("Card not found in the deck.");
        }
    }

    // Method to deal a hand of 5 random cards from the deck.
    private void dealHand() {
        if (Deck.size() >= 5) {
            System.out.println("Dealing 5 random cards:");
            for (int i = 0; i < 5; i++) {
                int randomIndex = (int) (Math.random() * Deck.size());
                Card card = Deck.remove(randomIndex);
                System.out.println(card);
            }
        } else {
            System.out.println("Not enough cards in the deck to deal a hand.");
        }
    }
}