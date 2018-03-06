package com.trushna.EdurekaProject.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActionValidateCredential extends CommonBrowser{

	
			@BeforeClass()
			public void URL() throws InterruptedException{
			 Thread.sleep(2000);
			driver.get("http://newtours.demoaut.com/");
			}

		@Test(dataProvider="TC2",priority=0, groups= {"Testcase2"})
		public void validatelogin(String userName1, String password1) {
			Headerandsidepage Registerpage1 = new Headerandsidepage(driver);
			Registerpage1.HOME_LINK.click();
			HomepageFlightbook page1= new HomepageFlightbook(driver);
			page1.enterUserName(userName1);
			page1.enterPassword(password1);
			page1.login();
			String actualTitle = driver.getTitle();
			System.out.println("Title1:" +actualTitle );
			//String expectedTitle = "Sign-on: Mercury Tours";
			//String expectedTitle ="Find a Flight: Mercury Tours:";
			//assertEquals(expectedTitle,actualTitle);
		
			}

		
		@AfterClass
		public void quit() {
			driver.close();
		}

@DataProvider(name="TC2")
public Object[][] ValidateLoginData() throws Exception{
	String[][] DataFromExcel1 =Edureka_ReadDataFromExcel.edureka_readDataFromExcel("ValidateTCLogin");
	return DataFromExcel1;
}
}