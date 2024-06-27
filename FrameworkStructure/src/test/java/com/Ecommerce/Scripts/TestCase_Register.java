package com.Ecommerce.Scripts;

import org.testng.annotations.Test;

import com.Ecommerce.pages.RegisterPages;

public class TestCase_Register extends BaseTest
{
@Test(enabled=false)
	public void register()
	{
	RegisterPages rp = new RegisterPages(driver);
	rp.createaccount.click();
	rp.firstname.sendKeys("j");
	rp.lastname.sendKeys("raj");
	rp.Emailadd.sendKeys("j111@gmail.com");
	rp.Password.sendKeys("xyz908XYZ");
	rp.Pass_Confimation.sendKeys("xyz908XYZ");
	rp.create_button.click();
	
	}
	
}
