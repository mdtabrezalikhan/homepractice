package MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigable {

	public static void main(String[] args) {
		 	
		TreeMap<Integer , String> map = new TreeMap();
		
		map.put(104,"mango");
		map.put(103,"Apple");
		map.put(102,"Grapes");
		map.put(100,"banana");
		map.put(101,"kivi");
		
		System.out.println("Before invoking any method : \n");
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println("\n"+m.getKey()+" : "+m.getValue());
		}
		
		//sorting tree map in descending order.
		System.out.println("sorted in descending order : \n"+map.descendingMap()+"\n");
		
		//sorting tree map in head.
		System.out.println("from head traveling : \n"+map.headMap(102, true)+"\n");
		
		// travling tree map from tail.
		System.out.println("from tail traveling : \n"+map.tailMap(103, true)+"\n");
		
		// printing submap.
		System.out.println("travling sub map : \n"+map.subMap(101, true, 103, true)+"\n");

	}

}
