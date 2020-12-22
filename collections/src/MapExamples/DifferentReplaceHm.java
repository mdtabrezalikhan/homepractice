package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class DifferentReplaceHm {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap();
		
		map.put(100,"Ali");
		map.put(101,"Khan");
		map.put(102,"md");
		map.put(103,"turgut");
		
		System.out.println("initial map :");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		map.replace(103, "bamsi");
		
		System.out.println("After invoking replce method bas on key(): ");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		map.replace(100, "Ali", "ALI");
		System.out.println("after invoking replce() with old string to new String");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +" : " +m.getValue());
		}
		
		

	}

}
