package testcases_docker;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.BaseTest;
import baseclass.PageDriver;
import pageobjects_docker.LoginPage;



public class InvalidLogin extends BaseTest
{
	@Test
	public void testclass()
	{	
		WebDriver driver=PageDriver.getDriver();
		LoginPage validpage=new LoginPage();
		validpage.login("standard_user", "secret_sauce1");

//		driver.manage().window().maximize();
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce1");
//		driver.findElement(By.id("login-button")).click();

	}
}
