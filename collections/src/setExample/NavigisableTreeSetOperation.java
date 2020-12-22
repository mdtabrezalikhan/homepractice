package setExample;

import java.util.TreeSet;

public class NavigisableTreeSetOperation {

	public static void main(String[] args) {

		TreeSet<Character> ch = new TreeSet();
		
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		
		System.out.println("initial set :"+ch);
		
		
		// Reverse order direct set print
		System.out.println("Reverse Set :"+ch.descendingSet());
		
		
		// Head Set before C char print till C.
		System.out.println("Head Set :"+ch.headSet('C', false));
		
		
		// Range between print
		System.out.println("Sub Set :"+ch.subSet('A', false, 'E', true));
		
		//after C char it will print
		System.out.println("Tail Set :"+ch.tailSet('C', true));
	}

}
