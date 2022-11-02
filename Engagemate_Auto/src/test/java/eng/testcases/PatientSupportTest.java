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
import eng.POM.pages.Nominee_PatientSupport;
import eng.POM.pages.Nominee_corpo;
import eng.POM.pages.PatientSupport_ActCreation;
import eng.base.BaseClass;

public class PatientSupportTest extends BaseClass {
	LogInPage login ;
	HomePage home;
	ActOverviewCorporate ActOv;
	CorporateTest cs;
	ActDetails_CorpMembership ActCor;
	Nominee_corpo nom;
	Approval ap;
	CloseOut co;
	Attendee_CloseOut at;
	PatientSupport_ActCreation ps;
	Nominee_PatientSupport nps;
	
	public PatientSupportTest() 
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
		ps = new PatientSupport_ActCreation();
		nps=new Nominee_PatientSupport();
		
		
		home.clickOnActivityActions();
		home.clickOnCreateActivity();
		home.clickonActivityType();
		home.selectActivityTYPE();
		ps.clickOptionFromList();
		

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
  public void fillPatientSupprtActDetails() throws InterruptedException, AWTException {
		    ps.clickonActivityDeatils();
	        ps.clickonEventType();
	        ps.thirdPartyRepresentative();
	        ps.sendThirdPartyName();
	        ps.approvalObtained();
	        ps.isThereIsVenue();
	        ps.editVenueDetails();
	        ps.editVEnue();
	        ps.otherVenue();
	        ps.sendVenueName();
	        ps.venueAddress();
	        ps.SelectVenueCountry();
	        ps.SelectVenueCity();
	        ps.SendLoaction();
	        ps.saveVenueDetails();
	        ps.estimatedBudget();
	        ps.selectSpendtype();
	        ps.sendAmount();
	        ps.ClickOnPatientSupport();
	        ps.sendPuropseOfRequest();
	        ActCor.sendTheRequest();
	  	   ActCor.sendOrgSelected();
	  	 Thread.sleep(2000);
	  	  ps.hasTeva();
	  	  ActCor.ListtheTeva();
	  	  ActCor.UploadDocuments();
	  	  nom.getActvityID();
	  	  ActCor.clickSaveActivity();
  }
	
	@Test(priority = 4)
	public void selectNominees() throws InterruptedException
	{nom.clickOnNominee();
	nom.serchServiceProvider();
	nps.searchProviderType();
	nom.selectCountry();
	nom.searchSelectedProvider();	
	}
	
	@Test(priority = 5)
	public void validateNominee() throws InterruptedException {
		nom.selectCustomerStatus();
		String actual=nps.selCustStatus();
		String expected ="Nominated";
		
		if(actual.equalsIgnoreCase(expected)) {
			nps.clickOnCustStatus();
			nps.closeServiceProvider();
//			nom.clickOnSubmitActivity();
//			nom.clickOnSavePreferences();
//			Thread.sleep(2000);
//			//nom.loggingOut();
			
			
		//	nom.clickOnFilter1();
			
		}
      }
	
	
	
	
	

}
