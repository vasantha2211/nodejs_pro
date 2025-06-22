package drop_down_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_handling_exmp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		Thread.sleep(1000);
		WebElement course=driver.findElement(By.id("course"));
		Select coursename_dropdown=new Select(course);
		List<WebElement> course_name_dropdown_options=coursename_dropdown.getOptions();
		
		for(WebElement option:course_name_dropdown_options) {
			System.out.println("list of elements are:"+""+option.getText());
			
		}
		coursename_dropdown.selectByIndex(2); // python
		Thread.sleep(1000);
		coursename_dropdown.selectByValue("net"); //dotnet
		Thread.sleep(1000);
		coursename_dropdown.selectByVisibleText("Javascript"); //javascript
		Thread.sleep(1000);
		
		String first_selected=coursename_dropdown.getFirstSelectedOption().getText();
		System.out.println("first selected option is"+""+first_selected);
		
		
		

	}

}
