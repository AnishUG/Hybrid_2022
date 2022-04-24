package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.page.RegistrationPage;
import com.report.ReportEx;

public class RegistrationTest extends BaseClass {

	RegistrationPage RP = null;

	@BeforeSuite

	public void setup() throws Exception {

		Initilization();
		ReportEx.reportInit();
		RP = new RegistrationPage(driver);

	}

	@AfterSuite

	public void teardown() {
		driver.close();
	}

	@Test (priority=2)
	public void Reg() throws Exception {

		RP.usercreated();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);

	}
	
//	@Test (priority=1)
//	
//	public void VerifyNameValidation () {
//		
//		RP.NameValidation();
//		
//		String NameError = driver.findElement(By.id("name_error")).getText();
//		
//		Assert.assertEquals(NameError, "Please enter Name.");
//		
//		driver.navigate().refresh();
//	}

}
