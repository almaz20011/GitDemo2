package resources;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	//Setting Global WebDriver
	public static WebDriver driver;// ** using 'static' to 'driver as an object' to keep have only one object up to get it'null'. Another class can't modified object
	//Setting Global 'prop/url/'
	public Properties prop; //  ***** - from this stage CONVERTING TO TESTNG XML FILE !
	public WebDriver initializeDriver() throws IOException {
		
		//Properties prop = new Properties(); moved to up as 'Global prop'
		prop=new Properties();// local/method 'prop' - splitting/taking a Life from Global, see above
		FileInputStream fis = new FileInputStream("/Users/almaz/ProjectAlmaz/src/main/java/resources/data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {// *** make sure to use 'equals' to refere/bring to Life the different object's value, not ==, 
			//execute in chrome driver
			System.setProperty("webdriver.chrome.driver","/Users/almaz/Downloads/chromedriver");
			 driver =new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/almaz/Downloads/geckodriver");
			 driver = new FirefoxDriver();
			
		}else if(browserName=="IE") {// '==' is wrong way to bring to Life, the driver !
			//not available
			
		}
		
		
		//Setting synchron 'global implicitlyWait'
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	//*** Creating 'Screen Shot Failure' method to generate report
	public void getScreenshot(String result) throws IOException{// *** expecting/passing 'result' from 'Listeners Method to make sure it could capture/keep all pictures
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("/Users/almaz/ProjectAlmaz/src/test/" + result + "screenshot.png"));
	}
	

}

