package aug9;

import java.util.ArrayList;
import java.util.List;

//Check if a List of integers contains only odd numbers?

public class ContainsOddNumber {

	public static boolean containsOnlyOddNums(List<Integer> list) {
		boolean allOdd = true;
		for(Integer i : list) {
			 if (i % 2 == 0) {
				 allOdd = false;
				 break;
			 }
		}
		return allOdd;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList(5);	
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(3);
		
		System.out.println(containsOnlyOddNums(list));
	}	
}
