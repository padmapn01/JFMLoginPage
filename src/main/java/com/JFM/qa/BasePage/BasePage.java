package com.JFM.qa.BasePage;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

import com.JFM.qa.ExtentReport.ExtentManager;
import com.JFM.qa.Pages.LoginPage;
import com.JFM.qa.Pages.TopMenu;
import com.JFM.qa.Util.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.beust.jcommander.Parameter;

public class BasePage {
		
		public static WebDriver driver;
		public ExtentTest test;
		public ExtentReports reports = ExtentManager.getReports();
		public LoginPage login;
		public TopMenu menu;
		
		public BasePage()
		{
			
		}
		
		public BasePage(WebDriver  driver, ExtentTest test){
			this.driver=driver;
			this.test=test;
			
			
		}
		
		
		@BeforeMethod
		public void initialization(ITestResult result) throws InterruptedException
		{
			String browserName = "Chrome";
			if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Workscape\\JanesCom\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver",Constants.Firefox_Browser);
			driver = new FirefoxDriver();
			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//driver.get("http://172.20.21.221/JFM");
			driver.get("https://stage-jfm.janes.info/JFM/home");
			//driver.get("https://jfm.janes.info/JFM/login");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			
		}

		              
		

		public void takeScreenShot() {
			Date d=new Date();
			
			//String reportFolderPath = System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":", "-");
			String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
			String reportFolderPath = System.getProperty("user.dir")+"//reports//"+d.toString().replaceAll(":", "-");
			String filePath=System.getProperty("user.dir")+reportFolderPath;
			// store screenshot in that file
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				FileUtils.copyFile(scrFile, new File(filePath));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		}
	
	
	@AfterMethod
	    public void Teardown(ITestResult result){

		reports.flush();
		driver.quit();
		
	}
		
		 

		
}		
		
