package com.autotrader.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	//Emine
	
	public static Properties prop;
	
	//This method load the file
	public static Properties readProperties (String filePath) {
		
		try {
			FileInputStream file = new FileInputStream(filePath);
			prop= new Properties();
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	
	//This method get properties from .properties file as a store key=value
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

	
	
}
