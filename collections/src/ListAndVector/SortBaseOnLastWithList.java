package ListAndVector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBaseOnLastWithList {
	
	public static void main(String args[]) {
		List<Integer> values  = new ArrayList();
		values.add(929);
		values.add(672);
		values.add(107);
		values.add(531);
		values.add(288);
		
		// sorting technique
		Comparator<Integer> com = new comImpl();
		
		Collections.sort(values, com);
		
		for(int i : values) {
			System.out.println(i);
		}
	}

}
