
public class AdidasFactory implements ClothingFactory {
	private static AdidasFactory INSTANCE;

	private AdidasFactory() {

	}

	public static AdidasFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AdidasFactory();
		}
		return INSTANCE;
	}

	@Override
	public Cap createCap() {
		return new AdidasCap();
	}

	@Override
	public Jeans createJeans() {
		return new AdidasJeans();
	}

	@Override
	public Shoes createShoes() {
		return new AdidasShoes();
	}

	@Override
	public TShirt createTShirt() {
		return new AdidasTShirt();
	}

}
