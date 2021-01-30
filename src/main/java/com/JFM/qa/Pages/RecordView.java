package com.JFM.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JFM.qa.BasePage.BasePage;
import com.aventstack.extentreports.ExtentTest;


public class RecordView extends BasePage{
	
	@FindBy(linkText="VIEWS")
	private WebElement views;
	
	@FindBy(id="btnMFRecordView")
	private WebElement Recordview;
	
	@FindBy(xpath="//*[@id='searchBox']")
	private WebElement searchrecord;
	
	@FindBy(xpath="//*[@id='searchbtn']/i")
	private WebElement searchbtnrecordview;
	
	public RecordView(WebDriver driver, ExtentTest test) {
		super(driver,test);
	}

	public JFMHome searcharecordinrecordview() throws InterruptedException {
	
		views.click();
		Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='btnMFAnalystView']"))).perform();
        Recordview.click();
        searchrecord.sendKeys("1234");
	    Thread.sleep(3000);
	    searchbtnrecordview.click();
	    Thread.sleep(3000);
		
	    
	    JFMHome recordviews = new JFMHome(driver,test);
		PageFactory.initElements(driver, recordviews);
		return recordviews;
	    
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
