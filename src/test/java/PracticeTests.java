import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTests {
	
	@BeforeSuite //1
	public void setUp() {
		System.out.println("Set up system property for chrome");
	}
	
	@BeforeClass //3
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@BeforeTest //2
	public void login() {
		System.out.println("login to app");
	}
	
	
	@Test //5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test 
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@AfterMethod //6
	public void logOut() {
		System.out.println("logout from app");
	}
	
	@AfterTest //8
	public void deleteAllCookies(){
		System.out.println("Delete all cookies");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite //9
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
}
