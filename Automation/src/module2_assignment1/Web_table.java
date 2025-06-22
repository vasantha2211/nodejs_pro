package module2_assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(4000);
		 
		 int rows=driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		 System.out.println("row size is:"+" "+rows);
		 int columns=driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td")).size();
		 System.out.println("coloumn size is:"+" "+columns);
		 for(int r=1;r<=27;r++) {
			 for(int c=1;c<=1;c++) {
				 String Text=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+r+"]//td["+c+"]")).getText();
				 
				System.out.println(Text);
			 }
		 }
		 
		 

	}
	

}
