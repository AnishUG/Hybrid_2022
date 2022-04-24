package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadsPage {
	
	@FindBy (id="email")
	public WebElement mail;
	
	@FindBy (id="password")
	public WebElement pass;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[6]/a/span")
	public WebElement Download;
	
	
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[6]/a/span")
	public WebElement Go;
	
	
	public DownloadsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CheckDownloadPage () {
		
		mail.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		
		Download.click();
		Go.click();
		
		
	}

}
