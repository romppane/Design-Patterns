import java.util.ArrayList;
import java.util.List;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListHandler handlerEvery = new ListHandler(new AfterEvery());
		ListHandler handlerEvery2 = new ListHandler(new AfterEverySecond());
		ListHandler handlerEvery3 = new ListHandler(new AfterEveryThird());

		List<String> list = new ArrayList<>();
		list.add("Kissa");
		list.add("Koira");
		list.add("Kilpikonna");
		list.add("Virtahepo");
		list.add("Kameli");
		list.add("Marsu");
		list.add("Papukaija");
		list.add("Muuli");
		list.add("Laama");
		list.add("Pantteri");
		list.add("Puuma");

		System.out.println("Eka handler");
		System.out.println(handlerEvery.breakList(list));

		System.out.println("Toka handler");
		System.out.println(handlerEvery2.breakList(list));
		System.out.println();

		System.out.println("Kolmas handler");
		System.out.println(handlerEvery3.breakList(list));
	}

}
