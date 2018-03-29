
public class HESBuilder implements BurgerBuilder {
	HESBurger burger;
	StringBuilder build;



	public HESBuilder(HESBurger burger) {
		this.burger = burger;
		build = new StringBuilder();
	}

	@Override
	public String getBurger() {
		return burger.getBurgercontent();
	}

	@Override
	public void createNewBurger() {
		buildBuns();
		buildPatty();
		buildSauce();
		buildGreens();
		burger.setBurgercontent(build.toString());

	}

	@Override
	public void buildBuns() {
		build.append("Hesburger Buns");

	}

	@Override
	public void buildSauce() {
		build.append(", Hesburger Sauce");

	}

	@Override
	public void buildPatty() {
		build.append(", Hesburger Patty");

	}

	@Override
	public void buildGreens() {
		build.append(", Hesburger salad");

	}

}
