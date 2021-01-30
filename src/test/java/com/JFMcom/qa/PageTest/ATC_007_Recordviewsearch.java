package com.JFMcom.qa.PageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.JFM.qa.BasePage.BasePage;
import com.JFM.qa.Pages.LaunchingPage;
import com.JFM.qa.Pages.LoginPage;
import com.JFM.qa.Pages.RecordView;


public class ATC_007_Recordviewsearch extends BasePage{

	
	
	@Test
	public void verifyrecordview() throws InterruptedException {
	
	//below step launch the browser
	LaunchingPage launchpage=new LaunchingPage(driver,test);
	PageFactory.initElements(driver, launchpage);

	//Below step will login
	 LoginPage page=launchpage.validatelogin();
	 page.verifyloginpage("padma", "ihs123");
	
	 //below step will click on the recordview
    RecordView recview=new RecordView(driver,test);
    
	 
	  driver.findElement(By.linkText("VIEWS")).click();
		Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='btnMFAnalystView']"))).perform();
	    driver.findElement(By.id("btnMFRecordView")).click();
	    driver.findElement(By.xpath("//*[@id='searchBox']")).sendKeys("1234");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='searchbtn']/i")).click();
	    Thread.sleep(3000);
}

}
