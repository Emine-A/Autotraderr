package com.autotrader.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features"
		,glue= "com/autotrader/steps"
		,dryRun=false         // find unimplemented if it is true before executed false show after executed
		,plugin= {"pretty", "html:target/html/cucumber-default-report",
				"json:target/cucumber.json",
		"rerun:target/rerun.txt"}
		,monochrome=true  

				,tags= {"@Smoke"}
		)

public class SmokeRunner {

}
