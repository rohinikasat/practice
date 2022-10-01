package aug9;

public class IsPrime {
	
	public static boolean checkPrime(int num) {
		
		if(num == 0 || num == 1) {
			return false;
		} else if(num == 2) {
			return true;
		}
		for (int i = 2; i< num/2; i++)
		{
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPrime(13));
	}

}
