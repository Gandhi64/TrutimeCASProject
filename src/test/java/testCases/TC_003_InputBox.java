package testCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.OneCognizantPage;
import testBase.BaseClass;

public class TC_003_InputBox extends BaseClass{
	
	
	
	@Test
	
	@Parameters({"browser"})
	public void enterInput(String browser) 
	{
		logger.info("***** Starting TC_003_inputbox *****");
		try {
			
		
		if(browser.equalsIgnoreCase("chrome")){
			
			op=new OneCognizantPage(driver);
	    	logger.info("clicking on input box......");
			op.chromeMethod();
			logger.info("input box clicked.");
			
			
		}
		else if(browser.equalsIgnoreCase("edge")){
			
			op=new OneCognizantPage(driver);
	    	logger.info("clicking on input box......");
			op.edgeMethod();
			logger.info("input box clicked.");
		}
		}	
		
		
			catch(Exception e )
			{
				logger.error("test failed.");
				Assert.fail("An exception occured:"+ e.getMessage());
			}
		logger.info("***** Finished TC_003_inputbox *****");
	}

}
