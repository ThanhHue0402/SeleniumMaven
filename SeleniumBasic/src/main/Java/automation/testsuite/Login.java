package automation.testsuite;

import org.testng.annotations.*;

public class Login {
	@BeforeMethod
	public void init() {
		System.out.println("");
	}
	
	@Test
	public void tesstcase1() {
		System.out.println("This is testcase1");
	}
	
	

}
