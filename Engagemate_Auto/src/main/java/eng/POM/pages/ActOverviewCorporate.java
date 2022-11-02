package eng.POM.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eng.base.BaseClass;

public class ActOverviewCorporate extends BaseClass{
	
	@FindBy (xpath = "//mat-label[text()=' Activity Title']/../../..//input")WebElement ActivityTitle;
	@FindBy (xpath = "//*[@id=\"mat-input-1\"]")WebElement ActivityStartDate;
	@FindBy (xpath ="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today')]")WebElement SelectTodaysDate;
	@FindBy (xpath ="//*[@id=\"mat-input-2\"]")WebElement ActivityEndDate;
	
	@FindBy (xpath ="//span[contains(text(),'Project Originator')]")WebElement projectOrginator;
	@FindBy (xpath ="//input[@placeholder='Project Originator']")WebElement sendprojectOrginator;
	@FindBy (xpath ="//span[starts-with(text(),' harshini.reviewer ')]")WebElement selectprojectOrginator;
	
	@FindBy (xpath ="//span[contains(text(),'Designated ')]")WebElement selectDesReviewer;
	@FindBy (xpath ="//input[contains(@placeholder,'Designated Reviewer')]")WebElement sendDesReviewer;
	@FindBy (xpath ="//span[text()=' aparna.popuri1 ']")WebElement reviwerSelected;
	
	@FindBy (xpath ="(//span[contains(text(),'Country')])[2]")WebElement countryselect;
	@FindBy (xpath ="//input[contains(@placeholder,'Country Financially Responsible')]")WebElement sendCountry;
	@FindBy (xpath ="//span[contains(text(),'United States')]")WebElement countrySelected;
	@FindBy (xpath ="//span[contains(text(),'Area/Product')]")WebElement therapeuticArea;
	@FindBy (xpath ="//span[contains(text(),'ADASUVE')]")WebElement therapeuticAreaSelected;
	@FindBy (xpath ="//span[contains(text(),'other activities?')]")WebElement otherActivity;
	@FindBy (xpath ="//span[contains(text(),' Yes ')]")WebElement otherActivityselectedYES;
	@FindBy (xpath ="//ag-grid-angular[@id='hcpGridRAGRID']//div//em[@class='fa fa-pencil']")WebElement editActDetails;
	@FindBy (xpath ="//span[text()=' 2017-000005 ']")WebElement IDselected;
	@FindBy (xpath ="(//span[contains(text(),'Save')])[2]")WebElement IDsave;
	@FindBy (xpath ="//span[contains(text(),'Save ')]")WebElement ActSave;


	 public ActOverviewCorporate(){
			PageFactory.initElements(driver, this);
		}
	 public void sendActivityTitle() throws IOException, InterruptedException
		{
			Thread.sleep(2000);
			ActivityTitle.sendKeys("abc");
			
	     }
		public void selectStartDate() throws InterruptedException
		{Thread.sleep(2000);
			ActivityStartDate.click();
			SelectTodaysDate.click();
		}
		public void selectEndDate() throws InterruptedException
		{
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			ActivityEndDate.click();
			SelectTodaysDate.click();
			
		}
		public void SelectProjectOrginator() throws InterruptedException
		{
			Thread.sleep(2000);
			projectOrginator.click();
			sendprojectOrginator.sendKeys("harshini.reviewer");
			selectprojectOrginator.click();
			
		}
		
		public void selectDesignatedReviewer() throws InterruptedException
		{
			Thread.sleep(2000);
			selectDesReviewer.click();
			sendDesReviewer.sendKeys("aparna.popuri1");
			reviwerSelected.click();
       }
		
		public void selectCountryResponsible() throws InterruptedException
		{
			countryselect.click();
			sendCountry.sendKeys("United States");
			countrySelected.click();
			Thread.sleep(2000);
		
		}
		public void selectTherapeuticArea() throws InterruptedException
		{
			therapeuticArea.click();
			therapeuticAreaSelected.click();
			Thread.sleep(2000);
		
		}
		
		public void selectOtherActivity() throws InterruptedException
		{otherActivity.click();
		otherActivityselectedYES.click();
		Thread.sleep(2000);
		}
		
		public void editActivityDeatails() throws InterruptedException
		{
			editActDetails.click();
//			WebElement selectActID=driver.findElement(By.xpath("(//span[text()='Activity ID'])[3]"));
//			Thread.sleep(20000);
			WebDriverWait wait=new WebDriverWait(driver,40);
			WebElement selectActID= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "(//span[text()='Activity ID'])[3]")));
			selectActID.click();
			IDselected.click();
		}
		
		public void saveActivityID() throws InterruptedException
		{ 
			IDsave.click(); 
			Thread.sleep(2000);
		}
		
		public void purposeObjective() throws InterruptedException
		{
            WebElement purpose = driver.findElement(By.xpath("//mat-label[contains(text(),'Objective')]/../../..//textarea[@rows='1']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
 		    js.executeScript("arguments[0].scrollIntoView();",purpose);
 		    purpose.sendKeys("ABC");
	  }
		public void saveActivityOverview() throws InterruptedException {
			ActSave.click();
			Thread.sleep(4000);
		}
		



}
