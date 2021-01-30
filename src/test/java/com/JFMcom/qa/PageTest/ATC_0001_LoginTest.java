package com.JFMcom.qa.PageTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.JFM.qa.BasePage.BasePage;


import com.JFM.qa.Pages.LaunchingPage;
import com.JFM.qa.Pages.LoginPage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;




//@Listeners(CustomListener.class)
public class ATC_0001_LoginTest extends BasePage {
	
	
	
	public ATC_0001_LoginTest()
	{
		
	}
	
	public ATC_0001_LoginTest(WebDriver driver,ExtentTest test)
	{
		super(driver,test);
	}
	
	@Test
	public void validateadminloginpage()throws InterruptedException{
		
		 test=reports.createTest("Admin Login");

		//Launching JFM UAT website
		
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);

		//Below step will login
		 LoginPage page=launchpage.validatelogin();
		 page.verifyloginpage("padma", "ihs123");
		
		test.log(Status.PASS, "Admin login pass");
		
	
	}
	
	
	@Test//(enabled=false)
	public void validateanalystloginpage() throws InterruptedException {
		//Launching JFM UAT website
		 test=reports.createTest("Analyst Login");
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);
		
		//Below will login as analyst 
		LoginPage page = launchpage.validatelogin();
		page.verifyloginpage("padma", "ihs123");
		test.log(Status.PASS, "Analyst login pass");
		
	}
	
	@Test(enabled=false)
	public void validateSMEloginpage() throws InterruptedException {
		 test=reports.createTest("SME Login");
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);
		
		//Below will login as analyst 
		LoginPage page = launchpage.validatelogin();
		page.verifyloginpage("padma", "ihs123");
		page.takeScreenShot();
		test.log(Status.PASS, "SME login pass");
		System.out.println("Logd in as SME");
	}
	
	@Test(enabled=false)
	public void validatereviewerloginpage() throws InterruptedException {
		 test=reports.createTest("Reveiwer Login");
		
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);
		
		//Below will login as analyst 
		LoginPage page = launchpage.validatelogin();
		page.verifyloginpage("padma", "ihs123");
		page.takeScreenShot();
		test.log(Status.PASS, "Reviewer login pass");
		System.out.println("Logd in as Reviewer");
		
	}
	
	@Test(enabled=false)
	public void validateSMEandAnalyst() throws InterruptedException {
		 test=reports.createTest("SME & Analyst Login");
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);
		
		//Below will login as analyst 
		LoginPage page = launchpage.validatelogin();
		page.verifyloginpage("padma", "ihs123");
		test.log(Status.PASS, "SME & Analyst login pass");
		System.out.println("Logd in as SMEandAnalyst");
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test//(enabled=false)
	public void validateleadanalyst() throws InterruptedException {
		 test=reports.createTest("Lead analyst Login");
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);
		
		//Below will login as analyst 
		LoginPage page = launchpage.validatelogin();
		page.verifyloginpage("padma", "s123");
		Assert.fail("Invalid password");
		test.log(Status.FAIL, "Lead analyst login failed");
	Assert.fail("error mes");
		
	}
	
	

}
