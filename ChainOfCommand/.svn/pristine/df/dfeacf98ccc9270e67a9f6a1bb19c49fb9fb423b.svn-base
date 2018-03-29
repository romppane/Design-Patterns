
public class PayRollMain {

	public static void main(String[] args) {

		Worker roni = new Worker(3000.50, "Roni Metsämuuronen");
		Handler handler = new CEO(new Boss(new Manager(roni)));
		System.out.println("Paycheck: "+roni.getPay());
		handler.acceptRaise(6);
		System.out.println("Paycheck: "+roni.getPay());
		handler.acceptRaise(3);
		System.out.println("Paycheck: "+roni.getPay());
		handler.acceptRaise(1.5);
		System.out.println("Paycheck: "+roni.getPay());
	}

}
