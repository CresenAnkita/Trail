package eng.testcases;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import eng.POM.pages.Approval;
import eng.POM.pages.HomePage;
import eng.POM.pages.LogInPage;
import eng.base.BaseClass;

public class ApprovalTest extends BaseClass {

	@FindBy 
	LogInPage login ;
	HomePage home;
	Approval ap;
	ApprovalTest AP;
	
	public ApprovalTest() {
		super();
	}
	
	
	@Test (priority =1)
	public void setUp() {
		initialization();
		login = new LogInPage();
		ap = new Approval();

		AP=new ApprovalTest();
		
	}
	
	@Test (priority=2)
	public void logInTest1() throws InterruptedException {
		home=login.login(prop.getProperty("genOwner"), prop.getProperty("password"));
		Thread.sleep(2000);
		ap.clickApprov1();
		ap.clickOnEdit();
		ap.approveNominee();
		ap.LeaveComment();	
		ap.loggingOut();
	
	}
		
		
		
		@Test (priority=3)
		public void logInTest2() throws InterruptedException {
			//initialization();
			login = new LogInPage();
			ap = new Approval();

			AP=new ApprovalTest();

			home=login.login(prop.getProperty("har"), prop.getProperty("password"));
			Thread.sleep(2000);
			ap.logAsSecondReviewr();
			ap.clickApprov1();
			ap.clickOnEdit();
			ap.approveNominee();
			ap.LeaveComment();
			ap.loggingOut();
			Thread.sleep(3000);
		}
		
		@Test (priority=4)
		public void logInTest3() throws InterruptedException {
			//initialization();
			login = new LogInPage();
			ap = new Approval();

			AP=new ApprovalTest();

			home=login.login(prop.getProperty("comUs"), prop.getProperty("password"));
			Thread.sleep(2000);
			ap.clickApprov1();
			ap.clickOnEdit();
			ap.approveNominee();
			ap.LeaveComment();
			ap.loggingOut();
			Thread.sleep(3000);
		}

		
		
		@Test (priority=5)
		public void logInTest4() throws InterruptedException {
			
			login = new LogInPage();
			ap = new Approval();

			AP=new ApprovalTest();

			home=login.login(prop.getProperty("med"), prop.getProperty("password"));
			Thread.sleep(2000);
			ap.clickApprov1();
			ap.clickOnEdit();
			ap.approveNominee();
			ap.LeaveComment();
			ap.loggingOut();
			Thread.sleep(3000);
		}


		
		
		
		
	
	
}
