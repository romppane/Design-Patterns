import java.util.List;

public class ListHandler {
	private ListConverter converter;

	public ListHandler(ListConverter converter) {
		this.converter = converter;
	}

	public String breakList(List<String> list) {
		return converter.listToString(list);
	}



}
