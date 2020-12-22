package MapExamples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDiffPut {

	public static void main(String[] args) {

		Map<Integer, String> map = new Hashtable();

		map.put(100, "Khan");

		map.putIfAbsent(101, "Khan");

		map.putIfAbsent(102, "ali");
		map.putIfAbsent(103, "md");
		map.putIfAbsent(104, "khansab");

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}

}
