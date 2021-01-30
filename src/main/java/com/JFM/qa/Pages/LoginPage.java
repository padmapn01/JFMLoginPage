package com.JFM.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import com.JFM.qa.BasePage.BasePage;
import com.JFM.qa.ExtentReport.CustomListener;
import com.aventstack.extentreports.ExtentTest;



public class LoginPage extends BasePage{
	@FindBy(xpath="//input [@name='adesuname']")
	private WebElement username;
	
	@FindBy(name="adespwd")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(.,'Log In')]")
	private WebElement Loginbtn;
	
	
	public LoginPage()
	{}	
	
	
	public LoginPage(WebDriver driver, ExtentTest test)
	{
		super(driver,test);
	}
	

	public JFMHome verifyloginpage(String un , String pwd) throws InterruptedException {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();
		
		JFMHome loginlandingpage = new JFMHome(driver, test);
		PageFactory.initElements(driver, loginlandingpage);
		return loginlandingpage;
	}
	
	

	

}
