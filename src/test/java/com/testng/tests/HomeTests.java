package com.testng.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.base.BaseTest;
import com.testng.pages.HomePage;
import com.testng.pages.LoginPage;
import com.testng.utilities.ScreenshotUtility;


public class HomeTests extends BaseTest{
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	ScreenshotUtility screenshot;
	String methodname;
	
	@BeforeMethod
	public void launch() throws InterruptedException {
		driver = launchapplication();
		screenshot = new ScreenshotUtility();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
	}
	@Test(priority = 1)
	public void homePageTestcase() {
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterinpassword("admin123");
		screenshot.takescreenshot(driver, methodname);
		methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		loginpage.waitbeforelogin();
		homepage.clickHome();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test (priority = 2)
	public void studentForm() throws InterruptedException {
		Thread.sleep(5000);
		homepage.enterintoname("Shruti");
		homepage.enterintolastname("Sharan");
		homepage.enterpostaladdress("123 charlotte");
		homepage.enterintopersonaladdress("456 new charlotte");
		homepage.radiobutton();
		homepage.selectcity();
		homepage.selectcourse();
		homepage.selectdistrict();
		homepage.selectstate();
		homepage.enterintopincode("110001");
		homepage.enterintoemail("abc@gmail.com");
		screenshot.takescreenshot(driver, methodname);
		screenshot.takescreenshot(driver, methodname);
		methodname = Thread.currentThread().getStackTrace()[1].getMethodName();
		
		homepage.clickSubmit();
	}
	//@AfterMethod
	//public void teardown() {
		//screenshot.takescreenshot(driver, methodname);
		//closeBrowser();
		
	}
	
	


