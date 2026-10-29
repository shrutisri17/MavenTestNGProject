package com.testng.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.testng.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a[text()='Home']")
	WebElement Home;
	
	@FindBy(id = "name")
	WebElement firstname;
	
	@FindBy(id = "lname")
	WebElement surname;
	
	@FindBy(id = "postaladdress")
	WebElement postaddress;
	
	@FindBy(id = "personaladdress")
	WebElement homeaddress;
    
	@FindBy(id = "radiobut")
	WebElement female;
	
	@FindBy(id = "city")
	WebElement cityopt;
	
	@FindBy(id = "state")
	WebElement state;


	
	@FindBy(id = "course")
	WebElement course;

	@FindBy(id = "district")
	WebElement district;
	
	@FindBy(id = "pincode")
	WebElement zipcode;

	
	@FindBy(id = "emailid")
	WebElement emailadd;
	@FindBy(className = "bootbutton")
	WebElement bootbutton;


	public void clickHome() {
		waitforelement(Home, Duration.ofSeconds(10));
		Home.click();
	}

	public void enterintoname(String name) {
		firstname.sendKeys("Shruti");
		
	}

	public void enterintolastname(String lastname) {
		surname.sendKeys("Sharan");

	}

	public void enterpostaladdress(String string) {
		postaddress.sendKeys("123 charlotte");

	}

	
	public void enterintopersonaladdress(String string) {
		homeaddress.sendKeys("456 new charlotte");
	}

	
	public void radiobutton() {
		female.click();

	}

	public void selectcity() {
		Select cityOptions = new Select(cityopt);
		cityOptions.selectByContainsVisibleText("NEW DELHI");
	}

	public void selectcourse() {
		Select courseOptions = new Select(course);
		courseOptions.selectByIndex(1);
}

	public void selectdistrict() {
		Select districtOptions = new Select(district);
		districtOptions.selectByValue("newdelhi");
	}


	public void selectstate() {
		Select stateOptions = new Select(state);
		stateOptions.selectByIndex(3);
	}


	public void enterintopincode(String code) {
		zipcode.sendKeys("110001");

	}
	public void enterintoemail(String email) {
		emailadd.sendKeys("abc@gmail.com");
	}

	
	public void clickSubmit() {
		waitforelement(bootbutton, Duration.ofSeconds(10));
		bootbutton.click();
	}

}
