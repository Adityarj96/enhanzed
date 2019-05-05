package com.enhanzed.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.enhanzed.qa.base.TestBase;

public class Homepage extends TestBase 
{
	//pagefactory or object repository for homepage
	
	//check for the page logo
	@FindBy(xpath="//header[@class='enheader2']//img[contains(@class,'headerimage')]")
	WebElement enhanzedlogohomepage;
	
	@FindBy(xpath="//h3[contains(text(),'Most Popular Topics')]")
	WebElement checkmostpopulartopics;
	
	@FindBy(xpath="//p[contains(text(),'2019 EnhanzED Education (P) Ltd.')]")
	WebElement checkcopyright;
	
	@FindBy(xpath="//button[contains(text(),'aditya')]")
	WebElement checkusername;

	@FindBy(xpath="//a[contains(text(),'Depression')]")
	WebElement topicdepression;

	
	//initializing page objects
		public Homepage()  {
			super();
		PageFactory.initElements(driver,this);
		}
	    
		public boolean checkhomepageimage() throws InterruptedException
		{   
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			return enhanzedlogohomepage.isDisplayed();
		}
	  
		public boolean mostpopulartopicscheck() throws InterruptedException
		{
			return checkmostpopulartopics.isDisplayed();
		}
		
		public boolean usernamecheck() throws InterruptedException
		{
			return checkusername.isDisplayed();
		}
		
		public void gotodepression()
		{
			topicdepression.click();
		}
		
		
		
	
	
	
	
    
	

}
