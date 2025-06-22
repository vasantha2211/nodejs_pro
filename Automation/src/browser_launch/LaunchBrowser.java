package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.id("email")).sendKeys("meghana@gmail.com"); //id
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("pass")).sendKeys("meghana123"); //name
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Log in")).click(); //linktext
		
		Thread.sleep(1000);

		

	}

}
