
public class Manager implements Handler {
	Worker worker;

	public Manager(Worker worker) {
		this.worker = worker;
	}


	@Override
	public void acceptRaise(double i) {
			System.out.println(this.getClass().getName() + " has aproved your wish for pay raise!");
			System.out.println("Your pay has increased by: "+(worker.getPay()*(i/100)));
			worker.setPay(worker.getPay()+worker.getPay()*(i/100));
	}

	@Override
	public Worker getWorker() {
		return worker;
	}


	@Override
	public void handleRaise(double i) {
		acceptRaise(i);
	}

}
