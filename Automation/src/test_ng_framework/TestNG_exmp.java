package test_ng_framework;

import org.testng.annotations.Test;

public class TestNG_exmp {
	@Test              //zero priority
	public void testcase1() {
		System.out.println("test case1");
	}
	
	
	@Test(priority =-1)// negative priority
	public void testcase2() {
		System.out.println("test case2");
	}
	@Test(priority =-2)
	public void testcase3() {
		System.out.println("test case3");
	}
	@Test(priority = 3)
	public void testcase4() {
		System.out.println("test case4");
	}
	
	
	
	@Test(invocationCount=0)  // to skip the testcase
	public void testcase5() {
		System.out.println("test case 5");
	}
	@Test(enabled=false)         //to skip the testcase
	public void testcase6() {
		System.out.println("test case6");
	}
	@Test(invocationCount=5) //to repeat the testcase multiple times
	public void testcase7() {
		System.out.println("test case7");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
