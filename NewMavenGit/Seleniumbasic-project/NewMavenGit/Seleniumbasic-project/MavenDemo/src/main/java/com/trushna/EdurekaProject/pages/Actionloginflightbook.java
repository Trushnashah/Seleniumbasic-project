package com.trushna.EdurekaProject.pages;


import java.util.concurrent.SynchronousQueue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EdurekaProject.Metadata.FlightDetailsEnum;
import com.trushna.readdatafromExccel.readDatafromExcel;

import TestNgPractice.Baseclass;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;


public class Actionloginflightbook extends CommonBrowser  {

		
	@BeforeClass()
		public void LounchURL() throws InterruptedException{
		 Thread.sleep(2000);
		
		driver.get("http://newtours.demoaut.com/");
		}

		
	@Test(dataProvider="Registerdata", priority=0, groups= {"Testcase1"})
	public void registerUrl(String FirstName, String lastname, String phone, String Email, String Address1, String Address2, 
				String City, String State, String postalcode , String country, String Username,
				String password, String confirmpassword) {
		Headerandsidepage Registerpage = new Headerandsidepage(driver);
		Registerpage.REGISTER_LINK.click();
		RegisterPage registerdata = new RegisterPage(driver);
		registerdata.enterFirstname(FirstName);
		registerdata.enterLastname(lastname);
		registerdata.enterPhone(phone);
		registerdata.enterEmailId(Email);
		registerdata.enterAddressLine1(Address1);
		registerdata.enterAddressLine2(Address2);
		registerdata.enterCity(City);
		registerdata.enterState(State);
		registerdata.enterPostalCode(postalcode);
		registerdata.selectCountryfromdropdown(country);
		registerdata.enterUserName(Username);
		registerdata.enterPassword(password);
		registerdata.enterConfirmPassword(confirmpassword);
		registerdata.submitbutton();
		
		System.out.println("Registered successfully"); 
	}
	
	@Test(dataProvider="logindata", priority=1,groups= {"Testcase1"})
	public void logintourl(String userName, String password) {
		Headerandsidepage Registerpage = new Headerandsidepage(driver);
		Registerpage.HOME_LINK.click();
		HomepageFlightbook page= new HomepageFlightbook(driver);
		page.enterUserName(userName);
		page.enterPassword(password);
		page.login();
		String actualTitle = driver.getTitle();
		System.out.println("Title1:" +actualTitle );
		
	}
	
	@Test(dataProvider="FlightbookingData", priority=2,groups= {"Testcase1"})
	public void flightFinder(String type, String passanger, String departingfrom, String departingmonth, String departingday, 
		String arriving,String returingMonth, String returingDay, String flighClass, String airline1 ) throws InterruptedException {
		
	FlightFinderPage BookFlight = new FlightFinderPage(driver);
	BookFlight.selectTripType(type);
	BookFlight.selectPassangerNumber(passanger);
	BookFlight.departingFrom(departingfrom);
	BookFlight.selectDepartingMonth(departingmonth);
	BookFlight.selectDepartingDay(departingday);
	BookFlight.arrivingIn(arriving);
	BookFlight.selectreturningMonth(returingMonth);
	BookFlight.selectreturningDay(returingDay);		
	BookFlight.selectClass(flighClass);
	BookFlight.selectAirline(airline1);
	BookFlight.clickOnContinue();

	}
	
	
	@Test(dataProvider="SelectFlight", priority=3,groups= {"Testcase1"})
	 public void SelectFlighttrial(String departFlight, String returnFlight) throws InterruptedException {
		 
		SelectFlightpage selectyourFlight= new SelectFlightpage(driver);
		selectyourFlight.selectToFlight(driver, departFlight);
		selectyourFlight.selectReturnFlight(driver,returnFlight);
		selectyourFlight.clickOnContinueAndWait(driver);
	}

