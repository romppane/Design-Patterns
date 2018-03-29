
public class Charizard implements State {
	private static Charizard INSTANCE;

	private Charizard() {

	}

	public static Charizard getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}


	@Override
	public int fight() {
		System.out.println("Charizard used fireblast!");
		return 100;

	}

	@Override
	public void move() {
		System.out.println("Charizard made a spin on the sky!");

	}

	@Override
	public void eat() {
		System.out.println("Charizard ate 2 buffalos");

	}

}
