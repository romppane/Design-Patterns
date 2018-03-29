
public class MCDBuilder implements BurgerBuilder {
	private Burger burger;



	@Override
	public Burger getBurger() {
		return burger;
	}

	@Override
	public void createNewBurger() {
		buildBuns();
		buildPatty();
		buildSauce();
		buildGreens();

	}

	@Override
	public void buildBuns() {
		burger = new Buns();

	}

	@Override
	public void buildSauce() {
		burger.Add(new Sauce());

	}

	@Override
	public void buildPatty() {
		burger.Add(new Patty());

	}

	@Override
	public void buildGreens() {
		burger.Add(new Greens());

	}

}
