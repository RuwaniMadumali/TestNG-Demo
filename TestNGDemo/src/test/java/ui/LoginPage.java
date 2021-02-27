package ui;

import org.testng.annotations.Test;

public class LoginPage {
	
	@Test(priority =1,description = "This is login test" )
	public void loginTest() {
		System.out.println("login testcase executed");
	}
	
	@Test(priority =2,description = "This is logut test" )
	public void logoutTest() {
		System.out.println("logout test case executed");
		
	}

}
