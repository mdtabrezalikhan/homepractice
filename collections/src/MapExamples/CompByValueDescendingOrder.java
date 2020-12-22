package MapExamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CompByValueDescendingOrder {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap();
		
		map.put(100, "AMIT");
		map.put(101, "AJAY");
		map.put(102,"VIJAY");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
