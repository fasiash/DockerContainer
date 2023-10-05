package baseclass;

import org.openqa.selenium.WebDriver;

public class PageDriver
{
	private static ThreadLocal<WebDriver> webDriver=new ThreadLocal<>();
	public static WebDriver getDriver()
	{
		//getter
		return webDriver.get();
	}
	public static void setDriver(WebDriver driver)
	{
	webDriver.set(driver);	 
	}

}
