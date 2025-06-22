package module1_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://demo.guru99.com/test/radio.html");
       Thread.sleep(2000);
       
        
    
       driver.findElement(By.id("vfb-7-1")).click();
        Thread.sleep(1000);
       
      driver.findElement(By.id("vfb-6-1")).click();
       Thread.sleep(1000);
       driver.findElement(By.id("vfb-6-2")).click();
       Thread.sleep(1000);
       driver.findElement(By.linkText("New Tours")).click();
       Thread.sleep(2000);
       driver.findElement(By.linkText("REGISTER")).click();
       
        WebElement drop_down=  driver.findElement(By.name("country"));
       Select sl =new Select(drop_down) ;
       sl.selectByValue("KUWAIT");
       String title= driver.getTitle();
       System.out.println("Title of page is:"+" "+title);
       
     
       
        
        
	}
}
