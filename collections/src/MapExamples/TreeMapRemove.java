package MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRemove {

	public static void main(String[] args) {
		 	
		TreeMap<Integer,String> map = new TreeMap();
		
		map.put(103,"mango");
		map.put(102,"apple");
		map.put(100,"grapes");
		
		System.out.println("before invoke : \n");
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		System.out.println("After invoke remove \n:"+map.remove(102));
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}

}
