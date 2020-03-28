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

public class ValidateTitle extends base {
	//Adding Log4 to class
	public static Logger log = LogManager.getLogger(base.class.getName());//*** make sure it's - import org.apache.logging.log4j.Logger;
	
	@BeforeTest // moving from 'basePageNavigation() method
	public void initialize() throws IOException {
		driver=initializeDriver();// calling 'initializeDriver Method from 'base Class'
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}


@Test
public void ValidateAppTitle() throws IOException {
//	driver=initializeDriver();// calling 'initializeDriver Method from 'base Class'
//	driver.get(prop.getProperty("url"));
	
	
	
	LandingPage landingpage = new LandingPage(driver);
	//compare the text from the browser with actual text. -Error..
	Assert.assertEquals(landingpage.getTitle().getText(), "FEATURED COURSES1234");
	log.info("Succesfully Validated Text message");
	
	
  }
@AfterTest
public void teardown() {
	 driver.close();
	 
	 //this method will keep object memory clean from running tests all the time
	 driver=null;// vs driver=initializeDriver();
}

}
