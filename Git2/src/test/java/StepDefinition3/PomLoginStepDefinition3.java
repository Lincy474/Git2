/*package StepDefinition3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginpage;

public class PomLoginStepDefinition3 {
	WebDriver driver;
	loginpage login;
	@Given("User is on login")
	public void user_is_on_login() {
	   driver = new ChromeDriver();
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("User enters valid username and password")
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
	//public void user_enters_valid_username_and_password() {
		login= new loginpage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	    //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
	    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    //Thread.sleep(3000);
	}

	@And("Click on login Button")
	public void click_on_login_button() {
		//driver.findElement(By.xpath("//input[@id='login-button']")).click();
		login.clickLogin();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    //Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "User is navigated to home page");
		login.isLogoDisplayed();
		
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	
	
	
	
	
	
}
*/