package actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize()	;
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		
		WebElement double_click=driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(double_click).build().perform();
		Thread.sleep(1000);
		WebElement right_click=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(right_click).build().perform();
		Thread.sleep(1000);
		WebElement click_me=driver.findElement(By.xpath("//button[contains(text(),'Click Me')][3]"));
		act.click(click_me);
		Thread.sleep(1000);
		
	
        
		
		
	}//button[@id="CLuR2"and@class="btn btn-primary"type="button"

}
