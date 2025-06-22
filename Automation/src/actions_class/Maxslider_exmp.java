package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Maxslider_exmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement max_slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
		Thread.sleep(1000);
	
		  
		Actions a=new Actions(driver);
		System.out.println("before operation"+max_slider.getLocation());
		
		
		a.dragAndDropBy(max_slider,-100,0).build().perform();
		
		Thread.sleep(1000);		
		System.out.println("after operation"+max_slider.getLocation());
		
		
		
		
		
				

	}

}
