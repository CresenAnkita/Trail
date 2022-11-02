package eng.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import eng.POM.pages.HomePage;
import eng.POM.pages.LogInPage;
import eng.base.BaseClass;

public class HomePageTest extends BaseClass
{
	LogInPage login ;
	HomePage home;

	public HomePageTest() 
	{
		super();
	}
	@Test(priority =1)
	public void verifyHomePageTitle() throws InterruptedException
	{
		initialization();
		login = new LogInPage();
		home=login.login(prop.getProperty("username"), prop.getProperty("password"));

		home = new HomePage();
		String homePageTitle = home.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "EngageMate - HCP Contracting","Homepage Title is not matching");
	}
	@Test(priority =2)
	public void createActivity() throws InterruptedException {
		home.clickOnActivityActions();
		home.clickOnCreateActivity();
		home.clickonActivityType();
		home.selectActivityTYPE();
		home.clickOptionFromList();
	
	
	}

}
