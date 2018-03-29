
public class Boss extends ImportantPerson implements Handler {

	public Boss(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptRaise(double i) {
		if(i>2 && i<5) {
			super.handleRaise(i);
		}
		else {
			super.acceptRaise(i);
		}

	}

}
