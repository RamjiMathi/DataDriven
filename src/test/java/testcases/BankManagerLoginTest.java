package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager(){
		
		click("bmlBtn_css");
		Assert.assertTrue(isElementPresent("addCustBtn_css"),"Login not successful");
		
		Assert.fail("Bank Manager login not successful");
		
	}

}
