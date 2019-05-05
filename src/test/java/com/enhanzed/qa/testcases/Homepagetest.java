package com.enhanzed.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.enhanzed.qa.base.TestBase;
import com.enhanzed.qa.pages.Homepage;
import com.enhanzed.qa.pages.LoginPage;

public class Homepagetest extends TestBase
{
	LoginPage login;
	Homepage home;
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		login=new LoginPage();
		home=new Homepage();	
	}
	
	@Test(priority=1)
	public void checkhomepage() throws InterruptedException
	{
		login.login(prop.getProperty("emailid"),prop.getProperty("password"));
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		 SoftAssert sa = new SoftAssert();
		// driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		// sa.assertTrue(home.checkhomepageimage(), "the image is not present");
		 //sa.assertTrue(home.checkhomepageimage());
		 sa.assertTrue(home.mostpopulartopicscheck(), "the text mostpopular topics is not present");
		 sa.assertTrue(home.usernamecheck(), "the username feild is not present");
		 sa.assertAll();
		 
		 
	}

}
