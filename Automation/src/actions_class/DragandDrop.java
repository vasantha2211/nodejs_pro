package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.id("box2"));
		Thread.sleep(1000);
		WebElement Target=driver.findElement(By.id("box105"));
		Thread.sleep(1000);
		
	Actions a=new Actions(driver);
	a.dragAndDrop(source, Target).build().perform();
	
	WebElement source2=driver.findElement(By.id("box3"));
	Thread.sleep(1000);
	WebElement Target2=driver.findElement(By.id("box103"));
	Thread.sleep(1000);
	
	Actions a1=new Actions(driver);
	a1.dragAndDrop(source2, Target2).build().perform();
	Thread.sleep(1000);
	
	
	
	}

}
