package eng.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class AdvisoryPagepr extends BaseClass{

	@FindBy (xpath = "//mat-label[text()=' Activity Title']/../../..//input") private WebElement ActivityTitle;
	@FindBy (xpath = "//*[@id=\"mat-input-1\"]") private WebElement ActivityStartDate;
	@FindBy (xpath ="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today')]")private WebElement SelectDate;
	@FindBy (xpath ="//*[@id=\"mat-input-2\"]")	private WebElement ActivityEndDate;

	public AdvisoryPagepr(){
		PageFactory.initElements(driver, this);
	}
	public void AdvisoryBoard(String title,String startdate,String Enddate) 
	{
		ActivityTitle.sendKeys(title);
		
		
	}
	
}
