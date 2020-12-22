package ListAndVector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	// List is and interface extends collection and arraylist is class which implements list.
	//generic which allow only integer to store.
	// implement in two ways with for each loop and with iterator.

	public static void main(String[] args) {

		List<Integer> value = new ArrayList<>();
		value.add(100);
		value.add(99);
		value.add(10);
		value.add(15);
		value.add(2);


		//we can even sort the elements in list.
		Collections.sort(value);


		// with for each loop
		for(int i : value) { System.out.println(i); }


		/* with iterator
		 * Iterator n = value.iterator(); while(n.hasNext()) {
		 * System.out.println(n.next()); }
		 */

		// addAll() in List.
		List<Integer> val = new ArrayList();
		val.add(16);
		val.add(12);
		val.addAll(value);
		Collections.sort(val);

		//is Empty method to see if data is there or not to avoid null pointer exception.
		if(val.isEmpty())
		{
			return;
		}
		else {
			/*
			 * for(int a:val) { System.out.println("\n"+a); }
			 */
			
			// size method of list and get method
			for(int i=0;i<=val.size()-1;i++) {
				System.out.println("\n"+val.get(i));
			}
			// Contains method of list
			if(val.contains(99)) {
				System.out.println("true");
			}
		}
		
		// contain method.
		List<Integer> a = new ArrayList();
		a.add(20);
		a.add(56);
		a.add(99);
		a.add(0);
		a.set(1, 10);
		//a.remove(3);
		Collections.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		if(a.contains(10)) {
			System.out.println("Yes");
		}
		// Equals methods to compare 2 list
		if(a.equals(val)) {
			System.out.println("2 collections are equal");
		}else {
			System.out.println("Not Equal");
		}
		a.removeAll(a);
		
		//remove element from list base on index and specific also.
		List<String> str = new ArrayList();
		str.add("ABC");
		str.add("DEF");
		str.add("AAAA");
		str.remove(2);
		str.remove("DEF");
		for(String s:str) {
			System.out.println(s);
		}
		str.clear();
		System.out.println(str.size());
		System.out.println(str.isEmpty());
	}

}
