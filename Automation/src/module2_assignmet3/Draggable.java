package module2_assignmet3;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Draggable")).click();
		Thread.sleep(2000);
		WebElement iframe1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe1);
		//Actions a=new Actions(driver);
		WebElement draggable=driver.findElement(By.id("draggable"));
		          //a.dragAndDropBy(draggable,300,100).build().perform();
		         
		  		//Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].style.transform='translate(75px,115px)';",draggable);
	Thread.sleep(1000);
	
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destFile=new File("C:\\Users\\Admin\\Pictures\\Screenshots\\screenshot5.png");
	

	Thread.sleep(2000);
	
	
		
		
		
		
		
		

	}

}
