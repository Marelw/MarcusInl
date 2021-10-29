import java.util.Scanner;

/**
 * Assignment 1 - Guessing Game
 * 
 * Here's the unfinished source code for the Guesser class. It is your task to
 * complete the missing parts.
 */
public class Guesser {
	private int low;
	private int high;

	// Write the constructor below this line.
	public Guesser(int low, int high){
		this.low = low;
		this.high = high;
	}

	public void start() {
		rules();
		doGuesses();
		// call the rules method here
		// call the doGuesses() method here
	}

	private void rules() {
		System.out.println("Think of a number between " + low + " and " + high);
		System.out.println("I'm going to ask a few questions in order " + "to guess the number.");
		System.out.println("Please answer T for true, and F for false.\n");
	}

	private String getReply() {
		String reply = null;
		do {
			reply = new Scanner(System.in).nextLine();
			if ("T".equalsIgnoreCase(reply) || "F".equalsIgnoreCase(reply)){
				break;
			}else{
				System.out.println("This is not a valid reply");
				System.out.println("Valid replys are T and F");
			}
		} while (true);
		return reply;
		// Write code here which reads a String from the console.
		// As long as it is not a valid reply (one of "T" and "F")
		// write an error message, and read a new reply.
		// When you have gotten a valid reply, return it.
	}

	private void doGuesses() {
		int i = 0; // number of guesses
		int middle = 0;
		while (low < high) {
			// Set next guess to the middle between
			// current low and current high
			middle = low + (high - low) / 2;

			System.out.println("Is the number less than or equal to " + middle + "?");
			String reply = getReply();
			if ("T".equalsIgnoreCase(reply)) {
				// The number is less than or equal to middle
				// so we move down high to middle
				high = middle;
			} else {
				// The number is greater than middle,
				// so we move up low to middle + 1
				low = middle + 1;
			}
			i++; // One more guess!
		}
		// When low has met high, we don't enter the loop
		// and we have found the number
		answer(low, i);
	}

	private void answer(int guess, int numberOfGuesses) {
		System.out.println("You were thinking about " + guess + " (took me " + numberOfGuesses + " guesses)");
	}

}
