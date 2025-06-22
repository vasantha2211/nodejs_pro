package keyboard_events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Edit_text_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(5000);
		
	driver.findElement(By.xpath("// textarea[@name='text1']")).sendKeys("hi all,welcome");
	Thread.sleep(1000);
Actions act=new Actions(driver);
WebElement Source=driver.findElement(By.xpath("// textarea[@name='text1']"));
	act.keyDown(Source, Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
Thread.sleep(2000);
act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	WebElement Target=driver.findElement(By.xpath("// textarea[@name='text2']"));
	act.keyDown(Target,Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
Thread.sleep(2000);
	}

}
