package before_after_meth_testNG_exmp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Beforeclass_Afterclass_ex {
	
	@BeforeClass
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
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}


}
