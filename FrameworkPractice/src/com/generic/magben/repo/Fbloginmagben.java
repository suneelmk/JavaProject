package com.generic.magben.repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.PomScripts.Magben.Repo.PomScriptfb;

public class Fbloginmagben {
  
	
	WebDriver driver;
	@BeforeClass
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	  
	@BeforeMethod
	public void details()
	{
		PomScriptfb p=new PomScriptfb(driver);
		
		
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
