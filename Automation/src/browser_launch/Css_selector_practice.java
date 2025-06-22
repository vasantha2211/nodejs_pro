package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Chocoaltes");
		//Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("input.email")).sendKeys("Meghana");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("vasantha");
		//Thread.sleep(3000);
	driver.findElement(By.cssSelector("button.button-1 login-button[type='submit']")).click();
	Thread.sleep(5000);
		
		
	}

}
