package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class OpenAccountTest extends TestBase{
	
	@Test(dataProvider="getData")
	public void openAccount(String customer, String currency) throws InterruptedException{
		
		click("openAccount_css");
		select("customer_css",customer);
		select("currency_css",currency);
		click("process_css");
		
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		
		Assert.fail("Open Account test failed");
		
		
	}
	
	
	@DataProvider
	public Object[][] getData(){
		
	
		return TestUtil.getData("OpenAccountTest");
		
	}

}
