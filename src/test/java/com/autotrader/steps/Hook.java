package com.autotrader.steps;

import java.util.concurrent.TimeUnit;

import com.autotrader.utils.CommonMethods;
import com.autotrader.utils.Constants;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonMethods {
	
	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario "+scenario.getName());
		setUp();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		initializeAllPage();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);

		}
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenario "+ scenario.getName());
		if(scenario.isFailed()) {
			byte[] picture = takeScreenshot("/failed/"+scenario.getName());
			scenario.embed(picture, "image/png");
			}else {
			byte[] picture=	takeScreenshot("/passed/"+scenario.getName());
			scenario.embed(picture, "image/png");
			}
			tearDown();
		}
	}


