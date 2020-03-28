package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	/*
	
	   public WebDriver driver;

		// TODO Auto-generated method stub
		By searchBox = By.name("query");

		public PortalHomePage(WebDriver driver) {
		
			this.driver = driver;
		}
		
		
		public WebElement getSearchBox() {
			return driver.findElement(searchBox);
		}

		*/
	
public WebDriver driver;
	
	By searchBox=By.name("query");
	
	
	
	
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
	
		
		

}
