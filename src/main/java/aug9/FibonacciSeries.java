package aug9;

public class FibonacciSeries {
	
	public static void createFibonacciOfLength(int length) {
		if (length == 0) {
			System.out.println("Number of digits should be 1 or more");
		} else if(length == 1) {
			System.out.println("0");
		} else if(length == 2) {
			System.out.println("0, 1");
		} else {
		
			int [] sequence = new int[length];
			sequence[0] = 0;
			sequence[1] = 1;
			
			for(int i=2; i<length; i++) {
				sequence[i] = sequence[i-1]+ sequence[i-2];
			}
		
			for(int a: sequence) {
				System.out.print(a + ", ");
			}
		}
	}
	public static void main(String[] args) {
		createFibonacciOfLength(11);
	}
}
