package com.JFM.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.JFM.qa.BasePage.BasePage;
import com.aventstack.extentreports.ExtentTest;

public class LaunchingPage extends BasePage {

	
	public LaunchingPage()
	{
		
	}
	
		
	public LaunchingPage(WebDriver driver,ExtentTest test)
	{
		super(driver,test);
	}
	
	
   public LoginPage validatelogin() {
	
	   LoginPage launchpagelogin=new LoginPage(driver,test);
		PageFactory.initElements(driver, launchpagelogin);
		return launchpagelogin;   
   }
	
   
   
   
	
}
