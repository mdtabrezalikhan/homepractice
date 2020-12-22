package setExample;

import java.util.TreeSet;

public class VariousSortOperationTreeSet {

	public static void main(String[] args) {

		TreeSet<Character> ch = new TreeSet();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		
		System.out.println("initial set :"+ch);
		
		System.out.println("Reversse set :"+ch.descendingSet());
		
		System.out.println("Head Set :"+ch.headSet('C'));
		
		System.out.println("Subset :"+ch.subSet('A', true, 'D', false));
		
		System.out.println("Tail set :"+ch.tailSet('D'));
	}

}
