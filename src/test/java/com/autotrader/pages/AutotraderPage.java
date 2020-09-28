package com.autotrader.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.autotrader.testbase.BaseClass;
import com.autotrader.utils.CommonMethods;
import org.junit.Assert;



public class AutotraderPage extends CommonMethods {

	@FindBy(xpath="//button[text()='Browse by Make']")
	public WebElement browserByMake; 
	
	@FindBy(xpath="//button[text()='Browse by Style']")
	public WebElement browserByStyle;
	
	@FindBy(xpath="//a[text()='Advanced Search']")
	public WebElement advancedSearch;
	
	@FindBy(id="search")
	public WebElement searcButton;
	
	@FindBy(xpath="//select[@id='makeCode']")
	public WebElement makeElement;
	
	@FindBy(xpath="//div[@class='form-group']/following::select ")
	public WebElement modelElement;
	
	public AutotraderPage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void verification(String expected) {
		
//		System.out.println("======= expected is " + expected);
//		String actual5= browserByMake.getText();
//		String actual6 = browserByStyle.getText();
//		String actual7 = advancedSearch.getText();
//
//		System.out.println("======= actual5  is " + actual5);
//		System.out.println("======= actual6  is " + actual6);
//		System.out.println("======= actual7  is " + actual7);

		if(expected.equals(browserByMake.getText())) {
			
			System.out.println(browserByMake.getText());
			String actual=browserByMake.getText();
			
			Assert.assertEquals(expected, actual );
		}else if (expected.equals(browserByStyle.getText())) {
			String actual = browserByStyle.getText();
			Assert.assertEquals( expected, actual);
		}else {
		String actual = advancedSearch.getText();
//		System.out.println("actual is " + actual);
//		System.out.println("expected is " + expected);
		
		Assert.assertEquals(expected, actual);
		}
	}
	
	public void verifySearcButton() {
		Boolean src = searcButton.isEnabled();
		Assert.assertTrue(src);
	}
	
	public void verifyMakeAndModel( String make) {
		Assert.assertTrue("Make not enabled",makeElement.isDisplayed() );
		Assert.assertTrue("Model not enable", modelElement.isDisplayed());
	}
	
	public void multipleChoice(String model) {
		makeElement.sendKeys(model);
		
		
	}
}

