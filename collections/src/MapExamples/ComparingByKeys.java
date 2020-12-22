package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class ComparingByKeys {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap();
		
		map.put(100, "AMIT");
		map.put(101, "VIJAY");
		map.put(102,"AJAY");
		
	    //Returns a Set view of the mappings contained in this map   
		map.entrySet()
		//Returns a sequential Stream with this collection as its source
		.stream()
	      //Sorted according to the provided Comparator
		.sorted(Map.Entry.comparingByKey())
		   //Performs an action for each element of this stream 
		.forEach(System.out::println);
		
	}

}
