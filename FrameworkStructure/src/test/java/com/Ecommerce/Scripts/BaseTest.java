package com.Ecommerce.Scripts;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Ecommerce.utilities.BrowserFactory;
import com.Ecommerce.utilities.ConfigurationFile;

public class BaseTest {
	public static WebDriver driver;
	public ConfigurationFile config;
	
	@BeforeSuite
	public void setUpSuite()
	{
		config=new ConfigurationFile();
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());

	}
	
	/*
 @AfterSuite
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}*/
	
}
