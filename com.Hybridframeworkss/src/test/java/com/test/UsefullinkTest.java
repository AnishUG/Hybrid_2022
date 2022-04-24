package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.UsefulLinkPage;
import com.report.ReportEx;

public class UsefullinkTest extends BaseClass{
	
	UsefulLinkPage UF = null;
	
	@BeforeSuite
	
	public void setup () throws Exception {
		
		Initilization();
		ReportEx.reportInit();
		
		UF = new UsefulLinkPage(driver);
		
		
	}
	
	@AfterSuite
	
	public void teardown () {
		driver.close();
	}
	
	@Test
	
	public void Usefullinktestcase () {
		
		UF.CheckUsefulink();
		
		driver.navigate().refresh();
		
	}

}
