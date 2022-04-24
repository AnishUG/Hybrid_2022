package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsefulLinkPage {
	
	@FindBy (id="email")
	public WebElement mail;
	
	@FindBy (id="password")
	public WebElement pass;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	@FindBy (xpath="/html/body/div/aside[1]/section/ul/li[5]/a/span")
    public WebElement link;	
	
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a/span")
    public WebElement Go;	
	
	
	public UsefulLinkPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CheckUsefulink () {
		
		mail.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		
		link.click();
		Go.click();
		
	}
}
