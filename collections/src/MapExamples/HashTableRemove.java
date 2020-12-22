package MapExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableRemove {

	public static void main(String[] args) {
		
		Map<Integer ,String> map = new Hashtable();
		
		map.put(100,"Apple");
		map.put(101,"kivi");
		map.put(102,"Grapes");
		map.put(103,"banana");
		
		map.remove(103, "banana");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}

}
