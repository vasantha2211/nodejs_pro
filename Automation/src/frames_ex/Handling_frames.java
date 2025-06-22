package frames_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		//driver.switchTo().frame(0); // framename index is 0
		driver.switchTo().frame(frame1); //frame name is frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi all welcome");
	    driver.switchTo().defaultContent();
		 //frame2
	    
		
	    WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
		//driver.switchTo().frame(1); // framename index is 0
		driver.switchTo().frame(frame2); //frame name is frame1
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Hi all welcome to frame2");
	    driver.switchTo().defaultContent();
	}

}
