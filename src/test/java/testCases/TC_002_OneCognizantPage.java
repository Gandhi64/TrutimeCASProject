package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_002_OneCognizantPage extends BaseClass{
	

	@Test
	public void navigateToOneC()
	{
		
		
		logger.info("***** Starting TC_002_OneCognizantPage *****");
		try {
			logger.info("Navigating to One Cognizant...");
			//Thread.sleep(3000);
			hp.firstPage();

			logger.info("One Cognizant Page is opened.");
		}
		catch(Exception e )
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		logger.info("***** Finished TC_002_OneCognizantPage  *****");
		
		
	}
}
