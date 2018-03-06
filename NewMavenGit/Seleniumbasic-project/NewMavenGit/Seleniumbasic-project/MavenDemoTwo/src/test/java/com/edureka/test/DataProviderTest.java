package com.edureka.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.edureka.pages.HomePage;
import com.edureka.readexcel.ReadDataFromExcel;

public class DataProviderTest extends BaseClass{

	
	@BeforeMethod
	public void loadUrl(){
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test(dataProvider="InputForLogin")
	public void login(String userName, String password,String dummy, String fourthColumn){
		
		HomePage page = new HomePage(driver);
		PageFactory.initElements(driver, HomePage.class);
		page.enterUserName(userName);
		page.enterPassword(password);
		page.clickOnSubmit();
	}
	
	
//	@DataProvider(name="InputForLogin")
	public Object[][] loginInput(){
		Object[] firstSet = new Object[]{"kumar","test",null};
		
		Object[] secSet = new Object[]{"Naveen","test",null};
		Object[] thirdSet = new Object[]{"Naveen_2","test",""};
		Object[] fourthSet = new Object[]{"test","password","empty"};
		
		Object[][] data = new Object[][]{firstSet,secSet,thirdSet,fourthSet};
		
		return data;
	}
	
	@DataProvider(name="InputForLogin")
	public Object[][] loginInputFromExcel() throws Exception{
		String[][] dataFromExcel = ReadDataFromExcel.readDataFromExcel("Sheet1");
		
		return dataFromExcel;
	}
}
