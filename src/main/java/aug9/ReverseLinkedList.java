package aug9;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
	
	public static void reversingList(List<Integer> list){
		List<Integer> newList = new LinkedList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			newList.add(i, list.get(list.size()-1-i));
		}
		
		for(int a : newList) {
			System.out.print(a + ", ");
		}
	}
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		
		reversingList(list);
		System.out.println();
		
		Collections.reverse(list);
		for(Integer i: list) {
			System.out.print(i + ", ");
		}
	}
}
