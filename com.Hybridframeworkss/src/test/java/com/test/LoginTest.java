package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.LoginPage;
import com.report.ReportEx;


public class LoginTest extends BaseClass {
	
	LoginPage lp = null;
	
	@BeforeSuite
	
	public void setup () throws Exception {
		
		Initilization();
		ReportEx.reportInit();
		
		lp = new LoginPage(driver);
	}
	
	@AfterSuite
	
	public void teardown () {
		
		driver.close();
		ReportEx.report.flush();
	}
	
	@Test
	
	public void failtest () {
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | ABC");
		
		
	}
	
	@Test
	public void Login () {
		
		lp.LoginToApplication();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
		
	}
	
@Test
	
	public void Skip () {
		
	throw new SkipException("skipping test case");
		
		
	}

}
