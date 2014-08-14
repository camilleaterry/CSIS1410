//Student: Anil Dhungel
// CSIS 1410
//Assignment 07 ListVsSet

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {
	private List<ColoredSquare> list;
	private Set<ColoredSquare> set;

	public ListVsSetDemo(ColoredSquare... elements) {
		list = new ArrayList<ColoredSquare>();
		set = new HashSet<ColoredSquare>();

		for (ColoredSquare crt : elements) {

			addElement(crt);
		}
	}

	public String getListElements() {
		String return_value = "";
		for (ColoredSquare cs : list) {
			return_value += cs.toString() + "\n";
		}

		return return_value;
	}

	public String getSetElements() {

		String return_value = "";
		for (ColoredSquare cs : set) {
			return_value += cs.toString() + "\n";
		}

		return return_value;

	}

	public void addElement(ColoredSquare el) {

		list.add(el);
		set.add(el);

	}

}
