package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	//Adding Log4 to class
		public static Logger log = LogManager.getLogger(base.class.getName());//*** make sure it's - import org.apache.logging.log4j.Logger;

	
	
	@BeforeTest // moving from 'basePageNavigation() method
	public void initialize() throws IOException {
		driver=initializeDriver();// calling 'initializeDriver Method from 'base Class'
		driver.get(prop.getProperty("url"));//it shows 'error', because it triggers 1 time only as 'global' and remains in that page when 2data is typeing
		
	}

@Test(dataProvider="getData")// adding '@dataProvider' into @Test
public void basePageNavigation(String Username, String Password, String text) throws IOException {// adding 3 values/arguments/parameters to invoke DataProvider's data
//	driver=initializeDriver();
	driver.get(prop.getProperty("url")); // now it runs well, because 'url' is inside of method
	//creating another object/centralized method from 'Landing Page' - not from 'base Class'
	//1. inheritance 
	//2. creating an object to that class and invoke methods of it
	
	LandingPage landingpage = new LandingPage(driver);
	landingpage.getLogin().click();//driver.findElement(By.css()/
	
	//Creating another object/centralized method from 'Login Page
	LoginPage loginpage = new LoginPage(driver);
	loginpage.getLogin().sendKeys(Username);
	loginpage.getPassword().sendKeys(Password);;
	//System.out.println(text);
	log.info("Successfully validated Text Message" + text);
	
	loginpage.ClickLogin().click();
	
	
    }

   //Creating Data Provider Method

  @DataProvider
  public Object[][] getData() {
	 //Row stands for how many different data types test should run
	 //Column stands for how many values per each test
	  
	  //0th row
	  Object[][] data = new Object[2][3];// make sure to give how many index/rows and index/columns per row Array has, not from [0] starting point/location
	  data[0][0]="nonrestricteduser@qw.com";
	  data[0][1]="123456";
	  data[0][2]="Restricted User";
	  
	  //1st row
	  data[1][0]="restricteduser@qw.com";
	  data[1][1]="456778";
	  data[1][2]="Non Restricted user";
	  
	  return data;
  }
  @AfterTest
  public void teardown() {
  	 driver.close();
  	//this method will keep object memory clean from running tests all the time
  	 driver=null;// vs driver=initializeDriver();
  }


}
