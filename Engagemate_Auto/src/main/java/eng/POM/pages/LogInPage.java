package eng.POM.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import eng.base.BaseClass;

public class LogInPage extends BaseClass{
	
	@FindBy (xpath ="//input[@id='userId']") WebElement username;
	@FindBy (id = "userPwd") WebElement password;
	@FindBy (id = "loginBtn") WebElement loginBtn;
	@FindBy (xpath = "//img[@class='navbar-brand-full']")WebElement engLogo;
	
	public LogInPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateENGImage(){
		return engLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	}

}
