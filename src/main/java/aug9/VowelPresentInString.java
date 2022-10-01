package aug9;

public class VowelPresentInString {
	static char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	public static void checkForVowel(String given) {
		String vowelString = new String(vowels);
		int givenLength = given.length();
		for(int i=0; i<givenLength; i++) {
			char x = Character.toLowerCase(given.charAt(i));
			if (vowelString.indexOf(x) != -1) {
				System.out.println(given + " contains vowel " + given.charAt(i) + " at index " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		checkForVowel("Abib");
	}

}
