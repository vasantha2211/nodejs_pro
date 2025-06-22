package xpath_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_methods_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Dhruthi");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='royal-email'and@ id='email']")).sendKeys("Shanmukha");
		driver.findElement(By.xpath("//input[@data-testid='royal-email'or@ id='pass']")).sendKeys("Shanmukha");
	

	}

}
