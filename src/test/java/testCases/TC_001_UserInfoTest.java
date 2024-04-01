package testCases;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import pageObjects.HomePage;
 
import testBase.BaseClass;

public class TC_001_UserInfoTest extends BaseClass {
	
	
	
	@Test
	public void verifyUserInfoDisplay()
	{
		logger.info("***** Starting TC_001_UserInfoTest *****");
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(hp.UserButton()));
			while(true)
			{
			      try
				   {
			    	  element.click();
				    if(hp.UserInfo1().isDisplayed() && hp.UserInfo2().isDisplayed() )
				    {
				    	System.out.println(hp.UserInfo1().getText());
				    	System.out.println(hp.UserInfo2().getText());
				    	
				      
				    	logger.info("user info is taken.");
					  break;
				     }
				   }
				   catch(Exception e)
				    {
					   
				    }
			 }
			
		}
		
		catch(Exception e )
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		logger.info("***** Finished TC_001_UserInfoTest *****");
	}

}
