package pageObjects;

import datejava.ExtractDate;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TruTime extends BasePage{
	public TruTime(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="//div[@class='appsSearchResult']")
	List<WebElement> ls;
	
	
	@FindBy(xpath="//*[contains(@class,'dayHeadr')]")
	List<WebElement> l1;
	
	
	
	@FindBy(xpath="//div[@class='weekContainer']/div/div[1][contains(@class,'dayHeadr active')]")
	WebElement todayDate;
	
	
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']")
	WebElement thisMonthYr;
	
	
	@FindBy(xpath="//span[@class='topupavailablefromDate ng-binding']")
	WebElement backDate;
	
	
	@FindBy(xpath="//div[@class='legendsList ng-scope']")
	WebElement legends;
	
	public void selectTruTime() throws InterruptedException
	{
		
		System.out.println("TruTime Entered......");
		//Thread.sleep(3000);
		
		ls.get(0).click();
		
		//Thread.sleep(3000);
		
	}
	
	
	public boolean currentWeekDetails() throws InterruptedException 
	{
		ExtractDate c=new ExtractDate();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		//Thread.sleep(3000);
		//driver.switchTo().frame(1);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(@class,'dayHeadr')]")));
	  // driver.switchTo().frame(1);
	   System.out.println("----------------------------------------");
	   System.out.println("checking current week details....");
		for(WebElement x: l1)
	    {
	    	System.out.println(x.getText());
	    } 
		ArrayList<String> ans=c.extractPresentWeek();
		 System.out.println("checking system calender week details....");
		for(String s:ans)
		{
			System.out.println(s);
		}
		int count=0;
		for(int i=0;i<ans.size();i++) {
			WebElement ele=l1.get(i);
			if(ele.getText()!=null && ele.getText().equals(ans.get(i))) {
				count++;
			}
		}
		if(count==7) {
			return true;
		}
		else {
			return false;
		}

	}
	
	public boolean currentDate()
	{
		System.out.println("----------------------------------------");
		System.out.println("Today date is ["+todayDate.getText()+"]");
		boolean status=todayDate.isDisplayed();
		return status;
	}
	
	public boolean currentMonYr()
	{
		System.out.println("----------------------------------------");	
		System.out.println("This month and year is ["+thisMonthYr.getText()+"]");
		boolean status=thisMonthYr.isDisplayed();
		
		return status;
	}
    
	
	public boolean backedDate() {
		 
		ExtractDate d=new ExtractDate();
		String bd=d.extractBackDate();
		System.out.println("----------------------------------------");
		System.out.println("[Today date - 15]");
		System.out.println(bd);
		System.out.println("BackDated topup until");
		System.out.println(backDate.getText());
		if(bd.equals(backDate.getText()))
				{
			      return true;
				}
		else {
			return false;
		}
	}
	
	
	public boolean legendsDisplayed()
	{
		
		
		System.out.println("----------------------------------------");
		System.out.println("legends are...");
		System.out.println(legends.getText());
		boolean status =legends.isDisplayed();
		System.out.println("legends content is visbile");
		System.out.println("----------------------------------------");
		return status;
	}

}
