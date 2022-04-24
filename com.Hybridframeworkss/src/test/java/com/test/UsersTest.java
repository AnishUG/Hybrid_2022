package com.test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.UsersPage;
import com.report.ReportEx;

public class UsersTest extends BaseClass{
	
	UsersPage UP =null;
	
	@BeforeSuite
	
	public void setup () throws Exception {
		Initilization();
		ReportEx.reportInit();
		
		UP = new UsersPage(driver);
		
	}
	
	@AfterSuite
	
	public void teardown () {
		
		driver.close();
	}
	

	@Test (priority=1)
	public void Users () {
		
		UP.VerifyTitle();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Add User");
		
		
	}
	
	@Test (priority=2)
	
	public void usercreate () throws Exception {
		
		UP.createuser();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.navigate().refresh();
		
	}
}
