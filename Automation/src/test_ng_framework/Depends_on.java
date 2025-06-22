package test_ng_framework;

import org.testng.annotations.Test;

public class Depends_on {
	
	@Test
	public void signup() {
		
	System.out.println("sign up method");
	}
	@Test(dependsOnMethods= "signup")
	public void login() {
		System.out.println("login method");
	}

}
