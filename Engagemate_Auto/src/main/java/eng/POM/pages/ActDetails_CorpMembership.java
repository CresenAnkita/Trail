package eng.POM.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class ActDetails_CorpMembership extends BaseClass {
	String b ;
	
	@FindBy (xpath = "//span[text()='Activity Details']")WebElement actDetails;
	@FindBy (xpath ="//*[@id=\"hcpGridEBGRD\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/div/a")WebElement EstimatedBudget;
	@FindBy (xpath ="(//span[text()='Spend Type'])[2]")WebElement spendType;
	@FindBy (xpath ="//input[contains(@placeholder,'Spend Type')]")WebElement selectOther;
	@FindBy (xpath ="//span[contains(text(),'Other ')]")WebElement selectedOther;
    @FindBy (xpath ="//mat-label[contains(text(),'You selected \"Other\" for Spend Type please specify')]/../../..//textarea[@rows='1']")WebElement sepecifiyOther;
    @FindBy (xpath ="//mat-label[text()='Amount']/../../..//input[@type='text']")WebElement amount;
	@FindBy (xpath ="//span[text()='Save']")WebElement saveActDetails;
	@FindBy (xpath ="//span[text()='Frequency of Payment']")WebElement frePayment;
	@FindBy (xpath ="//span[contains(text(),'Monthly')]")WebElement monthly;

	@FindBy (xpath ="(//span[text()='Corporate Membership'])[2]")WebElement CorpoSponso;
	@FindBy (xpath ="//mat-label[contains(text(),'Purpose of')]/../../..//textarea[@rows='1']")WebElement purpose;
	@FindBy (xpath ="//mat-label[contains(text(),'organization')]/../../..//textarea[@rows='1']")WebElement orgSelected;
	@FindBy (xpath ="//mat-label[contains(text(),'how the request')]/../../..//textarea[@rows='1']")WebElement theRequest;
	@FindBy (xpath ="//span[contains(text(),'Teva')]/../../../..//mat-select[@role='combobox']")WebElement hasTeva;
	@FindBy (xpath ="//*[@id=\"mat-option-175\"]/span")WebElement SelectedYesTeva;
	@FindBy (xpath ="//mat-label[contains(text(),'list what Teva')]/../../..//textarea[@rows='1']")WebElement TevaList;
	@FindBy (xpath ="//span[contains(text(),'uploading')]")WebElement uploadDoc;
	@FindBy (xpath ="(//span[contains(text(),'Document type')])[2]/../../..//mat-select[@role='combobox']")WebElement selDocType;
	@FindBy (xpath ="//span[contains(text(),' Other')]")WebElement selOther;
    @FindBy (xpath ="//button[@type='submit']")	WebElement close;
	@FindBy (xpath ="//span[contains(text(),'Save')]")WebElement saveActivity;
	
	
	
	
	
	
	public ActDetails_CorpMembership(){
			PageFactory.initElements(driver, this);
		}
	 public void clickOnActvityDetails() {
		 actDetails.click();
	 }

	 public void estimatedBudget() throws InterruptedException {
			EstimatedBudget.click();
			Thread.sleep(4000);
		}
	 public void selectSpendtype() throws InterruptedException {
			spendType.click();
			selectOther.sendKeys("Other");
			selectedOther.click();
			Thread.sleep(2000);
		}
	 
	 public void sendOtherSpendType() {
		 
		 sepecifiyOther.sendKeys("ABC");
	 }
	 public void sendAmount() throws InterruptedException {
			Thread.sleep(2000);
			amount.sendKeys("200");
			saveActDetails.click();
			Thread.sleep(2000);
		}
	 public void frequencyPayment() throws InterruptedException {
		 Thread.sleep(2000);
		 frePayment.click();
		 monthly.click();
	 }
	 public void clickOnCorporateSponsorship() {
		 CorpoSponso.click();
	 }
	 public void sendPurposeOfOrganization() {
		 purpose.sendKeys("ABC");
	 }
	 public void sendOrgSelected() {
		 orgSelected.sendKeys("ABC");
	 }
	 public void sendTheRequest() {
		 theRequest.sendKeys("ABC");
	 }
	 public void hasTeva() {
		 hasTeva.click();
		 SelectedYesTeva.click();
		
	 }
	 public void ListtheTeva() {
		 TevaList.sendKeys("5");
	 }
	 public void UploadDocuments() throws InterruptedException, AWTException {
		 uploadDoc.click();
		 Thread.sleep(1000);
		 selDocType.click();
		 Thread.sleep(1000);
		 selOther.click();
		 Thread.sleep(1000);
		WebElement fileUpload = driver.findElement(By.xpath("//mat-label[contains(text(),'choose file')]/../../..//"
				+ "input[@formcontrolname='documentName']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", fileUpload);

		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\Cresen\\Pictures\\ABC.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		close.click();
		
	 }
	 
	 public void clickSaveActivity() throws InterruptedException {
		 Thread.sleep(1000);
		 saveActivity.click();
		 Thread.sleep(5000);
	 }
	 
	
	 
	 
}
