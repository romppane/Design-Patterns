import java.util.List;

public class AfterEveryThird implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		String finalstring = "";
		for (int i = 0; i<list.size(); i++) {
			if((i+1)%3 == 0 && i>0) {
				finalstring += list.get(i)+"\n";
			}
			else {
				finalstring += list.get(i)+", ";
			}
		}
		return finalstring;
	}

}
