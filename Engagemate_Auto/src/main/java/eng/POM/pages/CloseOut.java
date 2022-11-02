package eng.POM.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class CloseOut extends BaseClass
{
	@FindBy (xpath ="/html/body/app-dashboard/div/main/div/app-activity/div/div[2]"
 + "/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a")WebElement slcPencil;

	@FindBy (xpath ="//span[contains(text(),'Step 3 - Close-Out')]")WebElement closeOut;
	@FindBy (xpath ="//span[contains(text(),'Do you need to enter close')]")WebElement needCloseDetail;
	@FindBy (xpath ="//span[contains(text(),' Yes')]")WebElement detailYes;
	@FindBy (xpath ="//span[contains(text(),'Payment')]")WebElement PaymentTerm;
	@FindBy (xpath ="//input[contains(@placeholder,'Payment')]")WebElement sendPayment;
	@FindBy (xpath ="//span[contains(text(),' 30')]")WebElement clc30;
	@FindBy (xpath ="//mat-label[text()='Comments']/../../..//textarea[@rows='1']")WebElement comments;
	@FindBy (xpath ="//span[text()='Nominated Service Providers']")WebElement clcNomSrcProvider;
	@FindBy (xpath ="//*[@id=\"hcpGridCLSSGRD\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/div/a")WebElement editNomSrcProvider;
	@FindBy (xpath ="//span[contains(text(),'Did the Service Provider')]/../../../..//mat-select[@role=\"combobox\"]")WebElement SrcProParticipate;
	@FindBy (xpath ="//span[text()=' Yes ']")WebElement clcOnYes;
	@FindBy (xpath ="//mat-label[contains(text(),'Expense Type')]/../../..//mat-select[@role='combobox']")WebElement slcExpenseType;
	@FindBy (xpath ="//input[contains(@placeholder,'Expense Type')]")WebElement sendType;
	@FindBy (xpath ="//span[contains(text(),'Insurance')]")WebElement slcInsurance;
	@FindBy (xpath ="//span[contains(text(),'Product')]")WebElement clcOnProduct;
	@FindBy (xpath ="//input[@placeholder=\"Product\"]")WebElement sendInPlaceholder;
	@FindBy (xpath ="(//span[contains(text(),' Actonel')])[1]")WebElement clcActonel;
	@FindBy (xpath ="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")WebElement clcOnPage;
    @FindBy (xpath ="//mat-label[contains(text(),'Payment')]/../../..//input[@readonly=\"true\"]")WebElement slcPaymentdate;
	@FindBy (xpath ="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today')]")WebElement SelectDate;
    @FindBy (xpath ="//mat-label[contains(text(),'Payment Amount')]/../../..//input[@type='text']")WebElement sendAmount;
	@FindBy (xpath ="//mat-label[contains(text(),'Teva Payment Entity')]/../../..//input[@type='text']")WebElement tevaPaymentEntity;
	@FindBy (xpath ="//mat-label[contains(text(),'Order Number')]/../../..//input[@type='text']")WebElement paymentOrderNumber;
	@FindBy (xpath ="//mat-label[contains(text(),'Order Date')]/../../..//input[@readonly=\"true\"]")WebElement purchaseOrderDate;
	@FindBy (xpath ="//span[text()='Save']")WebElement clcSave;
	
	public CloseOut(){
		PageFactory.initElements(driver, this);
	}
	
	public void clcPencil(){
		slcPencil.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	}
	public void clcOnCloseOut() throws InterruptedException {
		Thread.sleep(7000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		closeOut.click();
	}
	public void needCloseOutDetails() {
		needCloseDetail.click();
		detailYes.click();
	}
	public void longestPaymentTerm() {
		PaymentTerm.click();
		sendPayment.sendKeys("30");
		clc30.click();
	}
	public void sendComments() {
		comments.sendKeys("ABC");
	}
	public void ClickOnNominatedServiceProvider() {
		clcNomSrcProvider.click();
	}
	public void clickOnEditServiceProvider() {
		editNomSrcProvider.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}
	public void DidSrcProParticipate() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",SrcProParticipate );
		Thread.sleep(3000);
		SrcProParticipate.click();
		clcOnYes.click();
	}
	 
	public void selectExpenseType() throws InterruptedException {
		Thread.sleep(2000);
		slcExpenseType.click();
		sendType.sendKeys("Insurance");
		slcInsurance.click();
	}
	public void selectProductType() {
		clcOnProduct.click();
		sendInPlaceholder.sendKeys("Actonel");
		clcActonel.click();
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE).build().perform();
	}
	public void selectPaymentdate() {
		slcPaymentdate.click();
		SelectDate.click();
	}
	public void selectPaymentAmount() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",sendAmount );
	Thread.sleep(1000);
	sendAmount.sendKeys("100");
	}
	public void tevaPaymentEntity() {
		tevaPaymentEntity.sendKeys("ABC");
	}
	public void sendPaymentOrderNumber() {
		paymentOrderNumber.sendKeys("A12");
	}
	public void purchaseOrderDate() {
		purchaseOrderDate.click();
		SelectDate.click();
	}
	public void saveNominatesServiceProvider() {
		clcSave.click();
	}
	
}
