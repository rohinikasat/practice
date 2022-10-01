package trial;

public class Application {
	public static void speak() {
		System.out.println("Hi");
	}
	
	public void speak(String say) {
		System.out.println(say);
	}
	
	public static void main(String[] args) {
		speak();
		new Application().speak("What?");
	}
}
