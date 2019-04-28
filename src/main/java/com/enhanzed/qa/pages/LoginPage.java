package com.enhanzed.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.enhanzed.qa.base.TestBase;

public class LoginPage extends  TestBase
{
   
	//webelements in login page (Page factory or Object repository)
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement usernameemail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
    WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='loginbuttonnew']")
	WebElement loginbutton;
	
	@FindBy(xpath="//img[contains(@class,'applogo')]")
	WebElement companylogo;
	

	//initializing page objects
	public LoginPage()  {
		super();
	PageFactory.initElements(driver,this);
	}
    
	//Actions
	
	public String verifyloginpagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean checklogo() throws InterruptedException
	{
	   driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		return companylogo.isDisplayed();
	}
	
	public TopicsPage login(String emailid,String password) {
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		usernameemail.sendKeys(emailid);
		enterpassword.sendKeys(password);
		loginbutton.click();
		
		
		
		return new TopicsPage();
		
	}
	
	

}
