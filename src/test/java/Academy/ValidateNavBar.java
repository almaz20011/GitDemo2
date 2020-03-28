package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import pageObjects.LandingPage;

import resources.base;

//Adding 4logs
//Generating HTML Reports
//Screenshots on Failure
//Jenkins Integration




public class ValidateNavBar extends base {
	//Adding Log4 to class
	public static Logger log = LogManager.getLogger(base.class.getName());//*** make sure it's - import org.apache.logging.log4j.Logger;

	
	@BeforeTest // moving from 'basePageNavigation() method
	public void initialize() throws IOException {
		driver=initializeDriver();// calling 'initializeDriver Method from 'base Class'
		driver.get(prop.getProperty("url"));
	}

@Test
public void validateAppNavBar() throws IOException {
//	driver=initializeDriver();// calling 'initializeDriver Method from 'base Class'
//	driver.get(prop.getProperty("url"));
	
	
	
	LandingPage landingpage = new LandingPage(driver);
	//compare the text from the browser with actual text. -Error..
	Assert.assertTrue(landingpage.getNavBar().isDisplayed());
	log.info("Navigation Bar is Successfully Displayed ");
  }

@AfterTest
public void teardown() {
	 driver.close();
	//this method will keep object memory clean from running tests all the time
	 driver=null;// vs driver=initializeDriver();
}

}
