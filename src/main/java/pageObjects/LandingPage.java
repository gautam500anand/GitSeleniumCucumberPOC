package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	By signIn = By.cssSelector("a[href= 'https://rahulshettyacademy.com/sign_in/']");
	By title = By.cssSelector(".text-center>h2");
	By navigationBar = By.xpath("//*[@id=\"homepage\"]/header/div[2]");

	public WebElement getSignIn() {
		return driver.findElement(signIn);

	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navigationBar);
	}
}
