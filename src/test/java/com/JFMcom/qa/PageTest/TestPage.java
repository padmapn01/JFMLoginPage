package com.JFMcom.qa.PageTest;


import org.testng.annotations.Test;
import com.JFM.qa.BasePage.BasePage;
import com.JFM.qa.Pages.LoginPage;
import com.JFM.qa.Pages.TopMenu;


public class TestPage extends BasePage{
	TopMenu menu;
	LoginPage logpage;
	ATC_0001_LoginTest testpage;
	
	
	@Test
	public void selectmarket () throws InterruptedException {
		
		testpage.validateadminloginpage();
		menu.Views();
		menu.clickonrecordview();
	}
	
	

}
