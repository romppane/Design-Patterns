import java.util.ArrayList;

public abstract class AbstractComponent implements Component {
	protected Double price = 0.00;

	@Override
	public void Add(Component component) {
		System.out.println("Can't add component to a leaf component");
	}

	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}


}
