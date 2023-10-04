package pageobjects_docker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ProductsPage {
public WebDriver driver;
	public ProductsPage(){
		
		driver=baseclass.PageDriver.getDriver();
	}
	
	public WebElement ProductsTest=driver.findElement(By.xpath("//span[@class='title']"));
	//public WebElement password=driver.findElement(By.id("password"));
	//public WebElement signIn=driver.findElement(By.id("login-button"));
	
	WebDriverWait wait;
	public void waitForProducts()
	{
		wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ProductsTest));
		
	}
}
