package setExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setExamples {

	public static void main(String[] args) {
		
		Set<String> val = new HashSet();
		val.add("ALI");
		val.add("KHAN");
		val.add("OMER");
		val.add("TURGUT");
		// Not allowed duplicate values
		val.add("ALI");
		
		Iterator<String> itr = val.iterator();
		
		while(itr.hasNext()) {
			System.out.println("SET VALUES "+itr.next());
		}
		
		// Contain method.
		if(val.contains("KHAN") && !val.isEmpty()) {
			//Removing the element
			val.remove("ALI");
		for(String str:val) {
		  System.out.println(str);
		}
		}
		
		// clearing or removing the data from hashset.
		val.clear();
		// Checking the size of Hashset.
		System.out.println(val.size());
		
		
		
	}

}
