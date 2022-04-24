package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	@FindBy (xpath="/html/body/div/div[2]/a")
	public WebElement RegistrationBtn;
	
	@FindBy (id="name")
	public WebElement Name;
	
	
	@FindBy (id="mobile")
	public WebElement Mobile;
	
	
	@FindBy (id="email")
	public WebElement email;
	
	@FindBy (id="password")
	public WebElement password;
	
	@FindBy (xpath="//button")
	public WebElement button;
	
	
	public RegistrationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usercreated () {
		
		
    Name.sendKeys("Anish");
    Mobile.sendKeys("867676767");
    email.sendKeys("ann@test.com");
    password.sendKeys("2345fgh");	
    button.click();
		
	}
	
	public void NameValidation () {
		RegistrationBtn.click();	
	    Name.sendKeys("");
	    Mobile.sendKeys("867676767");
	    email.sendKeys("ann@test.com");
	    password.sendKeys("2345fgh");	
	    button.click();	
		
	}

}
