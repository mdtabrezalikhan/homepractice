package ListAndVector;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList();
		list.add("ali");
		list.add("sahil");
		list.add("sarfarac");
		list.add("ahmed");
		list.add(1, "khan");
		list.remove("ahmed");
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
		}
		if(list.contains("ali")) {
			System.out.println("true");
		}
		
	
	}

}
