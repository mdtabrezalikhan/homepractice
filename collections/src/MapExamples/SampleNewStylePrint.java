package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class SampleNewStylePrint {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap();
		
		map.put("Name", "Khan");
		map.put("Education", "Engg");
		map.put("Course", "Java");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
