package com.testng.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testng.base.BasePage;

public class LoginPage extends BasePage{
     WebDriver driver;
	public LoginPage(WebDriver driver){
		super(driver);
		//this.driver = driver;
		//PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="email_field")
	WebElement emailid;
	
	@FindBy(id="password_field")
	WebElement password;
	
	@FindBy(xpath=("//button[text()='Login to Account']"))
	 WebElement loginButton;
		
	
	public void enterintousername(String email) {
		emailid.sendKeys(email);
	}
	public void enterinpassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	
	public void waitbeforelogin() {
		waitforelement(loginButton,Duration.ofSeconds(10));
		loginButton.click();
		
	}
	public void login() {
		loginButton.click();
	}
}
