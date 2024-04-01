package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_006_VerifyCurrentDate extends BaseClass{

	
	@Test
	public void verifyPresentDate() {
		logger.info("***** Starting TC_006_VerifyCurrentDate *****");
		try {
			
			if(tt.currentDate())
			{
				logger.info("Current date is visible.");
				
			}
			else {
				logger.error("Current date is not visible.");
				
			}
		}
		catch(Exception e)
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		logger.info("***** Finished TC_006_VerifyCurrentDate *****");
	}
}
