
public abstract class Game {
	protected int playersCount;
	abstract void initializeGame();
	abstract void makePlay(int i);
	abstract boolean endOfGame();
	abstract void printWinner();
	// template method
	public final void playOneGame(int playersCount) {
		this.playersCount = playersCount;
		initializeGame();
		int j = 0;
		while (!endOfGame()) {
			makePlay(j);
			j = (j+1) % playersCount;
		}
		printWinner();
	}

}
