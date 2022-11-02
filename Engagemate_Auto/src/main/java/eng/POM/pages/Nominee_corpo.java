package eng.POM.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eng.base.BaseClass;

public class Nominee_corpo extends BaseClass {

	String b;
	WebDriverWait wait;
	Actions actt;
	
	
	@FindBy (xpath ="//span[contains(text(),'Nominees')]")WebElement nominee;
	@FindBy (xpath ="//span[contains(text(),'Search for Service Provider')]")WebElement searchProvider;
	@FindBy (xpath ="//mat-label[contains(text(),'Service Provider Type')]"
			+ "/../..//..//mat-select[@role='combobox']")WebElement searchProType;
	@FindBy (xpath ="//input[contains(@placeholder,'Service Provider Type')]")WebElement sendOpt;
	@FindBy (xpath ="//span[contains(text(),'Patient Organization')]")WebElement optSelected;
	
    @FindBy (xpath ="(//span[text()='Country'])[2]/../../../..//mat-select[@role=\"combobox\"]")WebElement slcCountry;
    @FindBy (xpath ="//input[@placeholder=\"Country\"]")WebElement USCountry;
    @FindBy (xpath ="//span[contains(text(),' United States')]")WebElement USClick;
    
	@FindBy (xpath ="//button[contains(@type,'submit')]")WebElement searchSrcPro;
	@FindBy (xpath ="/html[1]/body[1]/div[1]/div[4]/div[1]/mat-dialog-container[1]/app-nominee-search[1]/mat-dialog-content[1]/div[3]/div[1]/ag-grid-angular[1]/div[1]/div[2]/div[2]"
			+ "/div[1]/div[1]/div[1]/div[3]/div[3]/span[1]")WebElement clcCuststatus;
	@FindBy (xpath ="//span[@aria-label='filter']")WebElement clcOnFilterCusStatus;
	@FindBy (xpath="//input[contains(@placeholder,'Search...')]")WebElement srcInCustStatus;
	
	@FindBy (xpath ="//*[@id=\"mat-dialog-4\"]/app-nominee-search/mat-dialog-content/div[3]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div/div[3]")WebElement custStatus;
	
	
	@FindBy (xpath ="(//button[text()='Select'])[1]")WebElement slcStatus;
	@FindBy (xpath ="//*[@id=\"mat-dialog-4\"]/app-nominee-search/mat-dialog-content/div[1]/div[1]/div/div/div/button[4]")WebElement closePro;
	@FindBy (xpath ="//span[text()='Submit Activity']")WebElement subActivity;
	
	//audit trial
	
	@FindBy (xpath ="//input[@aria-label='Search filter values']")WebElement searchFilter;
	@FindBy (xpath ="//span[text()='Audit Trail']")WebElement clcAuditTrail;
	@FindBy (xpath ="(//em[@class='fa fa-plus-circle'])[4]")WebElement expReviewer;
	@FindBy (xpath ="(//span[text()='Reviewers'])[1]")WebElement clcOnReviewer;
	
	@FindBy (xpath ="//input[@id='userId']") WebElement username1;
	@FindBy (id = "userPwd") WebElement password1;
	@FindBy (id = "loginBtn") WebElement loginBtn;

    @FindBy (xpath ="//span[text()='X']")WebElement closeACT;
	
	@FindBy (xpath ="(//div[@class='card1-block p-3'])[2]")WebElement clcOnProgressActivity;
	@FindBy (xpath ="/html/body/app-dashboard/div/main/div/ng-component/div/div[3]/div[1]/div/div")WebElement clcOnProgressActivity1;
	@FindBy (xpath="(//div[@class='ag-wrapper ag-input-wrapper ag-checkbox-input-wrapper ag-checked'])[1]")WebElement deSelectAll;
	
	
	
	
	
