package module2_assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("0135");
		Thread.sleep(4000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(4000);
	
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		

	}

}
