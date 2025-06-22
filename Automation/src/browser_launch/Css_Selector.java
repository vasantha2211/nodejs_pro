package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input#email")).sendKeys("meghana"); // tag and id
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input._9npi")).sendKeys("vasantha");// tag and classname
		//Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123");
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[id='email']")).sendKeys("vasantha@gmaIL");
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._9npi[id='pass']")).sendKeys("12345");
		Thread.sleep(2000);
	}

}
