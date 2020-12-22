package QueueExample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> val = new PriorityQueue();
		
		val.add("ALi");
		val.add("KHAN");
		val.add("MD");
		val.add("OMER");
		val.offer("HUSSAIN");
		
		Iterator itr = val.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
