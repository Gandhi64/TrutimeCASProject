package pageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneCognizantPage extends BasePage{
	
	public  OneCognizantPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='oneC_searchAutoComplete']")
	WebElement chromeInputBox;

	@FindBy(id="oneC_searchAutoComplete")
    WebElement chromeInput;
	
	
	
	@FindBy(xpath="//li[@class='searchTopBar']")
	WebElement edgeSearch;
	@FindBy(xpath="//input[@id='oneCSearchTop']")
	WebElement edgeInputBox;

	public void chromeMethod() throws InterruptedException 
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> windows =driver.getWindowHandles();
		for(String w:windows)
		{
			String title = driver.switchTo().window(w).getTitle();
			if(title.equals("OneCognizant"))
			{
				driver.switchTo().window(w);
			}
		}
	//	Thread.sleep(3000);
	
		System.out.println("----------------------------------------");
   	
		chromeInputBox.click();
		
    //   Thread.sleep(3000);
		chromeInput.sendKeys("TruTime");

	}
	
	public void edgeMethod() throws InterruptedException {
	//Thread.sleep(5000);
	   System.out.println("----------------------------------------");
	
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));

	Set<String> windows =driver.getWindowHandles();
	for(String w:windows)
	{
		String title = driver.switchTo().window(w).getTitle();
		if(title.equals("OneCognizant"))
		{
			driver.switchTo().window(w);
		}
	}
	
	edgeSearch.click();
	//Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oneCSearchTop")));
	edgeInputBox.sendKeys("TruTime");
	}
	
	
}
