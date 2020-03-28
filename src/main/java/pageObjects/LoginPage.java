package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//1. creating variable 
	public WebDriver driver;
	
	By email=By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[id='user_password']");
	By login = By.cssSelector("[value='Log In']");
	
	
	//2. creating constructor to bring to Life that variable
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	// 3.building a method with that variable/return
	public WebElement getLogin() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickLogin() {
		return driver.findElement(login);
	}
}
