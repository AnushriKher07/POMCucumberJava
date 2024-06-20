package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
WebDriver driver;

//Constructor to initialize WebDriver
public loginpage(WebDriver driver) {
    this.driver = driver;
}


By txt_username = By.name("username");
By txt_password = By.name("password");
By btn_login = By.className("button");
By txt_message = By.xpath("//h1[@class='title']");


public void enterUsername(String username) {
	
driver.findElement(txt_username).sendKeys(username);

}

public void enterPassword(String password) {
	
driver.findElement(txt_password).sendKeys(password);

}

public void clickLogin() {
	
	driver.findElement(btn_login).click();

}
public void isMessageDisplayed()
{
	driver.findElement(txt_message).isDisplayed();
}

public void userLogin(String username, String password)
{
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);


}
}
