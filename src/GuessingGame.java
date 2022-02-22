import textio.TextIO;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();
	}
	
	static void playGame() {
		int computersNumber; // A random number picked by the computer.
		int usersGuess; // A number entered by user as a guess.
		int guessCount; // Number of guesses the user has made.
		
		computersNumber = (int)(100 * Math.random()) +1; 
		// The value assigned to computersNumber is a randomly
		// chosen integer between 1 and 100, inclusive.
		guessCount = 0;
		System.out.println();
		System.out.print("What is your first guess? ");
		while (true) {
			usersGuess = TextIO.getInt(); // Get the user�s guess.
			guessCount++;
			if (usersGuess == computersNumber) {
				System.out.println("You got it in " + guessCount
				+ " guesses! My number was " + computersNumber);
				break; // The game is over; the user has won.
			}
			if (guessCount == 3) {
				System.out.println("You didn�t get the number in 3 guesses.");
				System.out.println("You lose. My number was " + computersNumber);
				break; // The game is over; the user has lost.
			}
			// If we get to this point, the game continues.
			// Tell the user if the guess was too high or too low.
			if (usersGuess < computersNumber)
				System.out.print("That�s too low. Try again: ");
				else if (usersGuess > computersNumber)
				System.out.print("That�s too high. Try again: ");
			}
			System.out.println();
			} // end of playGame()
		} // end of class GuessingGame				


