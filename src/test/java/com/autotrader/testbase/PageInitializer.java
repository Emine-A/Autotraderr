package com.autotrader.testbase;

import com.autotrader.pages.AdvancedSearchPage;
import com.autotrader.pages.AutotraderPage;


public class PageInitializer extends BaseClass {

	protected static AutotraderPage auto;
	protected static AdvancedSearchPage advance;
	
	
	public static void initializeAllPage() {
		
	auto = new 	AutotraderPage();
	advance=new AdvancedSearchPage();
	
	}
}

