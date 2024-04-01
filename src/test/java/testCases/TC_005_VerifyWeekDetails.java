package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TruTime;
import testBase.BaseClass;

public class TC_005_VerifyWeekDetails extends BaseClass{

	
	@Test
	public void comparingWeek(){
		
		logger.info("***** Starting TC_005_VerifyWeekDetails *****");
		try {
		tt=new TruTime(driver);
			if(tt.currentWeekDetails()==true) {
				
			
			logger.info("Current week details matches with the system calendar");
			}
			else {
				logger.error("Current week details does not match with system calendar");
			
			}}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		
		logger.info("***** Finished TC_005_verifyWeekDetails *****");
	}
}
