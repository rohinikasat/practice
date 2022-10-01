import java.util.Scanner;

public class Animal {
	
	public static void printFBSeries(int length) {
		
		int[] fb = new int[length];
		if(length==1) {
			System.out.println("0");
		}
		else if(length ==2) {
			System.out.println("0 1");
		}
		else {
			fb[0]=0;
			fb[1]=1;
			System.out.println(fb[0]);
			System.out.println(fb[1]);
			for(int i=2; i<length; i++) {
				fb[i] = fb[i-1] + fb[i-2];
				System.out.println(fb[i]);
			}
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter the length of Fibonacci Sequence");
		try {
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			Animal.printFBSeries(length);
			sc.close();
		}
		catch(Exception e) {
			System.out.println("please enter a valid integer");
		}
		
	}
	
	

}
