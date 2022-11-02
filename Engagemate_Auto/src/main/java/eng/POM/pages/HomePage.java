package eng.POM.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eng.base.BaseClass;

public class HomePage extends BaseClass {
//	@FindBy (xpath ="//span[text()='My Activity Actions']") WebElement ActvityActions;
	@FindBy (xpath ="//button[contains(text(),' Create')]") WebElement CreateActivity;
	@FindBy (xpath = "//span[contains(@class,'mat-select')]")WebElement clickActivityType;
    @FindBy (xpath = "//span[@class='mat-option-text']")List<WebElement> selectActivityType;
    @FindBy (xpath = "//span[contains(text(),'Corporate Membership')]") WebElement corporateMem;
   
	WebDriverWait wait=new WebDriverWait(driver, 20);

    public HomePage(){
		PageFactory.initElements(driver, this);
	}
    
    public String verifyHomePageTitle() {
    	return driver.getTitle();
    }
    public void clickOnActivityActions() throws InterruptedException {
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

    	Thread.sleep(8000);
    	WebElement ActvityActions = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[text()='My Activity Actions']")));
    	ActvityActions.click();
		
    }
    public void clickOnCreateActivity() throws InterruptedException{
    	CreateActivity=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//button[contains(text(),' Create')]")));
    	Thread.sleep(2000);
    	CreateActivity.click();
    }
	public void clickonActivityType() throws InterruptedException
	{Thread.sleep(2000);
		clickActivityType.click();
	}

	public void selectActivityTYPE() throws InterruptedException {
      for(WebElement list:selectActivityType)
		{
			String list1=list.getText();
		    System.out.println(list1);
		    //System.out.println("list is"+list.getSize());
		   
		}
	}
	
	public void clickOptionFromList() throws InterruptedException
	{
//		WebDriverWait wait=new WebDriverWait(driver, 20);
//		WebElement AdvisoryBoard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[text()=' Advisory Board/Expert Meeting ']")));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		corporateMem.click();
		
//		WebElement dest = driver.findElement(By.xpath("//span[text()='Project Originator']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();",dest );
		Thread.sleep(2000);
		
	}
	
    
}
