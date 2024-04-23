// This class represents a playing card.
public class Card {
    // Arrays to hold the possible suits and ranks of cards.
    public static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    public static final String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    // Instance variables to store the rank and suit of the card.
    private int rank;
    private String suit;

    // Constructor to create a card with a given rank and suit.
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Getter method to retrieve the rank of the card.
    public int getRank() {
        return rank;
    }

    // Getter method to retrieve the suit of the card.
    public String getSuit() {
        return suit;
    }

    // Method to represent the card as a string, e.g., "Ace of Hearts".
    public String toString() {
        return ranks[rank - 1] + " of " + suit;
    }

    // Method to compare the current card with another card based on rank and suit.
    // Returns a negative integer, zero, or a positive integer if this card is less than, equal to,
    // or greater than the specified card.
    public int compareTo(Card other) {
        if (this.rank != other.rank) {
            return Integer.compare(this.rank, other.rank);
        } else {
            return this.suit.compareTo(other.suit);
        }
    }

    // Method to check if the current card is equal to another object.
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card other = (Card) obj;
        return rank == other.rank && suit.equals(other.suit);
    }
}