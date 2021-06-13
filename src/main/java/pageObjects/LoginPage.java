package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;

public LoginPage(WebDriver driver)
{
this.driver = driver;	
}

By userName = By.cssSelector("#user_email");
By password = By.cssSelector("#user_password");
By login = By.xpath("//*[@id=\"hero\"]/div/form/div[3]/input");

public WebElement getUserName ()
{
	return driver.findElement(userName);
	}
public WebElement getPassword ()
{
return driver.findElement(password);	
}
public WebElement getLogin() {
	return driver.findElement(login);
}

}
