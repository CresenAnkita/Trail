package eng.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import eng.POM.pages.ActDetails_CorpMembership;
import eng.POM.pages.ActOverviewCorporate;
import eng.POM.pages.Approval;
import eng.POM.pages.Attendee_CloseOut;
import eng.POM.pages.CloseOut;
import eng.POM.pages.HomePage;
import eng.POM.pages.LogInPage;
import eng.POM.pages.Nominee_corpo;
import eng.base.BaseClass;

public class CorporateTest extends BaseClass {
	
	LogInPage login ;
	HomePage home;
	ActOverviewCorporate ActOv;
	CorporateTest cs;
	ActDetails_CorpMembership ActCor;
	Nominee_corpo nom;
	Approval ap;
	CloseOut co;
	Attendee_CloseOut at;
	
	
	
	public CorporateTest() 
	{
		super();
	}
	
	@Test(priority = 1)

	public void LaunchBrowser() throws InterruptedException {
		initialization();
		login = new LogInPage();
		home=login.login(prop.getProperty("username"), prop.getProperty("password"));
		home = new HomePage();
		ActOv = new ActOverviewCorporate();
		cs = new CorporateTest();
		ActCor = new ActDetails_CorpMembership();
		nom = new Nominee_corpo();
		ap = new Approval();
		co =new CloseOut();
		at = new Attendee_CloseOut();
		
		
		home.clickOnActivityActions();
		home.clickOnCreateActivity();
		home.clickonActivityType();
		home.selectActivityTYPE();
		home.clickOptionFromList();
		

	}

	@Test(priority = 2)
	public void CreateActivity() throws IOException, InterruptedException
	{
		ActOv.sendActivityTitle();
		ActOv.selectStartDate();
		ActOv.selectEndDate();
		ActOv.SelectProjectOrginator();
		ActOv.selectDesignatedReviewer();
		ActOv.selectCountryResponsible();
		ActOv.selectTherapeuticArea();
		ActOv.selectOtherActivity();
		ActOv.editActivityDeatails();
		ActOv.saveActivityID();
		ActOv.purposeObjective();
		ActOv.saveActivityOverview();
	}
	
	
	@Test(priority = 3)
	public void fillActivityDetails() throws IOException, InterruptedException
	{   ActCor.clickOnActvityDetails();
		ActCor.estimatedBudget();
		ActCor.selectSpendtype();
		ActCor.sendOtherSpendType();
		ActCor.sendAmount();
		ActCor.frequencyPayment();
	
	}
	@Test(priority = 4)
	public void fillCorporateSponsorship() throws InterruptedException, AWTException
	{ ActCor.clickOnCorporateSponsorship();
	  ActCor.sendPurposeOfOrganization();
	  ActCor.sendOrgSelected();
	  ActCor.sendTheRequest();
	  ActCor.hasTeva();
	  ActCor.ListtheTeva();
	  ActCor.UploadDocuments();
	  nom.getActvityID();
	  ActCor.clickSaveActivity();
	  
	}
	@Test(priority = 5)
	public void selectNominees() throws InterruptedException
	{nom.clickOnNominee();
	nom.serchServiceProvider();
	nom.searchProviderType();
	nom.selectCountry();
	nom.searchSelectedProvider();	
	}
	
	@Test(priority = 6)
	public void validateNominee() throws InterruptedException {
		nom.selectCustomerStatus();
		String actual=nom.selCustStatus();
		String expected ="Nominated";
		
		if(actual.equalsIgnoreCase(expected)) {
			nom.clickOnCustStatus();
			nom.closeServiceProvider();
			nom.clickOnSubmitActivity();
			nom.clickOnSavePreferences();
			Thread.sleep(2000);
			//nom.loggingOut();
			
			
			nom.clickOnFilter1();
			
		}
      }
	@Test(priority = 7)
	public void ApprovalProcess1() throws InterruptedException {
		nom.AuditTrial1();
		//home=login.login(prop.getProperty("password"), null);
	
		Thread.sleep(2000);
        nom.clickActActions();
        Thread.sleep(2000);
		nom.clickOnFilter();
		Thread.sleep(2000);
		nom.ClcOnEditPencil();
		nom.clickOnNomineeOpt();
		nom.approveNominee();
		nom.LeaveComment();
		Thread.sleep(2000);
		nom.loggingOut();
		Thread.sleep(2000);
	

	}
	@Test(priority = 8)
	public void ApprovalProcess2() throws InterruptedException {
		//initialization();
		login = new LogInPage();
		home=login.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		nom.clickOnProgressActivities();
		nom.clickOnFilter1();		
		nom.AuditTrial2();
	
		
		//home=login.login(prop.getProperty("password"), null);
		Thread.sleep(2000);
        nom.clickActActions();
        Thread.sleep(2000);
		nom.clickOnFilter();
		Thread.sleep(2000);
		nom.ClcOnEditPencil();
		nom.clickOnNomineeOpt();
		nom.approveNominee();
		nom.LeaveComment();
		Thread.sleep(2000);
		nom.loggingOut();
		Thread.sleep(2000);
	

	}
	
	@Test(priority = 9)
	public void closeOut() throws InterruptedException, AWTException {
		//initialization();
		login = new LogInPage();
		home=login.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		nom.clickOnProgressActivities();
		nom.clickOnFilter1();
		
		
		Thread.sleep(2000);
		nom.ClcOnEditPencil();
		co.clcOnCloseOut();
		co.needCloseOutDetails();
		co.longestPaymentTerm();
		co.sendComments();
		ActCor.UploadDocuments();
		co.ClickOnNominatedServiceProvider();
		co.clickOnEditServiceProvider();
		co.DidSrcProParticipate();
		at.sendPaidEntity();
		co.selectExpenseType();
		co.selectProductType();
        co.selectPaymentdate();
        co.selectPaymentAmount();
        co.tevaPaymentEntity();
        co.sendPaymentOrderNumber();
        co.purchaseOrderDate();
        co.saveNominatesServiceProvider();
        at.clickOnAttendees();
        at.editAttendees();
        at.sendFirstName();
        at.sendLastName();
        at.sendAddress();
        at.selectAttendeeCountry();
        at.sendPostalCode();
        at.SelectCoutryIdtifierType();
        at.sendCoutryIdtifier();
        at.sendSpeciality();
        at.sendPaidEntity();
        co.selectExpenseType();
		co.selectProductType();
		Thread.sleep(2000);
        co.selectPaymentdate();
        co.selectPaymentAmount();
        co.tevaPaymentEntity();
        co.sendPaymentOrderNumber();
        co.purchaseOrderDate();
        co.saveNominatesServiceProvider();
            
        
	}
	

	
	
	
	
}
