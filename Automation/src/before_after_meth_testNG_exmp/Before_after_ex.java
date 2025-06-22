package before_after_meth_testNG_exmp;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_after_ex {
	
	@BeforeMethod
	public void login() {
		System.out.println("login successfully");
	}
	@Test (priority=2)
	public void settings() {
		System.out.println("settings");
	}
	@Test (priority=1)
	public void postvideos() {
		System.out.println("videoupload");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}

}
