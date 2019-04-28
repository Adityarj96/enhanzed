package com.enhanzed.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.enhanzed.qa.base.TestBase;

public class TopicsPage extends TestBase 
{
	@FindBy(xpath="//img[@class='headerimage']")
	WebElement loginimage;
	
	@FindBy(xpath="//a[contains(text(), 'Not Started  ')]")
	WebElement notstarted;
	
	@FindBy(xpath="//div[@class='dropdown1']")
	WebElement explore;
	
	@FindBy(xpath="//p[contains(text(),' All Medical Topics')]")
	WebElement allmedicaltopics;
	
	@FindBy(xpath="//a[contains(text(),'AMBICON 2017')]")
	WebElement topicambicon;
	
	
	
	
	
	public TopicsPage()  {
		super();
	PageFactory.initElements(driver,this);
	}

	
	
	public void clicexplore()
	{
		explore.click();
		allmedicaltopics.click();
	}
	
	public topicambiconpage clickonambicon()
	{
		topicambicon.click();
		return new topicambiconpage();
	}
	

}
