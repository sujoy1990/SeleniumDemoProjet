package package2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {
		System.out.println("Excute createOrgTest");
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	
	@Test
	public void modifyOrgTest() {
		System.out.println("Excute modifyOrgTest");
	}
	
	@Test
	public void deleteOrgTest() {
		System.out.println("Excute deleteOrgTest");
	}

}