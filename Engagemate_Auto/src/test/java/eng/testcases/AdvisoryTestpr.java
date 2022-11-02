package eng.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import eng.POM.pages.HomePage;
import eng.POM.pages.LogInPage;
import eng.util.UtilClass;

public class AdvisoryTestpr {
	
	LogInPage login ;
	HomePage home;
	AdvisoryTestpr ad;
	
	
	public AdvisoryTestpr() {
		super();
	}
	
	
	public void advisoryBoard() {
		login = new LogInPage();
		home = new HomePage();
		ad = new AdvisoryTestpr();
	}
	
String sheetname;
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][]=UtilClass.getTestData(sheetname);
		return data;
	}
	
	@Test (dataProvider="getTestData")
	public void SendAdvisoryBoard(String title,String startdate,String Enddate) 
	{
		//ad.AdvisoryBoard(title, startdate, Enddate);
		
	}
	
	
	
	
	
	
	
	
	

}
