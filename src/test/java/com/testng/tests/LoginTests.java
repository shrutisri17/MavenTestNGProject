package com.testng.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.LoginPage;
import com.testng.utilities.ScreenshotUtility;

public class LoginTests extends BaseTest {
	WebDriver driver;
	LoginPage loginpage;
	String methodname;
	
	ScreenshotUtility screenshot;
	
	@BeforeMethod
	public void launch() throws InterruptedException {
		driver = launchapplication();
		loginpage = new LoginPage(driver);
	}
	@Test
	public void loginwithvalidCredentials() {
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterinpassword("admin123");
		screenshot.takescreenshot(driver, methodname);
		methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		loginpage.login();
	}
    //@Test
    public void loginwithinvalidCredentials() {
    	loginpage.enterintousername("abc@gmail.com");
		loginpage.enterinpassword("admin123");
		loginpage.login();
    }
		
		@AfterMethod
		public void teardown() {
			screenshot.takescreenshot(driver, methodname);
			closeBrowser();
		}
		
    }

