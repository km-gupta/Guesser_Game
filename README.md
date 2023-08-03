# Guesser_Game
A guessing game is a type of game where a player tries to determine a hidden value or object based on clues or limited information provided. 

The program is structured into three classes: Guesser, Player, and Umpire, along with a launcher class named GuesserGameLauncher.

Guesser Class:
  The Guesser class represents the entity that guesses a number.
  It contains an instance variable guessNum to store the Guesser's guessed number.
  The guessNumber() method uses the Scanner class to prompt the Guesser to input a guess. It returns the guessed number.

Player Class:
  The Player class represents a player who participates in guessing the number.
  Similar to the Guesser class, it has an instance variable pguessNum to store the guessed number.
  The guessNumber(int player) method prompts the player (identified by a number) to input a guess and returns the guessed number.

Umpire Class:
  The Umpire class acts as the mediator and judge of the game.
  It manages the collection of guesses and determines the winner(s).
  The collectNumFromGuesser() method creates a Guesser object, calls the guessNumber() method to collect the Guesser's guess, and stores it.
  The collectNumFromPlayer() method creates three Player objects, collects guesses from each player, and stores them.
  The compare() method compares the Guesser's guess with the players' guesses and determines the winner(s) based on a set of conditions. It displays the outcome of     the game.

GuesserGameLauncher Class:
  The GuesserGameLauncher class serves as the entry point to the program.
  It creates an Umpire object, collects the Guesser's guess and the players' guesses, and then compares and announces the winner(s) based on the logic implemented in   the Umpire class.
