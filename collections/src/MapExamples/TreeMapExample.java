package MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		// maintain ascendending order
		Map<Integer,String> map = new TreeMap();
		
		map.put(102, "ali");
		map.put(101,"apple");
		map.put(100,"amir");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}

}
