package com.JFMcom.qa.PageTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.JFM.qa.BasePage.BasePage;
import com.JFM.qa.Pages.LaunchingPage;
import com.JFM.qa.Pages.LoginPage;

public class ATC_008_NonAduitCountrylist extends BasePage {
	
	
	
 @Test
 public void select_aduitcountrydropdown() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("padma.pn@janes.com");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
	    driver.findElement(By.xpath("//*[@id='i0118']")).sendKeys("India!953845");
		driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
        Thread.sleep(3000);
		LaunchingPage launchpage=new LaunchingPage(driver,test);
		PageFactory.initElements(driver, launchpage);

		//Below step will login
		 LoginPage page=launchpage.validatelogin();
		 page.verifyloginpage("padma", "ihs123");
		 
		    driver.findElement(By.linkText("VIEWS")).click();
			Actions action=new Actions(driver);
	        action.moveToElement(driver.findElement(By.xpath("//*[@id='btnMFAnalystView']"))).perform();
		    driver.findElement(By.id("btnMFRecordView")).click();
	 
	WebElement enduser = driver.findElement(By.id("//*[@id='a98744e752d1']"));
	
	Select sel = new Select(enduser);
	 
	 sel.selectByIndex(10);
	 
	}
		
	 public void Select_a_market_type(){	
			List<WebElement> endusercountry =driver.findElements(By.xpath("//div[@id='collapseEndUserDetails']/div/div/table/tbody/tr[2]/td[2]/ng-select/div/div/div[2]"));
			System.out.println(endusercountry.size());
			
			for(int i=0;i<endusercountry.size();i++) {
				System.out.println(endusercountry.get(i).getText());
			if(endusercountry.get(i).getText().equals("India"))
				endusercountry.get(i).click();
			break;
			}
	  
	
	}
}
