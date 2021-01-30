package com.JFM.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JFM.qa.BasePage.BasePage;
import com.aventstack.extentreports.ExtentTest;

public class TopMenu extends BasePage{
	WebDriver driver;
	ExtentTest test;
	
	@FindBy(linkText="MF Analyst View")
	private WebElement mfanalystview;
	
	@FindBy(linkText ="MF Search")
	private WebElement mfsearch;
	
	public TopMenu()
	{
		
	}
	

	
	public void Views () {
		
		driver.findElement(By.linkText("VIEWS")).click();
		Actions builder=new Actions(driver);
		Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id='btnMFAnalystView']"))).perform();
	}
	
	public RecordView clickonrecordview() {
		
		driver.findElement(By.id("btnMFRecordView")).click();
		
		
		RecordView recordview = new RecordView(driver,test);
		PageFactory.initElements(driver, recordview);
		return recordview;
	}
	
	
	public ListView clickonlistview() {
		
        driver.findElement(By.id("btnMFListView")).click();
		
        ListView listdview = new ListView();
		PageFactory.initElements(driver, listdview);
		return listdview;
	}
	
	
     public ReviewerView clickonreviewerview() {
		
        driver.findElement(By.id("btnMFReviewerView")).click();
			
        ReviewerView reviewerdview = new ReviewerView();
		PageFactory.initElements(driver, reviewerdview);
		return reviewerdview;
	}
	
	 public LogView clickonlogview() {
		 
		 driver.findElement(By.id("btnMFLogView")).click();
			
		    LogView logview = new LogView();
			PageFactory.initElements(driver, logview);
			return logview;
		 
	 }
	
	 public UpdateReportView clickonupdatereportview() {
		 driver.findElement(By.id("btnMFUpdateReportView"));
		 
		     UpdateReportView updatereportview  = new UpdateReportView();
			 PageFactory.initElements(driver, updatereportview);
			 return updatereportview;
		 
	 }
	
	 public Import clickonimport() {
		 
		 driver.findElement(By.id("btnMFImport"));
		 
		 Import importview = new Import();
		 PageFactory.initElements(driver, importview);
		 return importview;
		 
	 }
	 
	 
	 public LinkedView clickonlinkview() {
		 
		 driver.findElement(By.id("btnMFLinkedView"));
		 
		 LinkedView linkedview = new LinkedView();
		 PageFactory.initElements(driver, linkedview);
		 return linkedview;	 
		 
	 }
	 
	 
	 public void Search() {
		 
		 driver.findElement(By.linkText("SEARCH")).click();
			Actions builder=new Actions(driver);
			Action action1=builder.moveToElement(mfsearch).click().build();
			builder.perform();	
		 
	 }
	 
	 public DynamicSearch clickondynamicsearch() {
		 
         driver.findElement(By.id("btnDynamicSearch"));
		 
		 DynamicSearch dynamicsearch = new DynamicSearch();
		 PageFactory.initElements(driver, dynamicsearch);
		 return dynamicsearch;	 
		 
		 
	 }
	 
     public AdvanceSearch clickonadvancesearch() {
		 
         driver.findElement(By.id("btnAdvanceSearch"));
		 
         AdvanceSearch advancesearch = new AdvanceSearch();
		 PageFactory.initElements(driver, advancesearch);
		 return advancesearch;	 
		 
		 
	 }
	 
	 
	 
	 
}
