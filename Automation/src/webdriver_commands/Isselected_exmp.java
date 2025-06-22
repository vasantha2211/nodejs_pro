package webdriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_exmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	      Thread.sleep(2000);
	      
	     WebElement femalebutton= driver.findElement(By.xpath("//input[@value='F']"));
	     Thread.sleep(1000);
	      
	     // System.out.println(femalebutton.isSelected());
	      
	      driver.findElement(By.xpath("//input[@value='F']")).click();
	      
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	     Thread.sleep(1000);
	     
	     
	    WebElement femalebutton1= driver.findElement(By.xpath("//input[@id='gender-female']"));
	    System.out.println(femalebutton1.isSelected());
	    
	    WebElement femalebutton2= driver.findElement(By.xpath("//input[@id='gender-male']"));
	    System.out.println(femalebutton2.isSelected());
	      
	     
	      
	}//input[@id='gender-female']

}
