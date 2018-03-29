import java.util.ArrayList;

public class Case extends AbstractComponent{
	private ArrayList<Component> components = new ArrayList<>();

	@Override
	public void Add(Component component) {
		components.add(component);
	}

	@Override
	public double getPrice() {
		double partprice = 0.00;
		for(Component a : components) {
			partprice+=a.getPrice();
		}
		return (this.price+partprice);

	}

}
