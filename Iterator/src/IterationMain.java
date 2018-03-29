import java.util.ArrayList;
import java.util.Iterator;

public class IterationMain {

	public static void main(String[] args) {
		//Täyttää ArrayListin
		ArrayList<String> arr = new ArrayList();
		for(int i = 0; i<100; i++) {
			arr.add("Number:"+i);
		}

		//Omat iteraattorit
		System.out.println("Tehtävä 1");
		IteratorThread it1 = new IteratorThread(arr.iterator(),arr);
		IteratorThread it2 = new IteratorThread(arr.iterator(),arr);
		it1.start();
		it2.start();
		while(it1.isAlive() || it2.isAlive()) {
		}
		try {
			it1.join();
			it2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");

		//Yhteinen iteraattori
		System.out.println("Tehtävä 2");
		Iterator iterator = arr.iterator();
		IteratorThread it3 = new IteratorThread(iterator,arr);
		IteratorThread it4 = new IteratorThread(iterator,arr);
		it3.start();
		it4.start();
		while(it3.isAlive() || it4.isAlive()) {

		}
		try {
			it3.join();
			it4.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");

		//Muuttuu kesken ajon, koittaa my�s iteroida samalla kun muuttaa itseään!
		System.out.println("Tehtävä 3");
		IteratorThread it5 = new IteratorThread(arr.iterator(),arr);
		ChangerThread ch1 = new ChangerThread(arr.iterator(),arr);
		it5.start();
		ch1.start();
		while(it5.isAlive() || ch1.isAlive()) {

		}
		try {
			it5.join();
			ch1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");
	}

}
