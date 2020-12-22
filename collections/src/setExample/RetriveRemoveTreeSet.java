package setExample;

import java.util.Iterator;
import java.util.TreeSet;

public class RetriveRemoveTreeSet {

	public static void main(String[] args) {

		TreeSet<String> val = new TreeSet();
		val.add("ALI");
		val.add("KHAN");
		val.add("MD");
		val.add("ALI");
		
		System.out.println("Rteiving the highest element :"+val.pollFirst());
		System.out.println("retreving the loweset element :"+val.pollLast());
		
		Iterator itr = val.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
