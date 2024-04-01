package pageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//div[text()='OneCognizant']")
	WebElement txt_one;
	
	
	@FindBy(xpath="//button[@id='O365_MainLink_Me']")
	WebElement UserButton;
	
	@FindBy(xpath="//div[@class='mectrl_accountDetails']/div[1]")
	WebElement UserInfo1;

	@FindBy(xpath="//div[@class='mectrl_accountDetails']/div[2]")
	WebElement UserInfo2;

	
	
	public WebElement UserButton()
	{
		return UserButton;
	}
	public WebElement UserInfo1()
	{
		return UserInfo1;
	}
	public WebElement UserInfo2()
	{
		return UserInfo2;
	}
	
	
	
	
    public void firstPage()  {
		
    	
    	System.out.println("----------------------------------------");
    	
    	WebElement scrollElement = driver.findElement(By.xpath("//*[@data-automation-id=\"contentScrollRegion\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[1];",scrollElement, 300);
        txt_one.click();
        System.out.println("OneCognizant Opened.");
		
	
    }
}
