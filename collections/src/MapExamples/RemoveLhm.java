package MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveLhm {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100,"abc");
		map.put(101,"bef");
		map.put(102,"Dgh");
		
		System.out.println("after invoking remove method :" +map.remove(102));
		
		System.out.println("Map :"+map);

	}

}
