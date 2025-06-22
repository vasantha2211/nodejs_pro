package xpath_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='_6ltg']//child:: a")).click();
		driver.findElement(By.xpath("//button[@name='login']//parent::div")).click();
		Thread.sleep(2000);
	

	}

}
