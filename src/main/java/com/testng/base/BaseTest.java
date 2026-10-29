package com.testng.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.testng.utilities.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	PropertiesFile properties = new PropertiesFile();
	
	
	public WebDriver launchapplication() throws InterruptedException   {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			
			 driver = new ChromeDriver(options);
			//driver.manage().window().maximize();
			driver.get("https://selenium-prd.firebaseapp.com");
			String applicationurl = properties.getProperty("url");
			driver.get(applicationurl);
		
	
			
			Thread.sleep(3000);
		}
		return driver;
	}
	public void closeBrowser() {
		if(driver!=null) {
			driver.quit();
			driver = null;
		}
		
	}

}
