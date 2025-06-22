package webdriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled_exmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	      Thread.sleep(2000);
	      WebElement enable=driver.findElement(By.xpath("//input[@id='FirstName']"));
	   System.out.println(enable.isEnabled());
	   

	}

}
