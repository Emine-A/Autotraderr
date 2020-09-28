package com.autotrader.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.autotrader.utils.ConfigsReader;
import com.autotrader.utils.Constants;

public class BaseClass {

	public static WebDriver driver;
	 
	//private static ThreadLocal<WebDriver> t = new ThreadLocal();--> for Paralel test
		
	public static void setUp() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case"chrome":
			System.setProperty("webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
		 driver = new ChromeDriver();
		break;
		case"firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver=new FirefoxDriver();
			break;
			default :
				System.err.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(ConfigsReader.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
//	public BaseClass(){
//	    PageFactory.initElements(BaseClass.driver, this);
//	  }
	
	
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
		}
	}
	
}
