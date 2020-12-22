package QueueExample;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethodExample {

	public static void main(String[] args) {

		Queue<String> val = new PriorityQueue();
		val.add("ALI");
		val.add("KHAN");
		val.offer("MD");
		val.offer("hussain");
		val.add("Omer");
		
		System.out.println("wont remove Head :"+val.element());
		System.out.println("Not remove Head :"+val.peek());
		
		System.out.println("traversing queue :");
		Iterator itr = val.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Head element deleted :"+val.poll());
		System.out.println("Head element deleted :"+val.remove());
		
		Iterator it = val.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
