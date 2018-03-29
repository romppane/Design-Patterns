
public class Jasper {

	public static void main(String[] args) {
		ClothingFactory factory = BossFactory.getInstance();
		Cap cap = factory.createCap();
		Jeans jeans = factory.createJeans();
		TShirt tshirt = factory.createTShirt();
		Shoes shoes = factory.createShoes();

		System.out.println("Jasper is currently wearing:");
		System.out.println(cap.toString());
		System.out.println(tshirt.toString());
		System.out.println(jeans.toString());
		System.out.println(shoes.toString());


	}

}
