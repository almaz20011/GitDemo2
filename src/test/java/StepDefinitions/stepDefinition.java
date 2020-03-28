package StepDefinitions;

import org.junit.runner.RunWith;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import pageObjects.portalHomePage;
import resources.base;



public class stepDefinition extends base {
	
	
/*
@Given("^Initialize the browser with chrome$")
public void initialize_the_browser_with_chrome() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver=initializeDriver();
}

@Given("^Navigate to \"([^\"]*)\" Site$")
public void navigate_to_Site(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	    driver.get(arg1);// this is exactly how is looks like from HomePage Class: driver.get(prop.getProperty("url"));
}

@Given("^Click on Login link in home page to land on Secure Sign in Page$")
public void click_on_Login_link_in_home_page_to_land_on_Secure_Sign_in_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	LandingPage landingpage = new LandingPage(driver);
	if(landingpage.getPopupSize()>0) {
		landingpage.getPopUp().click();
	  }
	landingpage.getLogin().click();
    
}


@Then("^Verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
    // added new method with wrong creadintials
	PortalHomePage p =new PortalHomePage(driver);
	Assert.assertTrue(p.getSearchBox().isDisplayed());
	
    
}


@When("^User enters (.+) and (.+) and logs in$")
public void user_enters_and_and_logs_in1(String username, String password) throws Throwable {
	LoginPage loginpage = new LoginPage(driver);
	loginpage.getLogin().sendKeys(username);
	loginpage.getPassword().sendKeys(password);;
	//System.out.println(text);
     loginpage.ClickLogin().click();
}

@And("^close browsers$")
public void close_browsers() throws Throwable {
    driver.quit();
}
   
    */
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver =initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		
		LandingPage l=new LandingPage(driver);
		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		l.getLogin().click(); //driver.findElement(By.css()
	   
	}

	

	@Then("^Verify that user is succesfully logged in$")
	public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
PortalHomePage p=new PortalHomePage(driver);
      Assert.assertTrue(p.getSearchBox().isDisplayed());
	}
	 @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		 LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(username);
			lp.getPassword().sendKeys(password);
	        lp.getLogin().click();
	    }
	 @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	        driver.quit();
	    }
	


}
