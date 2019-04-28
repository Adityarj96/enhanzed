package com.enhanzed.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static NgWebDriver ngDriver;
	
	public TestBase(){
		
		try {
			
			prop=new Properties();
			FileInputStream ip=new FileInputStream("H:\\java64bit\\dummy\\src\\main\\java\\com\\enhanzed\\qa\\config\\config.properties");
			prop.load(ip);	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{ 
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "H:\\java64bit\\dummy\\chromedriver.exe");
			driver=new ChromeDriver();
			ngDriver = new NgWebDriver((JavascriptExecutor) driver);
			ngDriver.waitForAngularRequestsToFinish();
		}
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}
	
	

}
