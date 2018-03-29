
public class Charmeleon implements State {
	private static Charmeleon INSTANCE;

	private Charmeleon() {

	}

	public static Charmeleon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}


	@Override
	public int fight() {
		System.out.println("Charmeleon used ember!");
		return 50;

	}

	@Override
	public void move() {
		System.out.println("Charmeleon doesn't feel like moving.");
	}

	@Override
	public void eat() {
		System.out.println("Charmeleon ate a buffalo");

	}

}
