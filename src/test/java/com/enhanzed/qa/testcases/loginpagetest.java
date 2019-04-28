package com.enhanzed.qa.testcases; 

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.enhanzed.qa.base.TestBase;
import com.enhanzed.qa.pages.LoginPage;
import com.enhanzed.qa.pages.TopicsPage;

public class loginpagetest extends TestBase{
	LoginPage login;
	TopicsPage topic;

	@BeforeMethod
	public void setup() {
		initialization();
		
		login=new LoginPage();	
	}
	@Test(priority=1)
	public void logintesttitle()
	{
	String title= login.verifyloginpagetitle();
	Assert.assertEquals(title, "EnhanzED");
	}
	
	@Test(priority=2)
	public void imagetest() throws InterruptedException
	{
		boolean flag=login.checklogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void logintest()
	{
		 topic=login.login(prop.getProperty("emailid"),prop.getProperty("password"));
		
	}
	
	
}
