package eng.POM.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class PatientSupport_ActCreation extends BaseClass{

	@FindBy (xpath ="//input[@placeholder=\"Activity Type\"]")WebElement sendActType;
    @FindBy (xpath = "//span[contains(text(),'Patient Support')]") WebElement patientSupport;

    @FindBy (xpath = "//span[text()='Activity Details']")WebElement actDetails;
    @FindBy (xpath ="//span[text()='Save']")WebElement save;
    @FindBy (xpath ="//span[contains(text(),'Event')]")WebElement evenType;
    @FindBy (xpath ="//input[@placeholder=\"Event Type\"]")WebElement sendEventType;
    @FindBy (xpath ="//span[contains(text(),'Virtual')]")WebElement selEventType;
    @FindBy (xpath ="//mat-label[text()='Has an approval been obtained from the Third Party Due Diligence Team?']/../../../../../../../../../..")WebElement clickpage;
    @FindBy (xpath ="//span[contains(text(),'Will you')]")WebElement thirdPartyRepresnt;
    @FindBy (xpath ="//span[contains(text(),' Yes')]")WebElement yes;
    @FindBy (xpath ="//mat-label[text()='Enter Third Party Representative Name']/../../..//textarea[@rows='1']")WebElement sendName;
    @FindBy  (xpath ="//span[contains(text(),'approval ')]") WebElement approval;
    @FindBy  (xpath ="//span[contains(text(),' Yes')]") WebElement approvalYes;
    @FindBy (xpath ="//span[contains(text(),'there a Venue')]") WebElement venue;
    @FindBy (xpath ="//ag-grid-angular[@id='hcpGridVGRID']//div//em[@class='fa fa-pencil']") WebElement editVenue;
    @FindBy (xpath ="(//span[text()='Venue Type'])[2]")WebElement venueType;
    @FindBy (xpath ="//input[contains(@placeholder,'Venue Type')]")WebElement selectvenue;
    @FindBy (xpath ="(//span[contains(text(),'Other')])[3]")WebElement venueSelected;
    @FindBy (xpath ="//mat-label[contains(text(),'selected \"Other\" for Venue Type ')]/../../..//textarea[@rows='1']")WebElement otherVenue;
    @FindBy (xpath ="//mat-label[contains(text(),'Venue N')]/../../..//input[@type='text']")WebElement venueName;
    @FindBy (xpath ="//mat-label[contains(text(),'Address')]/../../..//textarea")WebElement venueAddress;
    @FindBy (xpath ="(//span[text()='Venue Country'])[2]")WebElement selectCountry;
    @FindBy (xpath ="//input[contains(@placeholder,'Venue Country')]")WebElement Countryselected;
    @FindBy (xpath ="//span[contains(text(),'India ')]")WebElement selectedIndia;
    @FindBy (xpath ="//mat-label[contains(text(),'Venue City')]/../../..//input[@type='text']")WebElement venueCity;
    @FindBy (xpath ="//mat-label[contains(text(),'location')]/../../..//textarea[@rows='1']")WebElement location;
    @FindBy (xpath ="//*[@id=\"hcpGridEBGRD\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[3]/div/a")WebElement EstimatedBudget;
    @FindBy (xpath ="(//span[text()='Spend Type'])[2]")WebElement spendType;
    @FindBy (xpath ="//input[contains(@placeholder,'Spend Type')]")WebElement selectMeals;
    @FindBy (xpath ="//span[contains(text(),'Meals')]")WebElement selectedMeals;
    @FindBy (xpath ="//mat-label[text()='Amount']/../../..//input[@type='text']")WebElement amount;
    @FindBy (xpath ="//span[contains(text(),'Save')]")WebElement save1;
    @FindBy (xpath ="(//span[contains(text(),'Patient Support')])[2]/../..//a[@role='tab']")WebElement clcPatientSupport;
    @FindBy (xpath ="//mat-label[contains(text(),'Purpose of request')]/../../..//textarea[@rows='1']")WebElement sendPuropseOfRequest;
    
    @FindBy (xpath ="//span[contains(text(),'Teva')]/../../../..//mat-select[@role='combobox']")WebElement hasTeva;
    @FindBy (xpath ="//span[contains(text(),' Yes')]")WebElement SelectedYesTeva;

   
    
    
    
    
    
    public void clickonActivityDeatils() throws InterruptedException{
	 Thread.sleep(2000);
		actDetails.click();
	}
    public void clickonEventType() throws InterruptedException
	{
		evenType.click();
		sendEventType.sendKeys("Virtual");
		selEventType.click();
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	public void thirdPartyRepresentative() throws InterruptedException
	{
		Thread.sleep(1000);
		thirdPartyRepresnt.click();
		yes.click();
		
	}
	public void sendThirdPartyName() throws InterruptedException
	{
		sendName.sendKeys("ABC");
	}
	public void approvalObtained() throws InterruptedException
	{
		approval.click();
		Thread.sleep(1000);
		approvalYes.click();
	}
	
	public void isThereIsVenue() throws InterruptedException
	{
		venue.click();
		Thread.sleep(1000);
		approvalYes.click();
	}
	
	public void editVenueDetails() throws InterruptedException
	{ Thread.sleep(1000);
		editVenue.click();
	}
	public void editVEnue() throws InterruptedException
	{
		Thread.sleep(3000);
		venueType.click();
		selectvenue.sendKeys("Other");
		venueSelected.click();
		Thread.sleep(2000);
	}
	
	public void otherVenue() throws InterruptedException{
	  otherVenue.sendKeys("gbb");	
	}
	
	public void sendVenueName() throws InterruptedException
	{
		venueName.sendKeys("mno");
	}
	public void venueAddress() throws InterruptedException
	{
		venueAddress.sendKeys("jhk");
	}
	public void SelectVenueCountry() throws InterruptedException
	{
		selectCountry.click();
		Countryselected.sendKeys("India");
		selectedIndia.click();
		Thread.sleep(2000);
	}
	public void SelectVenueCity() throws InterruptedException
	{
		 venueCity.sendKeys("jhC");
	}
	public void SendLoaction() throws InterruptedException {
		location.sendKeys("jh");
	}
	public void saveVenueDetails() throws InterruptedException {
		save.click();
		Thread.sleep(4000);
	}
	public void estimatedBudget() throws InterruptedException {
		EstimatedBudget.click();
		Thread.sleep(2000);
	}
    public void selectSpendtype() {
		spendType.click();
		selectMeals.sendKeys("Meals");
		selectedMeals.click();
	}
	public void sendAmount() throws InterruptedException {
		Thread.sleep(2000);
		amount.sendKeys("200");
		save.click();
		Thread.sleep(2000);
	}
	
	 public PatientSupport_ActCreation(){
			PageFactory.initElements(driver, this);
		}
	    
	 public void clickOptionFromList() throws InterruptedException
		{
		    sendActType.sendKeys("Patient");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			patientSupport.click();
		    Thread.sleep(2000);
			
		}
	 public void sendPuropseOfRequest() {
		 save1.click();
		 sendPuropseOfRequest.sendKeys("hh");
	 }
	 public void ClickOnPatientSupport() throws InterruptedException {
		 clcPatientSupport.click();
		 Thread.sleep(1000);
	 }
	 public void hasTeva() {
		 hasTeva.click();
		 SelectedYesTeva.click();
		
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
}
