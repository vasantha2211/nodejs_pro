package data_provider_testNG_exmp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_exmp {
	@Test (dataProvider="data")
	public void login(String name,String password) {
		System.out.println("Login using"+" "+name+ " "+password);
		}
	@DataProvider (name="data")
	public Object method1() {
		return new Object[][] {{"ashwini","123"},{"meghana","456"}};
		
	}


}
