package aug9;

import java.util.ArrayList;
import java.util.List;

// Find second largest number in an array?
public class SecondLargestNumber {
	public static void findSecondLargest(int[] given) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i = 0; i<given.length; i++) {
			intList.add(given[i]);
		}
		intList.sort(null);
		int secondLargest = intList.get(intList.size()-2);	
		System.out.println(secondLargest);
	}
	
	public static void main(String[] args) {
		int[] array = {22, 45, 54, 63, 18};
		findSecondLargest(array);
	}
}
