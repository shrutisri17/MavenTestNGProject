package com.testng.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	FileInputStream fileinput;
	String value = null;
	
	public String getProperty(String Key) {
		//file path
		String filepath = "properties/application.properties";
		// create a filename Stream
		try {
			fileinput = new FileInputStream(filepath);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// properties file object
		Properties prop = new Properties();
		try {
			prop.load(fileinput);
		}catch (IOException e) {
			e.printStackTrace();
		}
		//read the value by passing the key
		value = (String) prop.get(Key);
		return value;
		}
		
		
	}


