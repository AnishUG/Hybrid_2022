package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (id="email")
	public WebElement mail;
	
	@FindBy (id="password")
	public WebElement pass;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication () {
		
		mail.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		
		
	}

}
