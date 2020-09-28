package com.autotrader.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.autotrader.testbase.PageInitializer;





public class CommonMethods extends PageInitializer {
	
	public static void clearCookies() {
		
		driver.manage().deleteAllCookies();
	}

	public static void scrollDown(WebElement link) {
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",link);
	}
	public static byte[] takeScreenshot(String fileName) {
       //  commons io dpendency for take a screenshot
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MMdd_HHmmss");
		String timeStamp=sdf.format(date.getTime());

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] picture = ts.getScreenshotAs(OutputType.BYTES);
		File file = ts.getScreenshotAs(OutputType.FILE);
		String scrshotFile=Constants.SCREENSHOTS_FILEPATH+fileName+timeStamp+".png";

		try {
			FileUtils.copyFile(file, new File(scrshotFile));
		} catch (IOException e) {
			System.out.println("Cannot take a screenshot");
		}

		return picture ;
	}
	
	////////////////////////////////////////////////////////////////////////
	
	public static void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
		
	}
	
	public static void waitThreadSleep() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
}
