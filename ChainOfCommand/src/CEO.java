
public class CEO extends ImportantPerson implements Handler {

	public CEO(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptRaise(double i) {
		if(i>=5) {
			super.handleRaise(i);
		}
		else {
			super.acceptRaise(i);
		}

	}

}
