package take_screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 Thread.sleep(3000);
 driver.get("https://demo.nopcommerce.com/");
 Thread.sleep(3000);
 TakesScreenshot ts=(TakesScreenshot) driver;
  // file=pre defined class in java
  File sourcefile=ts.getScreenshotAs(OutputType.FILE); //return type file
  File targetfile=new File(System.getProperty("user.dir")+"\\Screenshot\\fullpage.png");
 sourcefile.renameTo(targetfile); // method copy source to tARGETFILE
System.out.println("screenshot done successfully");
 }

}
