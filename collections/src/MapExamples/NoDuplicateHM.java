package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class NoDuplicateHM {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		
		map.put(100, "ALI");
		map.put(101, "Trugut");
		map.put(100, "Bamsi");
		map.put(102,"Ertugrul");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey() + " : " +m.getValue());
		}

	}

}
