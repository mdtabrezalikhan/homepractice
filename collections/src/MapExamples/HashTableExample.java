package MapExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new Hashtable();
		
		map.put(100,"ali");
		map.put(101,"khan");
		map.put(102,"md");
		map.put(103,"tabrez");
		System.out.println("hash code :"+map.hashCode());
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println("\n"+m.getKey()+" : "+m.getValue()+"\n");
		}

	}

}
