import java.util.Iterator;
import java.util.List;

public class AfterEvery implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		Iterator<String> iterator = list.iterator();
		String finalstring = "";
		while(iterator.hasNext()){
			String next = iterator.next();
			finalstring += next +"\n";
		}
		return finalstring;
	}

}
