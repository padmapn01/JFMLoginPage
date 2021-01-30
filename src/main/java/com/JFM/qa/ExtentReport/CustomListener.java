package com.JFM.qa.ExtentReport;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.JFM.qa.BasePage.BasePage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CustomListener extends BasePage implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase pass");
		System.out.println(" test case Pass"+result.getName());
		System.out.println(result.getStatus());
		ExtentTest test=(ExtentTest) result.getAttribute("reporter");
		test.log(Status.PASS, "Test passed" + result.getName());
	
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test name"+result.getName());
		System.out.println(result.getStatus());
		
		ExtentTest test=(ExtentTest) result.getAttribute("reporter");
		//test.log(Status.FAIL,result.getThrowable().getMessage());

	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase Skipped");
		System.out.println("Skipped test case"+result.getName());
		//System.out.println(result.getThrowable().getMessage());
		System.out.println(result.getStatus());
	   ExtentTest test = (ExtentTest)result.getAttribute("reporter");
	   test=test.log(Status.SKIP,"Test Skipped"+result.getName());
	}

	
}
