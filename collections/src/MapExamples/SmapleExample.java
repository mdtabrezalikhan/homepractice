package MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SmapleExample {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap();
		map.put("Name", "ALI");
		map.put("myReligion", "ISLAM");
		map.put("Gifted", "NAMAZ");
		map.putIfAbsent("Persists", "5 Time Namaz");
		
		System.out.println(map.get("Persists"));
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + " : " +map.get(key));
		}
		
	}

}
