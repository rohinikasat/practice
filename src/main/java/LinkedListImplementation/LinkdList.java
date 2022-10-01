																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											package LinkedListImplementation;

public class LinkdList {
	Node head;
	int value;
	
	
	public LinkdList(Node head) {
		this.head = head;
	}
	
	public LinkdList() {
		
	}
	
	public void addAsHead(Node newhead) {
		if(this.head != null) {
			newhead.next=this.head;
			this.head= newhead;
		} else {
			this.head = newhead;
		}
	}
	
	public void addToEnd(int value) {
		Node newNode = new Node(value);
		
		if(this.head != null) {
			Node currentNode = this.head;
		
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		} else {
			this.head= newNode;
		}
	}
	
	public void addAtIndex(int index, int value) {
		Node nodeToAdd = new Node(value);
		Node prevNode = this.head;
		Node currentNode = prevNode.next;
		for(int i=1; i<index; i++) {
			prevNode = currentNode;
			currentNode = prevNode.next;
		}
		
		prevNode.next = nodeToAdd;
		nodeToAdd.next = currentNode;
	}
	
	public void removeByIndex(int index){
		try{
			Node currentNode = this.head;
			Node prevNode = currentNode;
			for(int i=0;i<index;i++) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next= currentNode.next;	
		}
		catch(NullPointerException e){
			System.out.println("Exceeding number of nodes in the list");
		}
		
	}

	public void printList() {
		System.out.println("my list:");
		Node currentNode = this.head;
		while(currentNode.next != null) {
			System.out.println(currentNode.value);
			currentNode = currentNode.next;
		}
		System.out.println(currentNode.value);
		
	}
	
	public void findMiddleValue(){
		int count = 0;
		Node currentNode = this.head;
		while(currentNode!=null) {
			count++;
			currentNode= currentNode.next;	
		}
		
		currentNode = this.head;
		for(int i=0;i<count/2;i++) {
			currentNode= currentNode.next;
		}
		System.out.println("Middle Element is "+ currentNode.value);
		
		
	}
}
