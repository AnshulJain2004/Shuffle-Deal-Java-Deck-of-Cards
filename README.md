# Shuffle & Deal: Java Deck of Cards

A simple Java console application that creates, shuffles, and deals a standard deck of cards. This project demonstrates fundamental concepts of object-oriented programming in Java, including class design, inheritance, and collection manipulation.

## Features
- **Create a standard 52-card deck** (Ranks: Ace to King, Suits: Hearts, Diamonds, Clubs, Spades).
- **Shuffle the deck** using built-in Java collection utilities.
- **Draw cards** from the deck, removing them once drawn.
- **Compare and check equality** between two cards (by rank and suit).
- **Deal a 5-card hand** randomly.
- **Menu-driven** console interface for easy interaction.

## Project Structure
- **`Card.java`**  
  Defines a single playing card with rank and suit, and includes methods for comparison and equality checks.

- **`Deck.java`**  
  Manages a collection of `Card` objects using a `Vector`. Provides functionality to shuffle, draw, compare, and find cards. Also contains the user menu to interact with the deck.

- **`Main.java`**  
  Contains the `main` method. Initializes a new `Deck`, populates it, and displays the menu-driven interface for user interaction.

## How to Run
1. **Clone the repository** (or download it as a ZIP and extract):
   ```bash
   git clone https://github.com/YourGitHubUsername/Shuffle-And-Deal-Java-Deck-Of-Cards.git
   ```
2. **Compile and run** the application (make sure you have Java 8 or higher installed):
   ```bash
   cd Shuffle-And-Deal-Java-Deck-Of-Cards
   javac Main.java
   java Main
   ```
3. **Use the menu** in the console to explore the different features (display deck, shuffle, draw a card, compare two cards, etc.).

## Usage Example
```plaintext
***************************

1. Display the deck of cards
2. Shuffle the deck of cards
3. Draw a card from the deck
4. Empty the deck
5. Print a card from the deck
6. Compare two cards
7. Check if two cards are the same
8. Find a card by rank and suit
9. Deal a hand of cards
10. Quit

Enter your choice (1-10):
```
Follow the on-screen prompts to explore the functionality of the deck.

## Contributing
Contributions are welcome! If you’d like to improve the functionality or add new features, feel free to open an issue or submit a pull request.

## License
This project is open-sourced under the [MIT License](LICENSE). You’re free to use, modify, and distribute this code for personal or commercial purposes.

---

### Additional Notes
- You can extend the `Card` class to handle jokers or custom suits/ranks.
- You can modify `Deck.java` to deal custom-sized hands or even multiple hands.
- This project is a great base for more complex card game implementations (e.g., Poker, Blackjack, etc.).
