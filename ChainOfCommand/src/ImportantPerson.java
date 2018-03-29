
public abstract class ImportantPerson implements Handler {
	protected Handler handler;
	protected Worker worker;


	public ImportantPerson(Handler handler) {
		this.handler = handler;
		this.worker = handler.getWorker();
	}

	@Override
	public void acceptRaise(double i) {
		handler.acceptRaise(i);

	}

	@Override
	public void handleRaise(double i) {
		System.out.println(this.getClass().getName() + " has aproved your wish for pay raise!");
		System.out.println("Your pay has increased by: "+(worker.getPay()*(i/100)));
		worker.setPay(worker.getPay()+worker.getPay()*(i/100));

	}

	@Override
	public Worker getWorker() {
		return worker;
	}



}
