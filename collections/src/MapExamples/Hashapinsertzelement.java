package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class Hashapinsertzelement {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		
		map.put(100,"Apple");
		map.put(101,"Mango");
		map.put(102,"Grapes");
		map.put(103, "Banana");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +" : "+ m.getValue());
		}

	}

}
