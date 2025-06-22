package module1_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	      
	        driver.get("https://demo.guru99.com/test/newtours/register.php");
	       String title= driver.getTitle();
	       System.out.println("Title of page is:"+" "+title);
	       
	       
	     Thread.sleep(1000);
	      
	        driver.findElement(By.cssSelector("option[value='KUWAIT']")).click();
	        Thread.sleep(1000);
	       
	}

}
