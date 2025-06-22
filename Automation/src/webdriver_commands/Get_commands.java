package webdriver_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		System.out.println(driver.getWindowHandles());
		//driver.close();
		driver.quit();

	}

}
