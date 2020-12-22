package MapExamples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class CompKeyDesendingOrder {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap();
		
		map.put(100, "AMIT");
		map.put(101, "VIJAY");
		map.put(102,"AJAY");
		 
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
