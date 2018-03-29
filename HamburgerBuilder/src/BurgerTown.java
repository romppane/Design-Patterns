
public class BurgerTown {

	public static void main(String[] args) {
		BurgerBuilder mcd = new MCDBuilder();
		BurgerBuilder hes = new HESBuilder(new HESBurger());
		mcd.createNewBurger();
		Burger mcburger = (Burger) mcd.getBurger();
		hes.createNewBurger();

		System.out.println("McDonald's");
		System.out.println(mcburger.toString());
		System.out.println("Hesburger");
		System.out.println(hes.getBurger());
	}

}
