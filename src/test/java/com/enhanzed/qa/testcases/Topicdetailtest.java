package com.enhanzed.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.enhanzed.qa.base.TestBase;
import com.enhanzed.qa.pages.LoginPage;
import com.enhanzed.qa.pages.TopicDetails;

public class Topicdetailtest extends TestBase 
{
	LoginPage login;
	TopicDetails topic;
	TestBase test;
	

	@BeforeMethod
	public void setup() {
		initialization();
		
		login=new LoginPage();
		topic=new TopicDetails();
		test=new TestBase();
	}

	@Test(priority=1)
	public void checktopicpageattributes() throws InterruptedException
	{
		login.login(prop.getProperty("emailid"),prop.getProperty("password"));
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
          topic.clicktopic();
		 SoftAssert sa = new SoftAssert();
		 sa.assertTrue(topic.checktopicimage(),"the topic image is not displayed");
		 topic.checkobject();
		 test.cookie();
		
	}
}
