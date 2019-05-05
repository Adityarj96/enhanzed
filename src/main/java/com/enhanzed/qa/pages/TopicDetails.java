package com.enhanzed.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.enhanzed.qa.base.TestBase;

public class TopicDetails extends TestBase
{
	@FindBy(xpath="//img[@class='blackimg']")
	WebElement topicimage;
	
	@FindBy(xpath="//img[@class='wback']")
	WebElement pressback;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Refractive Surgeries')]")
	WebElement topicrs;
	
	@FindBy(xpath="//a[contains(text(),'Quality Indicators for Colonoscopy')]")
	WebElement topicqic;
	
	@FindBy(xpath="//div[@class='htmlgrey']")
	WebElement objecthtml;
	
	@FindBy(xpath="//div[@class='quizgrey']")
	WebElement quiz;
	
	
	
	
	




public TopicDetails()  {
	super();
PageFactory.initElements(driver,this);
}

     public boolean checktopicimage()
     {
    	 return topicimage.isDisplayed();
     }
     
     public void clicktopic() throws InterruptedException
     {
    	 topicrs.click();
    	 //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    	 Thread.sleep(3500);
    	 pressback.click();
    	 topicqic.click(); 
     }
     
     public void checkobject()
     {
    	 if(objecthtml.isDisplayed())
    	 {
    		 WebDriverWait wait = new WebDriverWait(TopicDetails.driver, 100); 
    		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='htmlgrey']")));
    		 element.click();
    	 }
    	 
    	 else if(quiz.isDisplayed())
    	 {
    		 quiz.click();
    	 }
     }
     
    







}
