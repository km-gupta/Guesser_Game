import java.util.Scanner; // Import the Scanner class to read input from the user

class Guesser {
	int guessNum; // Declare an integer variable to store Guesser's guess

	public int guessNumber() {
		Scanner scan = new Scanner(System.in); // Create a Scanner object for input
		System.out.println("Guesser kindly guess the number");
		guessNum = scan.nextInt(); // Read Guesser's guess from the user
		return guessNum; // Return the guessed number
	}
}

class Player {
	int pguessNum; // Declare an integer variable to store Player's guess

	public int guessNumber(int player) {
		Scanner scan = new Scanner(System.in); // Create a Scanner object for input
		System.out.println("Player " + player + " kindly guess the number");
		pguessNum = scan.nextInt(); // Read Player's guess from the user
		return pguessNum; // Return the guessed number
	}
}

class Umpire {
	int numFromGuesser; // Store Guesser's guessed number
	int numFromPlayer1; // Store Player 1's guessed number
	int numFromPlayer2; // Store Player 2's guessed number
	int numFromPlayer3; // Store Player 3's guessed number

	public void collectNumFromGuesser() {
		Guesser g = new Guesser(); // Create a Guesser object
		numFromGuesser = g.guessNumber(); // Call Guesser's guessNumber method to collect the guess
	}

	public void collectNumFromPlayer() {
		Player p1 = new Player(); // Create Player 1 object
		Player p2 = new Player(); // Create Player 2 object
		Player p3 = new Player(); // Create Player 3 object

		numFromPlayer1 = p1.guessNumber(1); // Call Player 1's guessNumber method and collect the guess
		numFromPlayer2 = p2.guessNumber(2); // Call Player 2's guessNumber method and collect the guess
		numFromPlayer3 = p3.guessNumber(3); // Call Player 3's guessNumber method and collect the guess
	}

	void compare() {
		// Compare the guessed numbers to determine the winner(s)

		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied all three players guessed correctly");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player3 won ");
			} else {
				System.out.println("Player 1 won the game");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player3 won the game");
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("Any of the Players did not correctly guess the Guesser number. \nGame lost! try again");
		}
	}
}

public class GuesserGameLauncher {
	public static void main(String[] args) {
		Umpire u = new Umpire(); // Create an Umpire object
		u.collectNumFromGuesser(); // Collect Guesser's guessed number
		u.collectNumFromPlayer(); // Collect Player's guessed numbers
		u.compare(); // Compare and determine the winner(s)
	}
}
