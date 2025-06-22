package webdriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.nopcommerce.com/");
      Thread.sleep(2000);
      WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
   System.out.println(logo.isDisplayed());
   
      
      
      
      
	}

}
