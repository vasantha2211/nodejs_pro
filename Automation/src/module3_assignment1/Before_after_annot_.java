package module3_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Before_after_annot_ {
    WebDriver driver;
	@BeforeTest
	public void driver_init() throws InterruptedException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		Thread.sleep(2000);
		}
	@Test (dataProvider="data")
	public void login(String name,String password) throws InterruptedException {
	 driver.findElement(By.id("email")).sendKeys(name);
	 driver.findElement(By.id("passwd")).sendKeys(password);
	 Thread.sleep(4000);
	 }
	
	@DataProvider (name="data")
	public Object method1() {
		return new Object[][] {{"meghana","123"}};
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
