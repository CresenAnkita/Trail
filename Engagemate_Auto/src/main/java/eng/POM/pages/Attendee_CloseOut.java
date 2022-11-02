package eng.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eng.base.BaseClass;

public class Attendee_CloseOut extends BaseClass
{
@FindBy (xpath ="//span[contains(text(),'Attendees')]")WebElement clcAttendees;
@FindBy (xpath ="//*[@id=\"hcpGridCLSFGRD\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[4]")WebElement editAttendees;
@FindBy (xpath ="//mat-label[contains(text(),'First Name')]/../../..//input[@type='text']")	WebElement editFirstname;
@FindBy (xpath ="//mat-label[contains(text(),'Last Name')]/../../..//input[@type='text']")WebElement editLastname;	
@FindBy (xpath ="//mat-label[contains(text(),'Address')]/../../..//input[@type='text']")WebElement editAddress;	
@FindBy (xpath ="(//span[contains(text(),'*Country')])[2]")WebElement slcCountry;	
@FindBy (xpath ="//input[contains(@placeholder,'Country')]")WebElement sendCountry;	
@FindBy (xpath ="//span[contains(text(),' United States')]")WebElement selectedUS;	
@FindBy (xpath ="//mat-label[contains(text(),'Postal Code')]/../../..//input[@type='text']")WebElement editPostalcode;	
@FindBy (xpath ="(//span[text()='Country Identifier Type'])[2]/../../../..//mat-select[@role='combobox']")WebElement slcCoutryIdtifierType;	
@FindBy (xpath ="//input[contains(@placeholder,\"Identifier Type\")]")WebElement sendCoutryIdtifierType;	
@FindBy (xpath ="//span[contains(text(),'PIN')]")WebElement PinCoutryIdtifierType;	
@FindBy (xpath ="(//mat-label[contains(text(),'Identifier')])[2]/../../..//input[@type='text']")WebElement sendCoutryIdtifier;	
@FindBy (xpath ="(//span[contains(text(),'License')])[2]")WebElement clcLicenseState;
@FindBy (xpath ="//input[contains(@placeholder,'License')]")WebElement sendLicenseState;
@FindBy (xpath ="//span[contains(text(),'California')]")WebElement clcCalifornia;
@FindBy (xpath ="//span[contains(text(),'Specialty')]")WebElement clcSpeciality;
@FindBy (xpath ="//input[contains(@placeholder,'Specialty')]")WebElement sendSpeciality;
@FindBy (xpath ="//span[contains(text(),'Acute Medicine')]")WebElement clcAcuteMedicine;
@FindBy (xpath ="//mat-label[contains(text(),'Paid')]/../../..//input[@type='text']")WebElement sendPaidEntity;
@FindBy (xpath ="//span[contains(text(),'Product')]")WebElement clcOnProduct;
@FindBy (xpath ="//input[@placeholder=\"Product\"]")WebElement sendInPlaceholder;
@FindBy (xpath ="(//span[contains(text(),' Actonel')])[1]")WebElement clcActonel;
//@FindBy (xpath ="//app-dashboard[@aria-hidden='true']")WebElement clcOnPage;


	 public Attendee_CloseOut(){
			PageFactory.initElements(driver, this);
		}
	 public void clickOnAttendees() {
		 clcAttendees.click();
	 }
	 public void editAttendees() {
		 editAttendees.click(); 
	 }
	 public void sendFirstName() throws InterruptedException {
    WebDriverWait wait=new WebDriverWait(driver,40);
	wait.until(ExpectedConditions.visibilityOf(editFirstname));	
	Thread.sleep(1000);
	editFirstname.sendKeys("ABC");
	 }
	 public void sendLastName() throws InterruptedException {
		 Thread.sleep(1000);
		 editLastname.sendKeys("XYZ");
	 }
	 public void sendAddress() throws InterruptedException {
		 Thread.sleep(1000);
		 editAddress.sendKeys("PQR");
		 
	 }
	 public void selectAttendeeCountry() throws InterruptedException {
		 Thread.sleep(1000);
		 slcCountry.click();
		 sendCountry.sendKeys("United States");
		 selectedUS.click();
	 }
	 public void sendPostalCode() throws InterruptedException {
		 editPostalcode.sendKeys("A123");
		
	 }
	 public void SelectCoutryIdtifierType() throws InterruptedException {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",slcCoutryIdtifierType );
			Thread.sleep(2000);
		 slcCoutryIdtifierType.click();
		 sendCoutryIdtifierType.sendKeys("PIN");
		 PinCoutryIdtifierType.click();
	 }
	 public void sendCoutryIdtifier() {
		 sendCoutryIdtifier.sendKeys("ABC");
	 }
	 public void selectLicenseState() {
		 clcLicenseState.click(); 
		 sendLicenseState.sendKeys("California");
		 clcCalifornia.click();
	 }
	  public void sendSpeciality() throws InterruptedException {
		  Thread.sleep(2000);
		  clcSpeciality.click();
		  sendSpeciality.sendKeys("Acute Medicine");
		  clcAcuteMedicine.click();
	  }
	  public void sendPaidEntity() throws InterruptedException {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",sendPaidEntity );
			 Thread.sleep(3000);
			  sendPaidEntity.sendKeys("ABC");
		  }
	  
	 public void selectProductType1() {
		
		 clcOnProduct.click();
			sendInPlaceholder.sendKeys("Actonel");
			clcActonel.click();
		 Actions act = new Actions(driver);
		 WebElement c =driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']"));

        	act.moveToElement(c).click().build().perform();
		   
		    //clcOnPage.click();
	 }
	  
	  
	  
	 
}