	@FindBy (xpath ="//button[text()='Save Preferences']")WebElement savePref;
	@FindBy (xpath ="//span[@class='font-weight-bold ng-star-inserted']")WebElement getActID;
	@FindBy (xpath ="//div[@class='card1-block p-3']") WebElement clcOnActActions;
    @FindBy (xpath ="/html/body/app-dashboard/div/main/div/app-activity/div/div[2]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/a")WebElement clcOnEditPencil;
	//@FindBy (xpath ="//span[contains(text(),'Nominees')]")WebElement clOnNominee;
    @FindBy (xpath ="//span[text()='Approve']")WebElement approve1;
	@FindBy (xpath ="//mat-label[text()='Leave a comment']/../../..//textarea[@rows='1']")WebElement leaveComm;
	@FindBy (xpath ="(//span[text()='Approve'])[2]")WebElement appcomm;
	
	
	@FindBy (xpath ="(//button[@type='button'])[3]")WebElement navbarLogOut;
	@FindBy (xpath ="//b[text()=' LOG OUT ']")WebElement logout;
	@FindBy (xpath ="(//span[@class='ag-header-icon ag-header-cell-menu-button'])[1]")WebElement clcFilter;
	
	@FindBy (xpath ="(//span[@class='ag-icon ag-icon-filter'])[11]")WebElement clickOnFilterOpt;
	@FindBy (xpath ="(//input[contains(@placeholder,'Filter')])[1]")WebElement srcOption;
    @FindBy (xpath ="(//input[contains(@placeholder,'Filter')])[2]")WebElement filter2;
    @FindBy (xpath ="//button[@ref='applyFilterButton']")WebElement clcOnApplyButton;
	
    @FindBy (xpath ="(//span[@class='ag-icon ag-icon-filter'])[11]")WebElement clickOnFilterOpt1;
	
	public Nominee_corpo(){
		PageFactory.initElements(driver, this);
	}

	public void clickOnNominee() {
		nominee.click();
	}
	public void serchServiceProvider() throws InterruptedException {
		Thread.sleep(1000);
		searchProvider.click();
		Thread.sleep(3000);
	}
	public void searchProviderType() {
		searchProType.click();
		sendOpt.sendKeys("Patient Organization");
		optSelected.click();
		
	}
	
	
	public void selectCountry() {
		slcCountry.click();
		USCountry.sendKeys("United States");
		USClick.click();
	}
	public void searchSelectedProvider() throws InterruptedException {
		searchSrcPro.click();
		Thread.sleep(3000);
	}
	public void selectCustomerStatus() throws InterruptedException {
		Actions actt = new Actions(driver);
		Thread.sleep(1000);
		clcCuststatus.click();
		clcOnFilterCusStatus.click();
		srcInCustStatus.sendKeys("Nominated");
		
		 actt.sendKeys(Keys.ENTER).perform();
		
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
	
	public void clickOnSubmitActivity() {
		subActivity.click();
		
	}
	public void clickOnSavePreferences() throws InterruptedException {
		Thread.sleep(5000);
		//savePref.click();
		driver.navigate().refresh();
	}
	
	public void clickActActions() throws InterruptedException {
		Thread.sleep(1000);
		clcOnActActions.click();
		 Thread.sleep(2000);
	}
	public void ClcOnEditPencil() {
		clcOnEditPencil.click();
	}
	
	public void clickOnNomineeOpt() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);

		
		WebElement clOnNominee = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//span[contains(text(),'Step 2 - Nominees')]")));
		Thread.sleep(4000);
		clOnNominee.click();
		
	}
	
	public void approveNominee() throws InterruptedException {
		Thread.sleep(1000);
		approve1.click();
		Thread.sleep(2000);

	}
	public void LeaveComment() throws InterruptedException {
		leaveComm.sendKeys("approved");
		appcomm.click();
		Thread.sleep(3000);
		//driver.close();
	}
	
	public void loggingOut() throws InterruptedException {
		Thread.sleep(2000);
		navbarLogOut.click();
		logout.click();
		Thread.sleep(2000);
	}
	
	 public void getActvityID() {
			String a=getActID.getText();
			System.out.println(a);
			
			b=a.substring(13);
			
			System.out.println(b);
		 }
		 
	public void clickOnFilter() throws InterruptedException {
		Thread.sleep(2000);
		clcFilter.click();
		Thread.sleep(1000);
		clickOnFilterOpt.click();
		srcOption.sendKeys(b);
		filter2.sendKeys(b);
		clcOnApplyButton.click();
		Thread.sleep(4000);
	}
	public void clickOnProgressActivities() throws InterruptedException {
		Thread.sleep(1000);
		clcOnProgressActivity.click();
	}
	public void clickOnProgressActivities1() throws InterruptedException {
		
		clcOnProgressActivity1.click();
	}
	
	public void clickOnFilter1() throws InterruptedException {
		Thread.sleep(2000);
		clcFilter.click();
		Thread.sleep(2000);
		clickOnFilterOpt1.click();
		srcOption.sendKeys(b);
		filter2.sendKeys(b);
		clcOnApplyButton.click();
		Thread.sleep(4000);
	}

	public void AuditTrial() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/div/app-activity/div/div[2]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a")).click();

		Thread.sleep(10000);		
		clcAuditTrail.click();
		expReviewer.click();
		
		List<WebElement> listOfRev = driver.findElements(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='name'])"));
		//ArrayList al = new ArrayList();
		
