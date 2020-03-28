package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	//1. creating variable 
	/*
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By navbar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup = By.xpath("//div[text()='NO THANKS']");
	
	//2. creating constructor to bring to Life that variable
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	// building a method with that variable/return
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	public WebElement getNavBar() {
		return driver.findElement(navbar);
	}
	public int getPopupSize() {
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp() {
		return driver.findElement(popup);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	*/
	
public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By NavBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By popup=By.xpath("//button[text()='NO THANKS']");
	
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	
	
}
