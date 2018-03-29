
public class Charmander implements State {
	private static Charmander INSTANCE;

	private Charmander() {

	}

	public static Charmander getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}

	@Override
	public int fight() {
		System.out.println("Charmander hit the oppenent with it's head!");
		return 10;

	}

	@Override
	public void move() {
		System.out.println("Charmander runs around with it's feet.");

	}

	@Override
	public void eat() {
		System.out.println("Charmander ate a chicken and is happy now!");

	}

}
