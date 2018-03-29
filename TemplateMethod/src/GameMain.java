import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Game guessNumber = new GuessNumber();
		int playersCount;
		System.out.printf("Select the number of players: ");
		playersCount = scanner.nextInt();
		guessNumber.playOneGame(playersCount);

	}

}
