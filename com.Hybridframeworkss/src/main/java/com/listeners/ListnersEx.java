package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.report.ReportEx;
import com.utility.DriversUtils;

public class ListnersEx implements ITestListener{

	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
	
		ReportEx.test.log(Status.PASS, "TestCase Passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		ReportEx.test.log(Status.FAIL, "Testcase Failed");
		ReportEx.test.addScreenCaptureFromPath(DriversUtils.getScreenshots(result.getName()));
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		ReportEx.test.log(Status.SKIP, "TestCase Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext result) {
		
		ReportEx.test=ReportEx.report.createTest(result.getName());
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}
	
	


}
