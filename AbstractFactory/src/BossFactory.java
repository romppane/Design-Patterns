
public class BossFactory implements ClothingFactory {

	private static BossFactory INSTANCE;

	private BossFactory() {

	}

	public static BossFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new BossFactory();
		}
		return INSTANCE;
	}

	@Override
	public Cap createCap() {
		return new BossCap();
	}

	@Override
	public Jeans createJeans() {
		return new BossJeans();
	}

	@Override
	public Shoes createShoes() {
		return new BossShoes();
	}

	@Override
	public TShirt createTShirt() {
		return new BossTShirt();
	}

}
