import java.util.Scanner;

public class GuessNumber extends Game{
	private Scanner scanner;
	private int target;
	private int max;
	private int guess;

	@Override
	void initializeGame() {
		scanner = new Scanner(System.in);
		try {
			System.out.printf("Select the range for your game: 1 - ");
			max = scanner.nextInt();
			target = (1 + (int)(Math.random()*max));
			System.out.println("Start guessing numbers!");

		}
		catch (Exception e){
			System.out.println("Please insert valid information");
		}
	}

	@Override
	void makePlay(int i) {
		System.out.println("Player: "+(i+1)+" Guess a number 1 - "+max);
		guess = scanner.nextInt();
		if(guess < target) {
			System.out.println("Higher!");
		}
		else if (guess > target){
			System.out.println("Lower!");
		}
		else {
			System.out.println("Winner!");
		}
	}

	@Override
	boolean endOfGame() {
		if(guess == target) {
			return true;
		}
		else {
			return false;
		}

	}

	@Override
	void printWinner() {
		System.out.println("Congratulations for the winner! \n The Winning number was: "+target+"!");
	}

}
