package com.autotrader.utils;

public class Constants {
	//public static final String CREDENTIALS_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/configs/Configuration.properties";
    //System.getProperty("user.dir") give project path
	
public static final String CREDENTIALS_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/Configs/Configuration.properties"; 
public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver";
public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/drivers/geckodriver";
public static final String SCREENSHOTS_FILEPATH=System.getProperty("user.dir")+"/target/screenshots";
public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/reports/Hrms.html";

public static final int PAGE_LOAD_TIME = 30;
public static final int IMPLICIT_LOAD_TIME = 10;
public static final int EXPLICIT_LOAD_TIME = 30;
	
}
