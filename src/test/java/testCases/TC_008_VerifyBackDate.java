package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_008_VerifyBackDate extends BaseClass{
	
	@Test
	public void verifyLast15Days() {
		logger.info("***** Starting TC_006_VerifyCurrentDate *****");
		try {
			if(tt.backedDate())
			{
				logger.info("Last 15 days is displayed.");
			}
			else
			{
				logger.error("Last 15 days is not displayed.");
			}
		}
		catch(Exception e)
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
			
		}
		logger.info("***** Finished TC_008_VerifyBackDate *****");
	}

}
