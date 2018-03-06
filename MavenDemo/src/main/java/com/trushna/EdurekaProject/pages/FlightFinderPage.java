package com.trushna.EdurekaProject.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage {

	
	@FindBy(xpath=".//input[@value='roundtrip']")
	WebElement TRIP_ROUNDTRIP  ;
	
	@FindBy(css="[value='oneway']")
	WebElement TRIP_ONEWAY ;
	
	@FindBy(name="passCount")
	WebElement PASSENGERS_COUNT ;
	
	@FindBy(name="fromPort")
	WebElement DEPARTING;
	
	@FindBy(name="fromMonth")
	WebElement ON_MONTH ;
	
	@FindBy(name="fromDay")
	WebElement ON_DATE ;
	
	@FindBy(name="toPort")
	WebElement ARRIVING;
	
	@FindBy(name="toMonth")
	WebElement RETURNING_MONTH ;
	
	@FindBy(name="toDay")
	WebElement RETURNING_DATE ;
	
	@FindBy(xpath=".//input[@value='Coach']")
	WebElement ECONOMY_CLASS ;
	
	@FindBy(xpath=".//input[@value='Business']")
	WebElement BUSINESS_CLASS ;
	
	@FindBy(xpath=".//input[@value='First']")
	WebElement FIRST_CLASS ;
	
	@FindBy(xpath=".//td[2]/select[@name='airline']")
	WebElement AIRLINE_NAME;
	
	@FindBy(name="findFlights")
	WebElement CONTINUE_BUTTON ;
	
	

	public FlightFinderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}

	//public void FlightFinderPage(WebDriver driver) {
		//PageFactory.initElements(driver, this);


	public void selectTripType(String triptype) {
		if (triptype.equalsIgnoreCase("Roundtrip"))
			TRIP_ROUNDTRIP.click();
		if(triptype.equalsIgnoreCase("OneWay"))
			TRIP_ONEWAY.click();
	}
	
	
	public void selectPassangerNumber(String passagercount) {
		Select passanger =new Select(PASSENGERS_COUNT);
		passanger.selectByVisibleText(passagercount);
		System.out.println("Selected number of passengers :"
				+ passagercount);
	}
	
	public void departingFrom(String departing) {
		Select DepartigCountry = new Select(DEPARTING);
		DepartigCountry.selectByVisibleText(departing);
	}
	
	public void selectDepartingMonth(String monthDepart) {
		Select monthofDeparting= new Select(ON_MONTH);
				monthofDeparting.selectByVisibleText(monthDepart);
	}

	public void selectDepartingDay(String dayDepart) {
		Select dayofDeparting= new Select(ON_DATE);
		dayofDeparting.selectByVisibleText(dayDepart);
	}
	
	public void arrivingIn(String arriving) {
		Select arrivvingCountry = new Select(ARRIVING);
		arrivvingCountry.selectByVisibleText(arriving);
	}

	public void selectreturningMonth(String month) {
		Select monthofReturn= new Select(RETURNING_MONTH);
		monthofReturn.selectByVisibleText(month);
		}

	public void selectreturningDay(String dayReturn) {
		Select dayofRetruning= new Select(RETURNING_DATE);
		dayofRetruning.selectByVisibleText(dayReturn);
	}

	public void selectClass(String flighClass) {
		if (flighClass.equalsIgnoreCase("Coach"))
		ECONOMY_CLASS.click();
		if(flighClass.equalsIgnoreCase("Business"))
			BUSINESS_CLASS.click();
		if (flighClass.equalsIgnoreCase("First"))
			FIRST_CLASS.click();
	}
	
	 public void selectAirline(String airline1) {
		Select chooseAirline=new Select(AIRLINE_NAME);
		chooseAirline.selectByVisibleText(airline1);
	}
	
	 public void clickOnContinue() {
		 CONTINUE_BUTTON.click();
	 }
	 }	
	
	
	
	
	
	
	
	
	
	
	
	





