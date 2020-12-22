package ListAndVector;

import java.util.Comparator;

public class comImpl implements Comparator<Integer> 
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		
		// sorting based on all three digit
		//if(o1>o2)
		
		// sorting base on last digit of number.
		if(o1%10>o2%10)
		
		// Sorting base on last second number.
		//if(o1%100>o2%100)
		
		// Sorting based on first digit of number.
		//if(o1%1000>o2%1000)
		return 1;
		return -1;
	}

}
