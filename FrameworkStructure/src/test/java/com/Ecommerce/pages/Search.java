package com.Ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	WebDriver driver;
	public Search(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="q") public static WebElement search;
	@FindBy(id="sorter") public static WebElement sorting;
}
