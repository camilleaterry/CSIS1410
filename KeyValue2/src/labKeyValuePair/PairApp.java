package labKeyValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairApp
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{

		// Create two keyValuePairs p1 and p2
		KeyValuePair<String, Integer> p1 = new KeyValuePair<String, Integer>(
				"SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<String, Integer>(
				"NY", 8244910);
		KeyValuePair<String, Integer> p3 = new KeyValuePair<String, Integer>(
				"LA", 3819702);
		KeyValuePair<String, Integer> p4 = new KeyValuePair<String, Integer>(
				"SF", 812826);

		// List<KeyValuePair> cities = new ArrayList<KeyValuePair>();

		@SuppressWarnings("rawtypes")
		List<KeyValuePair> cities = new ArrayList<KeyValuePair>(Arrays.asList(
				p1, p2, p3, p4));

		System.out.println("Original List:");
		for (KeyValuePair<?, ?> city : cities)
		{
			System.out.println(city);
		}

		System.out.println("\nSorted List:");
		//sort the list
		Collections.sort(cities);
		for (KeyValuePair<?, ?> el : cities)
		{
			System.out.println(el);
		}
	}

}