	/* @Test(dataProvider="Flightbooking", priority=4)
		public void bookAFlightforTrip(String[] name, String[] Lastname) {
			
		trialbookdata Booking = new trialbookdata(driver);
		System.out.println("List of firstname:"+ name);
		Booking.enterFirstName(name);
		Booking.enterLastName(Lastname);
		//Booking.SelectMeal(meal);
	 }*/
	 
	 
	@Test(dataProvider="Flightbooking", priority=4,groups= {"Testcase1"})
	public void bookAFlightforTrip(String Name, String Lastname, String meal, String CardDetail,String CardNumber, String CardexpMonth,
			String CardexpYear, String CardFirstname, String CardMidname, String CardLastname,
			String AddBill1, String AddBill2, String Bcity, String Bstate,String Bpostalcode, String BCountry,
			String AddDel1, String AddDel2, String Dcity, String Dstate, String Dpostalcode,String DCountry) {
		
	FlightBookingPage Booking = new FlightBookingPage(driver);
	Booking.EnterName0(Name);
	Booking.EnterLastname(Lastname);
	Booking.SelectMeal(meal);
	Booking.CreditcarDetail(CardDetail);
	Booking.CredicCardNumber(CardNumber);
	Booking.ExpirationMonthDetail(CardexpMonth);
	Booking.ExpirationYearDetail(CardexpYear);
	Booking.enterCCholderName(CardFirstname);
	Booking.enterCCholdermidName(CardMidname);
	Booking.enterCCholderlastName(CardLastname);
	Booking.Address1OfBill(AddBill1);
	Booking.Address2OfBill(AddBill2);
	Booking.CityofBill(Bcity);
	Booking.StateofBill(Bstate);
	Booking.PostalcodeofBill(Bpostalcode);
	Booking.CountryofBill(BCountry);
	Booking.Address1Ofdel(AddDel1);
	Booking.Address2Ofdel(AddDel2);
	Booking.Cityofdel(Dcity);
	Booking.Stateofdel(Dstate);
	Booking.Postalcodeofdel(Dpostalcode);
	Booking.Countryofdel(DCountry);
	
	Alert alertforflightbook =driver.switchTo().alert();
	String alerttext= alertforflightbook.getText();
	System.out.println(alerttext);
	alertforflightbook.accept();
	Booking.secureButtonClick();
	}
	
	
	 @Test(priority=5,groups= {"Testcase1"})
	public void Flighconfirm() {
		FlightConfrimationPage confirmFlight= new FlightConfrimationPage(driver);
		confirmFlight.Logout();
		String titleDone = driver.getTitle();
		System.out.println(" Testcase done" +titleDone);
	}
	
	/* @AfterClass
		public void quit() {
			driver.close();
	 }
	*/
	@DataProvider(name="Registerdata")
		public Object[][] RegisterData() throws Exception{
			//String[][] DataFromExcel= Edureka_ReadDataFromExcel.edureka_readDataFromExcel();
			String[][] DataFromExcel =Edureka_ReadDataFromExcel.edureka_readDataFromExcel("Register");
			return DataFromExcel;
	}
	
	
		@DataProvider(name="logindata")
		public Object[][] LoginData() throws Exception{
			//String[][] DataFromExcel= Edureka_ReadDataFromExcel.edureka_readDataFromExcel();
			String[][] DataFromExcel =Edureka_ReadDataFromExcel.edureka_readDataFromExcel("Login");
			return DataFromExcel;
		}


		@DataProvider(name="FlightbookingData")
			public Object[][] FlightbookingData() throws Exception{
				//String[][]DataFromExcel=Edureka_ReadDataFromExcel.edureka_readDataFromExcel("FlightFinder");
			String[][] DataFromExcel = Edureka_ReadDataFromExcel.edureka_readDataFromExcel("FlightFinder");
				return DataFromExcel;
			}
		
		
		@DataProvider(name="SelectFlight")
			public Object[][] SelectRoundtripFlight() throws Exception{
				String[][] DataFromExcel=Edureka_ReadDataFromExcel.edureka_readDataFromExcel("SelectFlight");
				return DataFromExcel;
			}

		
		@DataProvider(name="Flightbooking")
		public Object[][] BookFlight() throws Exception{
			String[][] DataFromExcel=Edureka_ReadDataFromExcel.edureka_readDataFromExcel("BookAFlight");
		//	String[][][] DataFromExcel=Edureka_ReadDataFromExcel.edureka_readDataFromExcel("3PPL");
			
			//String[][] DataFromExcel= TrialExcelforPassengername.trial_edureka_readDataFromExcel("Flightdata");
			return DataFromExcel;
		}
		}
		

