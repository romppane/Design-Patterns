import java.util.Iterator;
import java.util.List;

public class IteratorThread extends Thread{
	private Iterator itr;
	private List list;
	private int instance = 0;
	private static int current = 0;
	
	

	public IteratorThread(Iterator itr, List list) {
		this.itr = itr;
		this.list = list;
		instance = current;
		current++;
	}



	public void setItr(Iterator itr) {
		this.itr = itr;
	}



	@Override
	public void run() {
		while(itr.hasNext()) {
			System.out.println("#"+instance+" "+itr.next().toString());
		}
	}
	

}
