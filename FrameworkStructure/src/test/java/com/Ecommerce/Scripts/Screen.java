package com.Ecommerce.Scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen extends BaseTest 
{
	public static void captureScreenShot(WebDriver driver,String testName) throws IOException
	 {
		 // Convert webdriver object to TakesScreenshot interface
		 TakesScreenshot screenshot= ((TakesScreenshot)driver);
		 
		 // Step 2 :call getScreenshotAs method to capture image file
		 
		 File src= screenshot.getScreenshotAs(OutputType.FILE);
		 File srcpath=new File("."+"//Screenshots//"+ testName + ".png");
		 
		 // Step 3 : copy image file to destination 
		 FileUtils.copyFile(src, srcpath);
		 
	 }
}
