package com.JFMcom.qa.PageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.JFM.qa.BasePage.BasePage;
import com.JFM.qa.Pages.LaunchingPage;
import com.JFM.qa.Pages.LoginPage;
import com.JFM.qa.Pages.TopMenu;
import com.aventstack.extentreports.ExtentTest;



public class ATC_006_CreateRecordType extends BasePage{

	LaunchingPage lp;
	LoginPage logp;
	TopMenu menu;
	public ATC_006_CreateRecordType() {}
	
	
	ATC_006_CreateRecordType(WebDriver driver,ExtentTest test){
		super(driver,test);
		
	}
	
	@Test
	public void Creatrecord() throws InterruptedException {
		
		lp.validatelogin();
		logp.verifyloginpage("padma.pn", "ihs123");
		menu.Views();
		menu.clickonrecordview();
		
	}
	
	
}
