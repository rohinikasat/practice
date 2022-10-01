package queueImplementation;

public class QueueImplementation {
	
	int[] qArray;
	
	public QueueImplementation(int size) {
		this.qArray = new int[size];
	}
	
	//Inserts an item at the rear of the queue.
	public void Enqueue(int a) {
		int index = this.qArray.length ;
		
		qArray[index] = a;
	}
	
	
	
	//Removes the object from the front of the queue and returns it, thereby decrementing 
	//queue size by one.
	public int[] Dequeue() {
		int index = qArray.length-1;
		int[] newQArray = new int[index];
		for(int i=0;i<index;i++) {
			newQArray[i] = qArray[i];
		}
		
		return newQArray;
		
		
	}

}
