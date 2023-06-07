package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	
	@Test
	void createCustomer(){
		Reporter.log("Created Cutemer", true);
	}
}
