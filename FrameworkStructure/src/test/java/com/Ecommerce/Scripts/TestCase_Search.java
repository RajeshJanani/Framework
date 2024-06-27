package com.Ecommerce.Scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Ecommerce.pages.Search;

public class TestCase_Search extends BaseTest
{
@Test(priority=1)
	public void search() throws InterruptedException
	{
		Thread.sleep(500);
		PageFactory.initElements(driver, Search.class);
		Search.search.sendKeys("Women",Keys.ENTER);
	}

@Test(priority=2)
public void price_sorting()
{
	Select s1 = new Select(Search.sorting);
	s1.selectByValue("price");
}
}
