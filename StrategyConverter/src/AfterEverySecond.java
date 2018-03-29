import java.util.List;

public class AfterEverySecond implements ListConverter{

	@Override
	public String listToString(List<String> list) {
		String[] sArray = list.toArray(new String[list.size()]);
		String finalstring = sArray[0];
		for (int i = 1; i<sArray.length; i++) {
			if((i+1)%2 == 0) {
				finalstring += ", "+sArray[i]+"\n";
			}
			else {
				finalstring += sArray[i];
			}
		}
		return finalstring;
	}

}
