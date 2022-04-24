package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.DownloadsPage;
import com.report.ReportEx;

public class DownloadPageTest extends BaseClass {
	
	DownloadsPage DP = null;
	
	@BeforeSuite
	
	public void setup () throws Exception {
		Initilization();
		ReportEx.reportInit();
		DP = new DownloadsPage(driver);
		
		
	}
	
	@AfterSuite
	
	public void teardown () {
		
		driver.close();
	}
	
	@Test
	
	public void DownloadPage () {
		
		DP.CheckDownloadPage();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Downloads");
		
	}

}
