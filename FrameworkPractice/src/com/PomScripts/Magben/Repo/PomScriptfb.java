package com.PomScripts.Magben.Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScriptfb 
{
	@FindBy(id="email")
	private WebElement un;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement button;
	 
	public PomScriptfb(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void user(String usname)
	{
		un.sendKeys(usname);
	}
	public void password(String psw)
	{
		pwd.sendKeys(psw);
	}
	public void but()
	{
		button.click();
	}
	

}
