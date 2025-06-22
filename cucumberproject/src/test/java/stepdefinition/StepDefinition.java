package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
		// TODO Auto-generated method stub
		@Given("user is on loginpage")
		public void user_is_on_loginpage() throws InterruptedException {
		    driver= new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    Thread.sleep(2000);
		}

		@When("user enters valid username and password")
		public void user_enters_valid_username_and_password() {
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		   
		}

		@When("click on login biutton")
		public void click_on_login_biutton() {
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
		    
		}

		@Then("user is navigated to the home page")
		public void user_is_navigated_to_the_home_page() {
			System.out.println("user is on home page");
			
		}
		
		
	
		

		@Then("click on menu dropdown and select logout")
		public void click_on_menu_dropdown_and_select_logout() {
			 driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
			   
		}

		@Then("click on logout")
		public void user_is_navigated_outside_webpage() {
		    driver.findElement(By.linkText("Logout")).click();
		}





	
////span[@class="oxd-userdropdown-tab"]
}//Logout
