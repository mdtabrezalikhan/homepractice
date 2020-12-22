package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class DifferentRemoveHM {

	public static void main(String[] args) {
			
		Map<Integer,String> map = new HashMap();
		
		map.put(100, "Apple");
		map.put(101," ");
		map.put(102, "banana");
		map.put(103,"grapes");
		map.put(104, "manggo");
		
		System.out.println("initial list of map ");
		
		for(Map.Entry m : map.entrySet()) {
			 System.out.println(m.getKey() + " : " +m.getValue());
		}
		
		map.remove(102);
		
		System.out.println("After invoking remove method () :");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey() + " : " +m.getValue());
		}
		
		map.remove("grapes");
		System.out.println("After invoking remove () from value");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +" : " +m.getValue());
		}
		
		map.remove(104, "manggo");
		System.out.println("After invoking remove() using key value pair :");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +" : " +m.getValue());
		}

	}

}
