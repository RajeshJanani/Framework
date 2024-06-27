package com.Ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPages 
{
 WebDriver driver;
public RegisterPages(WebDriver ldriver)
{
	this.driver=ldriver;
	PageFactory.initElements(driver, this);

}
@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[3]/a") public WebElement createaccount;
@FindBy(name="firstname") public WebElement firstname;
@FindBy(name="lastname") public WebElement lastname;
@FindBy(name="email") public WebElement Emailadd;
@FindBy(id="password") public WebElement Password;
@FindBy(name="password_confirmation") public WebElement Pass_Confimation;
@FindBy(xpath="//*[@id=\"form-validate\"]/div/div[1]/button") public WebElement create_button;


}