//		List<WebElement> allReviwer = driver.findElements(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='name'])"));
//
//		Iterator<WebElement> itr = allReviwer.iterator();
//		
//		while(itr.hasNext()) 
//		{
//		   itr.next();
//		}
		
		int NumOfReviwer = listOfRev.size()-1;
		
		for(int i=1;i<=NumOfReviwer;i++) 
		{
		String reviwer = listOfRev .get(i).getText();
		
         clcOnReviewer.click();
		
		driver.findElement(By.xpath("//*[@id=\"hcpGridAPGRD\"]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/span")).click();
		driver.findElement(By.xpath("//span[@aria-label='filter']")).click();
		WebElement searchFilter = driver.findElement(By.xpath("//input[@aria-label='Search filter values']"));
		 Actions actt = new Actions(driver);
		 Thread.sleep(2000);
		 deSelectAll.click();
	     searchFilter.sendKeys(reviwer);
		 actt.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(1000);
		 String FirstReviwer = driver.findElement(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='userName'])[2]")).getText();
         System.out.println(FirstReviwer);
         closeACT.click();
         Thread.sleep(5000);
 		navbarLogOut.click();
 		logout.click();
 		Thread.sleep(2000);
 	
     	 username1.sendKeys(FirstReviwer);
     	password1.sendKeys("Cresen123!");
     	loginBtn.click();
     	if(FirstReviwer.contains("harshini.reviewer"))
    	{
    		List<WebElement> listOfLogIn = driver.findElements(By.xpath("//div[@class='mat-list-item-content']"));
    	
    	     for(WebElement List:listOfLogIn)
    	     {
    	    	 System.out.println(List.getText());
    	    	 if(List.getText().contains("General Reviewer - Commercial / Local Medical"))
    	    		 {
    	    		 List.click();
    	    		 }
    	     }
    	}
    
		}
		
		
		
		
		
	}
