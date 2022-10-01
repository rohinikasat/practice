package aug9;

public class ReverseString {

	public static String reversingString(String given) {
		
		char[] a = new char[given.length()];
		if (given.length()< 2) {
			return given;
		} else {
			for (int i=0; i<(given.length()/2)+1; i++) {
				int b = given.length()-1;
				a[i] = given.charAt(b-i);
				a[b-i] = given.charAt(i);
			}
		
		return String.valueOf(a);
		}
	}

	public static void main(String[] args) {

		System.out.println(reversingString("rohi"));
	}
}
