package eng.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import eng.base.BaseClass;

public class Approval extends BaseClass
{
	WebDriverWait wait=new WebDriverWait(driver, 20);

	String b;
	
	@FindBy (xpath ="//span[@class='font-weight-bold ng-star-inserted']")WebElement getActID;

	@FindBy (xpath ="//div[@class='card1-block p-3']") WebElement approv1;
    @FindBy (xpath ="/html/body/app-dashboard/div/main/div/app-activity/div/div[2]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/a")WebElement clickonedit;
	//@FindBy (xpath ="//span[contains(text(),'Nominees')]")WebElement clOnNominee;
    @FindBy (xpath ="//span[text()='Approve']")WebElement approve1;
	@FindBy (xpath ="//mat-label[text()='Leave a comment']/../../..//textarea[@rows='1']")WebElement leaveComm;
	@FindBy (xpath ="(//span[text()='Approve'])[2]")WebElement appcomm;
	
    @FindBy (xpath ="//div[text()=' General Reviewer  -  Commercial ']")WebElement clcReviwer;
	
	@FindBy (xpath ="(//button[@type='button'])[3]")WebElement navbarLogOut;
	@FindBy (xpath ="//b[text()=' LOG OUT ']")WebElement logout;
	@FindBy (xpath ="(//span[@class='ag-header-icon ag-header-cell-menu-button'])[1]")WebElement clcFilter;
	@FindBy (xpath ="(//span[@class='ag-icon ag-icon-filter'])[10]")WebElement clickOnFilterOpt;
	@FindBy (xpath ="(//input[contains(@placeholder,'Filter')])[1]")WebElement srcOption;
	
	
	
	
	
	public Approval(){
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickApprov1() throws InterruptedException {
		
		 approv1.click();
		 Thread.sleep(2000);
	}
	public void clickOnEdit() throws InterruptedException {
		clickonedit.click();
		WebElement clOnNominee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[contains(text(),'Nominees')]")));
		Thread.sleep(2000);
		clOnNominee.click();
		
	}
	
	public void approveNominee() throws InterruptedException {
		approve1.click();
		Thread.sleep(2000);

	}
	public void LeaveComment() throws InterruptedException {
		leaveComm.sendKeys("approved1");
		appcomm.click();
		Thread.sleep(3000);
		//driver.close();
	}
	
	public void logAsSecondReviewr() throws InterruptedException {
		
		clcReviwer.click();
		Thread.sleep(2000);
	}
	
	public void loggingOut() {
		navbarLogOut.click();
		logout.click();
	}
	
	
	public void clickOnFilter() throws InterruptedException {
		Thread.sleep(2000);
		clcFilter.click();
		clickOnFilterOpt.click();
		srcOption.sendKeys(b);
	}
	
}


