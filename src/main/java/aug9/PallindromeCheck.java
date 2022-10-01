package aug9;
//Palindrome Check
public class PallindromeCheck {
	public static boolean checkPallindrome(String given) {
		boolean isPallindrome = true;
		
		for(int i=0; i<given.length()/2; i++) {
			if(given.charAt(i)!= given.charAt(given.length()-1-i)) {
				isPallindrome= false;
				break;
			}
		}
		return isPallindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPallindrome("allalla"));
	}
}

