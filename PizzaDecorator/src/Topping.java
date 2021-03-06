public abstract class Topping implements Pizza_IF {
	protected double price = 0.00;
	protected Pizza_IF parent = null;

	public void addToPizza(Pizza_IF parent) {
		this.parent = parent;
	}
	public String printPizza() {
		return this.getClass().getName() + ", " + parent.printPizza();
	};

	@Override
	public double getPrice() {
		return price + parent.getPrice();
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}
