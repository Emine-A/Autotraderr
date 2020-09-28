package com.autotrader.steps;

import com.autotrader.utils.CommonMethods;
import com.autotrader.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class AutotraderSteps extends CommonMethods {

	@Given("User is in landing page")
	public void user_is_in_landing_page() {
		auto.clearCookies();
	 System.out.println("Landing page");   
	 
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Used and New Car Sales, Review - Autotrader";
		Assert.assertEquals(expectedTitle, actualTitle);
	 try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("Verify that {string} are present")
	public void verify_that_are_present(String expected) throws InterruptedException {
	  Thread.sleep(2000);
		auto.verification(expected); 
		//expected come from feature
	}

	@Then("Verify that search button is present")
	public void verify_that_search_button_is_present() {
	    auto.verifySearcButton();
	}
	@Then("Verify that {string} is visible")
	public void verify_that_is_visible(String make) {
		auto.verifyMakeAndModel(make); 
		
	}
	
	
	
	
	
	
//	@Then("Verify that {string} and {string} is visible")
//	public void verify_that_and_is_visible(String make, String model) {
//	    auto.verifyMakeAndModel(make, model);
//	}

	@Given("User click Advance link on the home page")
	public void user_click_Advance_link_on_the_home_page() {
		CommonMethods.clearCookies();
	   auto.advancedSearch.click();
	   driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
	}

	@Then("User enter {string} in the zip code text box")
	public void user_enter_in_the_zip_code_text_box(String zipCode ) {
		advance.Zip(zipCode);
	}

	@Then("User select {string} check box under {string}")
	public void user_select_check_box_under(String verify, String string2) {
	    
		advance.verifyCertifiedAndConvertible(verify);
		CommonMethods.waitThreadSleep();
	}

	@Then("User update  year {string} to {string}")
	public void user_update_year_to(String from, String to) {
		advance.startDateAndEndDate(from, to);	
		
	}

	@Then("User select {string} car from Make,Model and Trim")
	public void user_select_car_from_Make_Model_and_Trim(String v) {
		advance.selectVehicle(v);
	}

	@Then("User clicks Search Button")
	public void user_clicks_Search_Button() {
		advance.clickSearchButton();
	}

	@Then("User verify that he is in result page")
	public void user_verify_that_he_is_in_result_page() {
	    
		
		advance.verifyResultPage();
	}

	@Then("User verify that he sees only {string} cars in listing")
	public void user_verify_that_he_sees_only_cars_in_listing(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Display in console, the number of cars listed in result page")
	public void display_in_console_the_number_of_cars_listed_in_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Choose make as a {string}")
	public void choose_make_as_a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	
	
	
	
}
