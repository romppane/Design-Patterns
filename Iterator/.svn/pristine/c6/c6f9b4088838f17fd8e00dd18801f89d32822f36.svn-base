import java.util.Iterator;
import java.util.List;

public class ChangerThread extends Thread{
	private Iterator itr;
	private List list;
	private int instance = 0;
	private static int current = 0;
	
	

	public ChangerThread(Iterator itr, List list) {
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
		int i = 0;
		while(itr.hasNext()) {
			if(i%2 == 0) {
				list.remove(i);
				i++;
			}
			else {
				Object obj = itr.next();
				i++;
			}
		}
	}
	

}
