package ListAndVector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIteratorExample {

	public static void main(String[] args) {
			
		/*
		 * List<String> list = new ArrayList<String>(); list.add("Ali");
		 * list.add("khan"); list.add("mahfin"); list.add(0, "md"); list.add("tabrez");
		 * Collections.reverse(list); ListIterator lst = list.listIterator();
		 * 
		 * System.out.println("forward direction \n"); while(lst.hasNext()) {
		 * System.out.println(lst.next()); }
		 * 
		 * System.out.println("\n backward direction"); while(lst.hasPrevious()) {
		 * System.out.println(lst.previous()); }
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(201);
		list.add(3);
		
		Comparable<Integer> com =new Comparable<Integer>() {
			
			@Override
			public int compareTo(Integer o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Collections.sort(list);
		
		for(int i :list) {
			System.out.println(i);
		}
		
	}

}
