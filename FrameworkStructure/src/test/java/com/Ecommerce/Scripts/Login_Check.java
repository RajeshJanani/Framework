package com.Ecommerce.Scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Ecommerce.pages.Login;
import com.Ecommerce.utilities.ConfigurationFile;

public class Login_Check extends BaseTest
{
	public ConfigurationFile config;
@Test
	public void loginverification() throws IOException, InterruptedException
	{
	config = new ConfigurationFile();
		Login l = new Login(driver);
		l.Sign_in.click();
		
		l.login(config.username(),config.password());
		Thread.sleep(1000);
		if(config.username().equals("jana@gmail.com") && config.password().equals("xyz456XYZ"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			Screen.captureScreenShot(driver,"Login Failed");
			System.out.println("Username and Password Mismatch");
		}
	}


	
}
