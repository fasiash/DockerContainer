package baseclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.CapabilityType;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;





public class BaseTest 
{
	WebDriver driver=null;
	 WebDriverWait wait;
	 @BeforeClass
	 public void browsersetup() throws MalformedURLException
	 {
		 ChromeOptions options = new ChromeOptions();
	     options.setAcceptInsecureCerts(true);
	     options.setCapability(CapabilityType.BROWSER_NAME,"chrome");
	  
	    try {
	  	   driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
	       
	    } catch (MalformedURLException e) {
	        System.out.println("Invalid grid URL");
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	driver.get("https://www.saucedemo.com/");
		 PageDriver.setDriver(driver);
	 }
	 @AfterClass
	 public void teardown()
	 {
		 PageDriver.getDriver().quit();
		 //or
		 driver.quit();
	 }
	}
