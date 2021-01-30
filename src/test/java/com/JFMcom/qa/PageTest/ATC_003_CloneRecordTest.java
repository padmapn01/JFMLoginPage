package com.JFMcom.qa.PageTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.JFM.qa.BasePage.BasePage;


public class ATC_003_CloneRecordTest extends BasePage{
	
	@Test
	public void clonerecord() {
		
		
		driver.findElement(By.id("searchBox")).sendKeys("8234");
		driver.findElement(By.xpath("//button[@id='searchbtn']/i")).click();
		driver.findElement(By.id("btnClone")).click();
		
	}

}
