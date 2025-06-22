package before_after_meth_testNG_exmp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Testng_group {
	
	
	@Test (groups= {"Smoke"})
	public void test1() {
		System.out.println("test method1");
	}
	@Test (groups= {"Regression"})
	public void test2() {
		System.out.println("test method2");
	}@Test (groups= {"smoke"})
	public void test3() {
		System.out.println("test method3");
	}@Test (groups= {"Smoke"})
	public void test4() {
		System.out.println("test method4");
	}@Test (groups= {"Regression"})
	public void test5() {
		System.out.println("test method5");
	}
}
