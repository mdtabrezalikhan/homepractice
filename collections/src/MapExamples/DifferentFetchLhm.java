package MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class DifferentFetchLhm {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap();
		
		map.put(100,"Mango");
		map.put(101,"apple");
		map.put(102, "banana");
		
		System.out.println("initial map :" +map.keySet());
		
		System.out.println("initial map : "+map.values());
		
		System.out.println("key value pair :"+map.entrySet());
	}

}
