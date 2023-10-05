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
		 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		 ChromeOptions options = new ChromeOptions();
	     //options.setAcceptInsecureCerts(true);
	   //System.out.println(driver);
	      //  ChromeOptions options = new ChromeOptions();
	   options.setCapability(CapabilityType.BROWSER_NAME,"chrome");
	   //options.setBrowserVersion("117.0.5938.132");
	  
	    try {
	    	System.out.println();
	    driver = new RemoteWebDriver(new URL("http://localhost:4410/wd/hub"), options);
	    
	       
	    } catch (Exception e) {
	    	// driver.get("https://www.saucedemo.com/");
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
