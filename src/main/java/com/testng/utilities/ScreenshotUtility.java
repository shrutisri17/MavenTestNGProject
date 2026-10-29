package com.testng.utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	
	public void takescreenshot(WebDriver driver ,String method) {
		//create a interface which take screenshot
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
		String timeStamp1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
		
		String imagePath = "screenshots/screenshot" + "_" + timeStamp1 + "_" +method+ ".jpeg" ;
		File destFile = new File(imagePath);
		try {
			FileUtils.copyFile(scrFile, destFile);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
