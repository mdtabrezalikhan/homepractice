package ListAndVector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> vec = new Vector();
		System.out.println(vec.size());
		vec.add(99);
		vec.add(79);
		vec.add(29);
		vec.add(0, 9);
		Collections.sort(vec);
		vec.remove(0);
	
		for(int i:vec) {
			System.out.println(i);
		}
		if(vec.contains(29)) {
			System.out.println("29 is present");
		}
		System.out.println(vec.size());
		List<Integer> val = new Vector();
		val.add(2);
		val.add(5);
		val.add(56);
		if(vec.equals(val)) {
			System.out.println("true");
		}
		else {
			System.out.println("Not Equal");
		}
		if(!val.isEmpty() && !(vec.isEmpty())) {
			System.out.println(vec.retainAll(val));
		}
	}

}
