package package1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
		
		System.out.println("Excute createContactTest");
		System.out.println("git executed");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("Excute modifyContactTest");
	}

}
