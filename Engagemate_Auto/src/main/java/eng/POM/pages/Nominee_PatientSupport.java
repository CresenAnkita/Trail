package eng.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class Nominee_PatientSupport extends BaseClass{
	@FindBy (xpath ="//mat-label[contains(text(),'Service Provider Type')]"
			+ "/../..//..//mat-select[@role='combobox']")WebElement searchProType;
	@FindBy (xpath ="//input[contains(@placeholder,'Service Provider Type')]")WebElement sendOpt;
	@FindBy (xpath ="//span[contains(text(),'Healthcare Organization')]")WebElement optSelected;
	@FindBy (xpath ="(//div[@tabindex='-1' and @col-id='customerStatusUniqueName'])[2]")WebElement custStatus;
	@FindBy (xpath ="(//button[text()='Select'])[1]")WebElement slcStatus;
	@FindBy (xpath ="//button[contains(text(),'Close')]")WebElement closePro;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Nominee_PatientSupport(){
		PageFactory.initElements(driver, this);
	}
	public void searchProviderType() {
		searchProType.click();
		sendOpt.sendKeys("Healthcare Organization");
		optSelected.click();
		
	}
	public String selCustStatus() {
		return custStatus.getText();
	}
	public void clickOnCustStatus() throws InterruptedException {
		Thread.sleep(1000);
		slcStatus.click();
		Thread.sleep(6000);
		
	}
	public void closeServiceProvider() throws InterruptedException {
		  closePro.click();
		  Thread.sleep(5000);
	  }
	
}
