import java.util.ArrayList;
import java.util.List;

public class Buns extends MCDHamburger{
	List<Burger> burgerparts;

	public Buns() {
		burgerparts = new ArrayList<Burger>();
	}

	@Override
	public void Add(Burger burger) {
		burgerparts.add(burger);
	}

	@Override
	public String toString() {
		String brgr = "Buns";
		for(Burger a : burgerparts) {
			brgr+=a.toString();
		}
		return brgr;
	}

}
