
public class Pizzeria {

	public static void main(String[] args) {
		// Pizza 1
		Pizza_IF dough = new Dough();
		Pizza_IF tomato = new TomatoSauce();
		Pizza_IF cheese = new Cheese();
		Pizza_IF pepperoni = new Pepperoni();

		dough.setPrice(4);
		tomato.setPrice(1);
		cheese.setPrice(1);
		pepperoni.setPrice(2);

		tomato.addToPizza(dough);
		cheese.addToPizza(tomato);
		pepperoni.addToPizza(cheese);

		// Pizza 2
		Pizza_IF first = new Dough();
		Pizza_IF second = new TomatoSauce();
		Pizza_IF third = new Jalapeno();
		Pizza_IF fourth = new Garlic();
		Pizza_IF fifth = new Cheese();

		first.setPrice(4);
		second.setPrice(1);
		third.setPrice(1.5);
		fourth.setPrice(0.5);
		fifth.setPrice(1);

		second.addToPizza(first);
		third.addToPizza(second);
		fourth.addToPizza(third);
		fifth.addToPizza(fourth);

		// Pizza 3
		Pizza_IF p31 = new Dough();
		Pizza_IF p32 = new TomatoSauce();
		Pizza_IF p33 = new Jalapeno();
		Pizza_IF p34 = new Garlic();
		Pizza_IF p35 = new Oregano();
		Pizza_IF p36 = new Pepperoni();
		Pizza_IF p37 = new Cheese();

		p31.setPrice(4);
		p32.setPrice(1);
		p33.setPrice(1.5);
		p34.setPrice(0.5);
		p35.setPrice(0.5);
		p36.setPrice(2);
		p37.setPrice(1);

		p32.addToPizza(p31);
		p33.addToPizza(p32);
		p34.addToPizza(p33);
		p35.addToPizza(p34);
		p36.addToPizza(p35);
		p37.addToPizza(p36);




		System.out.println(pepperoni.printPizza() + "| Only: " + pepperoni.getPrice() + "$");
		System.out.println(fifth.printPizza() + "| Only: " + fifth.getPrice() + "$");
		System.out.println(p37.printPizza() + "| Only: " + p37.getPrice() + "$");

	}

}
