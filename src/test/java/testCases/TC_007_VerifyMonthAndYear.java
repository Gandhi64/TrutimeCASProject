package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC_007_VerifyMonthAndYear extends BaseClass{
	

	@Test
	public void verifyPresentMonYear() {
		logger.info("***** Starting TC_007_VerifyMonthAndYear *****");
		try {
		 
			if(tt.currentMonYr())
			{
				logger.info("Current month and year are visible.");
			}
			else
			{
				logger.error("Current month and year are not visible.");
			}
		}
		catch(Exception e)
		{
			logger.error("test failed.");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		logger.info("***** Finished TC_007_VerifyMonthAndYear *****");
	}

}
