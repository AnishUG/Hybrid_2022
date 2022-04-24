package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UsersPage {

	@FindBy(id = "email")
	public WebElement mail;

	@FindBy(id = "password")
	public WebElement pass;

	@FindBy(xpath = "//button")
	public WebElement button;

	@FindBy(xpath = "/html/body/div[1]/aside/section/ul/li[3]/a/span")
	public WebElement Userbtn;

	@FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	public WebElement AddUserBtn;

	@FindBy(id = "username")
	public WebElement Username;

	@FindBy(id = "mobile")
	public WebElement Mobile;

	@FindBy(id = "email")
	public WebElement Email;

	@FindBy(id = "course")
	public WebElement Course;

	@FindBy(id = "Male")
	public WebElement Gender;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")
	public WebElement State_Dropdown;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")
	public WebElement FriendMobile;

	@FindBy(xpath = "//button")
	public WebElement SubmitBtn;

	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void VerifyTitle() {

		mail.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		Userbtn.click();
		AddUserBtn.click();

	}

	public void createuser() {

		Username.sendKeys("Anhs");
		Mobile.sendKeys("77676767");
		Email.sendKeys("hhh@Test.com");
		Course.sendKeys("JAVA");
		Gender.click();

		Select StateDropdown = new Select(State_Dropdown);
		StateDropdown.selectByVisibleText("Maharashtra");
		password.sendKeys("dfg456");
		FriendMobile.sendKeys("3456987654");
		SubmitBtn.click();

	}

}
