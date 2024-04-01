package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_009_VerifyLegends extends BaseClass{
	
	@Test
	public void verifyLast15Days() {
		logger.info("***** Starting TC_009_VerifyLegends *****");
		try {
			if(tt.legendsDisplayed())
			{
				logger.info("Legends is displayed.");
			}
			else
			{
				logger.error("Legends is not displayed.");
			}
		}
		catch(Exception e)
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
			
		}
		logger.info("***** Finished TC_009_VerifyLegends *****");
	}

	

}
