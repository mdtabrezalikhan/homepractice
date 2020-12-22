package setExample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		TreeSet<Integer> val = new TreeSet();
		
		val.add(100);
		val.add(30);
		val.add(60);
		val.add(10);
		val.add(80);
		val.add(20);
		
		// By default ascending order.
		for(int i:val) {
			System.out.println(i);
		}
		
		System.out.println("\n Numbers are :");
		// Printing in descending order.
		Iterator itr = val.descendingIterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}
