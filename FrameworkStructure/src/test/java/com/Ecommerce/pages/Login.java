package com.Ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	public Login(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a") public WebElement Sign_in;
	@FindBy(name="login[username]") public WebElement Email_login;
	@FindBy(name="login[password]") public WebElement pass_login;
	@FindBy(name="send") public WebElement sign;
	
	
	public void login(String User, String Pass)
	{
Email_login.sendKeys(User);
pass_login.sendKeys(Pass);
sign.click();
	}
}