//	List<String>Listt = new ArrayList<String>();
//	
//	Iterator it=Listt.iterator();
	
	
	
	
	
	
	
	
	
	public void AuditTrial1() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/div/app-activity/div/div[2]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a")).click();

		Thread.sleep(10000);		
		clcAuditTrail.click();
		expReviewer.click();
		WebElement srcReviewr = driver.findElement(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='name'])[2]"));
		
		String srcReviewr1 = srcReviewr.getText();
		 System.out.println(srcReviewr1);
		clcOnReviewer.click();
		
		driver.findElement(By.xpath("//*[@id=\"hcpGridAPGRD\"]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/span")).click();
		driver.findElement(By.xpath("//span[@aria-label='filter']")).click();
		WebElement searchFilter = driver.findElement(By.xpath("//input[@aria-label='Search filter values']"));
		 Actions actt = new Actions(driver);
		 Thread.sleep(2000);
		 deSelectAll.click();
	     searchFilter.sendKeys(srcReviewr1);
		 actt.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(1000);
		 String FirstReviwer = driver.findElement(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='userName'])[2]")).getText();
         System.out.println(FirstReviwer);
         closeACT.click();
         Thread.sleep(5000);
 		navbarLogOut.click();
 		logout.click();
 		Thread.sleep(2000);
 	
     	 username1.sendKeys(FirstReviwer);
     	password1.sendKeys("Cresen123!");
     	loginBtn.click();
     	if(FirstReviwer.contains("harshini.reviewer"))
    	{
    		List<WebElement> listOfLogIn = driver.findElements(By.xpath("//div[@class='mat-list-item-content']"));
    	
    	     for(WebElement List:listOfLogIn)
    	     {
    	    	 System.out.println(List.getText());
    	    	 if(List.getText().contains("General Reviewer - Commercial / Local Medical"))
    	    		 {
    	    		 List.click();
    	    		 }
    	     }
    	}
    	else if(FirstReviwer.contains("aparna.popuri1"))
     	{
     		List<WebElement> listOfLogIn1 = driver.findElements(By.xpath("//div[@class='mat-list-item-content']"));
        	
   	     for(WebElement List1:listOfLogIn1)
   	     {
   	    	 System.out.println(List1.getText());
   	    	 if(List1.getText().contains("General Reviewer - TGO"))
   	    		 {
   	    		 List1.click();
   	    		 }
   	     }
     	}

     	}
    	
     	public void AuditTrial2() throws InterruptedException
    	{
    		driver.findElement(By.xpath("/html/body/app-dashboard/div/main/div/app-activity/div/div[2]/div/ag-grid-angular/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/a")).click();

    		Thread.sleep(10000);		
    		clcAuditTrail.click();
    		expReviewer.click();
    		WebElement srcReviewr = driver.findElement(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='name'])[3]"));
    		
    		String srcReviewr1 = srcReviewr.getText();
    		 System.out.println(srcReviewr1);
    		clcOnReviewer.click();
    		
    		driver.findElement(By.xpath("//*[@id=\"hcpGridAPGRD\"]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/span")).click();
    		driver.findElement(By.xpath("//span[@aria-label='filter']")).click();
    		WebElement searchFilter = driver.findElement(By.xpath("//input[@aria-label='Search filter values']"));
    		 Actions actt = new Actions(driver);
    		 deSelectAll.click();

    	     searchFilter.sendKeys(srcReviewr1);
    		 actt.sendKeys(Keys.ENTER).perform();
    		 Thread.sleep(1000);
    		 String SecondReviwer = driver.findElement(By.xpath("(//div[@tabindex='-1' and @aria-colindex='1' and @col-id='userName'])[2]")).getText();
             System.out.println(SecondReviwer);
             closeACT.click();
             Thread.sleep(5000);
     		navbarLogOut.click();
     		logout.click();
     		Thread.sleep(2000);
     	
         	 username1.sendKeys(SecondReviwer);
         	password1.sendKeys("Cresen123!");
         	loginBtn.click();
         	
         	if(SecondReviwer.contains("harshini.reviewer"))
        	{
        		List<WebElement> listOfLogIn = driver.findElements(By.xpath("//div[@class='mat-list-item-content']"));
        	
        	     for(WebElement List:listOfLogIn)
        	     {
        	    	 System.out.println(List.getText());
        	    	 if(List.getText().contains("General Reviewer - Commercial / Local Medical"))
        	    		 {
        	    		 List.click();
        	    		 }
        	     }
        	}
        	else if(SecondReviwer.contains("aparna.popuri1"))
         	{
         		List<WebElement> listOfLogIn1 = driver.findElements(By.xpath("//div[@class='mat-list-item-content']"));
            	
       	     for(WebElement List1:listOfLogIn1)
       	     {
       	    	 System.out.println(List1.getText());
       	    	 if(List1.getText().contains("General Reviewer - TGO"))
       	    		 {
       	    		 List1.click();
       	    		 }
       	     }
         	}


	
	}	
	
}
