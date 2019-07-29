package com.ActTIme.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.ActTIme.Generic.BasePage;



public class LoginPage extends BasePage
{
	//Declaration
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgBT;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement errmsg;
	
	@FindBy(xpath="//nobr[.='actiTIME 2019.3 Pro']")
	private WebElement version;
	
	
	//intlization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	//utlization
	
	public void EnterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void EnterPassWord(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void CLickOnLogin()
	{
		lgBT.click();
	}
	
	public String verifyErrMsg()
	{
		verifyElement(errmsg);
		String aerrormsg=errmsg.getText();
		return aerrormsg;
	}
	
	public String verifyVersion()
	{
		verifyElement(version);
		String atitle= version.getText();
		return atitle;
	}
	
	
}
