package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class DiferentWayTonsertHM {

	public static void main(String[] args) {
			
		Map<Integer,String> map = new HashMap();
		
		map.put(100, "Mango");
		map.put(101,"Apple");
		map.put(102, "Banana");
		
		System.out.println("before invoking the other methods() :");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey() + " : " +m.getValue());
		}
		
		map.putIfAbsent(103, "Banana");
		System.out.println("After invoking the put if absent method() :");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey() + " : " +m.getValue());
		}
		
		Map<Integer,String> map2 = new HashMap();
		
		map2.put(104,"Ali");
		map2.put(105,"Khan");
		
		map2.putAll(map);
		
		System.out.println("After invoking put all method () :");
		
		for(Map.Entry m : map2.entrySet()) {
			
			System.out.println(m.getKey() + " : " +m.getValue());
		}

	}

}
