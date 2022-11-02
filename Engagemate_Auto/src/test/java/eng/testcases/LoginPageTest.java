package eng.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import eng.POM.pages.HomePage;
import eng.POM.pages.LogInPage;
import eng.base.BaseClass;
public class LoginPageTest extends BaseClass {
	
	LogInPage login ;
	HomePage home;
	
	
	public LoginPageTest() {
		super();
	}
	
	@Test (priority =0)
	public void setUp() {
		initialization();
		login = new LogInPage();
	}
	@Test (priority=1)
	public void logInTest() {
		home=login.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test (priority=2)
	public void loginPageTitleTest() throws InterruptedException {
		String title=login.validateLoginPageTitle();
		Assert.assertEquals(title, "EngageMate - HCP Contracting");
		Thread.sleep(2000);
	}
	
	@Test (priority=3)
	public void ENGLogoImageTest() {
		boolean Image = login.validateENGImage();
		Assert.assertTrue(Image);
	}
	
	
	
	@Test (enabled =false)
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
