package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName,String postCode,String alertText) throws InterruptedException{
		
		click("addCustBtn_css");
		type("firstName_css",firstName);
		type("lastName_css",lastName);
		type("postCode_css",postCode);
		click("addCustomer_css");
		
		/*Alert alert = driver.switchTo().alert();
		alert.getText();*/
		Thread.sleep(2000);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alertText),"Customer not added !!!");
		alert.accept();
		Thread.sleep(2000);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
	
		return TestUtil.getData("AddCustomerTest");
		
	}

}
