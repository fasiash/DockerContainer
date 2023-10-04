package pageobjects_docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class LoginPage {
public 	WebDriver driver;

	public LoginPage()
	{
	
		driver=baseclass.PageDriver.getDriver();
		PageFactory.initElements(driver,this);
	}
//	public WebElement UserName;
//	public WebElement password;
//	public WebElement signIn;
//	
	@FindBy(id="user-name")
	public WebElement UserName;
	
	@FindBy(id="password")
	public WebElement password;

	@FindBy(id="login-button")
	public WebElement signIn;

	public void login(String username,String Password)
	{
	//	UserName=driver.findElement(By.id("user-name"));
	//	password=driver.findElement(By.id("password"));
	//	signIn=driver.findElement(By.id("login-button"));
		UserName.sendKeys(username);
		password.sendKeys(Password);
		signIn.click();
	}
}
