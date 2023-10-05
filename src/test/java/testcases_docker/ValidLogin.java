package testcases_docker;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseclass.BaseTest;
import baseclass.PageDriver;




public class ValidLogin extends BaseTest
{
	WebDriver driver;
	@Test
	public void testclass() throws Exception
	{
		driver=PageDriver.getDriver();
		
		pageobjects_docker.LoginPage validpage=new pageobjects_docker.LoginPage();
		validpage.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
		
	//	ProductsPage productspage= new ProductsPage();
	//	productspage.waitForProducts();
//		driver.manage().window().maximize();
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();

	}
}
