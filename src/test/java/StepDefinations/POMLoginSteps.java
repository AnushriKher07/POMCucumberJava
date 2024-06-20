package StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginSteps {
	static WebDriver driver;
	loginpage login;


	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		login = new loginpage(driver);

	}

	@When("user enters: {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
	    
		login.enterUsername(username);
		login.enterPassword(password);
		


	}
	@And("clicks on login page")
	public void clicks_on_login_page() throws InterruptedException 
	{
		login.clickLogin();



	}
	
	@Then("User is navigated to Homepage")
	public void User_is_navigated_to_Homepage()
	{
		login.isMessageDisplayed();
	}
	
	
	@Then("close the browser")

	public void close_the_browser() {
		
		driver.quit();

	}


}
