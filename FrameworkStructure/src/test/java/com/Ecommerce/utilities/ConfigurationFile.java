package com.Ecommerce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationFile {
Properties pro;

public ConfigurationFile()
{

	File src = new File("./ConfigurationFiles/config.properties");
	
	try {
		FileInputStream fis= new FileInputStream(src);
		
		pro= new Properties();
		
		pro.load(fis);
	} catch (Exception e) 
	{
		System.out.println("Not able to load config file "+e.getMessage());
	} 
}

public String getBrowser() 
{
	// TODO Auto-generated method stub
	return pro.getProperty("browser");
}


public String getStagingUrl() 
{
	// TODO Auto-generated method stub
	return pro.getProperty("testurl");
}

public String username()
{
	return pro.getProperty("username");
}

public String password()
{
	return pro.getProperty("password");
}
}
