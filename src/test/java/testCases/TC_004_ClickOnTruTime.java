package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TruTime;
import testBase.BaseClass;

public class TC_004_ClickOnTruTime extends BaseClass {
    
	
	
	
	@Test
	public void verifyTruTime() {
		logger.info("***** Starting TC_004_ClickOnTruTime *****");
		try {
	    	logger.info("clicking on true time...");
	    	tt=new TruTime(driver);
			tt.selectTruTime();
			logger.info("Trutime clicked.");
		}
		catch(Exception e){
			logger.error("test failed");
			Assert.fail("An exception occured:"+ e.getMessage());
		}
		logger.info("***** Finished TC_004_ClickOnTruTime *****");
	}
}
