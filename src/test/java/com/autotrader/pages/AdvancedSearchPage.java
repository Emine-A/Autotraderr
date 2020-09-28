package com.autotrader.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.autotrader.testbase.BaseClass;
import com.autotrader.utils.CommonMethods;
import com.autotrader.utils.Constants;

public class AdvancedSearchPage extends CommonMethods {

	@FindBy(xpath="//a[text()='Advanced Search']")
	public WebElement advancedSearch;

	@FindBy(xpath="//input[@id='zip3004']")
	public WebElement zipCode;

	@FindBy(xpath="//div[contains(text(),'Certified')]")
	public WebElement selectCertified;

	@FindBy(xpath="//div[contains(text(),'Convertible')]")
	public WebElement selectConvertible;

	@FindBy(xpath="//select[contains(@name,'startYear')]")
	public WebElement selectFrom;

	@FindBy(xpath="//select[contains(@name,'endYear')]")
	public WebElement selectTo;

	@FindBy(xpath="//select[contains(@name,'makeFilter0')]")
	public WebElement selectBMW;

	@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-block')]")
	public WebElement clickSearchButton;

	@FindBy(xpath="//title[contains(text(),'Certified Cars for Sale')]")
	public WebElement userInPage;

	@FindBy(xpath="//h2[contains(@data-cmp,'subheading')]")
	public WebElement onlyBMW;

	@FindBy(xpath="//div[contains(@data-cmp,'inventoryListing')]")
	public WebElement numberOfBMW;
	


	public AdvancedSearchPage () {

		PageFactory.initElements(BaseClass.driver, this);

	}

	public void Zip(String zipCode) {
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		advance.zipCode.sendKeys("30004");
	}

	public void verifyCertifiedAndConvertible(String verify) {
		if(verify.equalsIgnoreCase(selectCertified.getText())) {
			selectCertified.click();
		}else {
			WebElement link = selectConvertible;
			scrollDown(link);
			selectConvertible.click();

			CommonMethods.waitThreadSleep();
		}
	}
	
	public void startDateAndEndDate(String from, String to) {
		Select select1 = new Select(selectFrom);
		select1.selectByValue(from);
		Select select2 = new Select(selectTo);
		select2.selectByValue(to);
		CommonMethods.waitThreadSleep();
	}

	public void selectVehicle(String v) {
		Select select3=new Select(selectBMW);
		select3.selectByValue(v);
		
	}
	
	public void clickSearchButton() {
		WebElement link = clickSearchButton;
		scrollDown(link);
		clickSearchButton.click();

	}
	
	//after search button click
	public void verifyResultPage() {
	String expected = "BMW Cars for Sale in Alpharetta, GA (with Photos) - Autotrader";
	String actual = userInPage.getText();
	Assert.assertEquals(expected, actual);	
	}
	
	public void verifyBMWListing(String car) {
		
	List<WebElement>list =driver.findElements(By.xpath("//h2[contains(@data-cmp,subheading)]"));	
	 int count =0;
	 int nonBMWcount=0;
	 for(WebElement each:list) {
		if(!each.getText().contains(car)) {
			System.out.println("I found non BMW listing " +nonBMWcount);
		}
		count++ ;
	 }
	 System.out.println("I found "+count + "BMW listing and There is no non BMW listing");
	}
	
	public void verifyNumberOfBMW() {
	List<WebElement> list = driver.findElements(By.xpath("//div[contains(@data-cmp,'inventoryListing')]"));	
		
	System.out.println("Number of BMW listed in result page is :"+list.size());	
	int actual = list.size();
	String expected = driver.findElement(By.xpath("//div[contains(@class,'results-text-container ')]")).getText();
	System.out.println(expected);
	
	
	String [] arr= expected.split(" ");
	int expectedResult = Integer.parseInt(arr[2]);
	Assert.assertEquals("Assertion failed", expected, actual);
	
	}
	
	
	
	
	
	
	
	

}
