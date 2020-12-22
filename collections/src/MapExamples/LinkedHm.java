package MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHm {

	public static void main(String[] args) {
		  
		Map<Integer,String> map = new LinkedHashMap();
		
		map.put(100,"Apple");
		map.put(101,"Mango");
		map.put(102,"banana");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}

}
