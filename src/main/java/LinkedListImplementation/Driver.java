package LinkedListImplementation;

public class Driver {
	public static void main(String[] args) {
	
	LinkdList myList = new LinkdList();
	
	myList.addToEnd(20);
	myList.addToEnd(21);
	myList.addToEnd(22);
	myList.addToEnd(23);
	myList.addToEnd(24);
	
	myList.printList();
	
	myList.addAtIndex(3, 88);
	
	//myList.removeByIndex(5);
	
	myList.printList();
	
	//myList.findMiddleValue();
	
	
	
	}

}
