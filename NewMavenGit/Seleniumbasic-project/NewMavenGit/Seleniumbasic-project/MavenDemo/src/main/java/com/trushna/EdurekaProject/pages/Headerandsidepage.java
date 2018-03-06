package com.trushna.EdurekaProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headerandsidepage {

	
	@FindBy(linkText="SIGN-ON")
	WebElement SIGNON_LINK;
	
	@FindBy(linkText="REGISTER")
	WebElement REGISTER_LINK;
	
	@FindBy(linkText="SUPPORT")
	WebElement SUPPORT_LINK;
		
	@FindBy(linkText="Home")
	public
	WebElement HOME_LINK;
	
	@FindBy(linkText="Flights")
	WebElement FLIGHTS_LINK;
	
	@FindBy(linkText="Hotels")
	WebElement HOTEL_LINK;
	
	@FindBy(linkText="Car Rentals")
	WebElement CARRENTALS_LINK;
	
	@FindBy(linkText="Cruises")
	WebElement CRUISES_LINK;
	
	@FindBy(linkText="Destinations")
	WebElement DEST_LINK;
	
	@FindBy(linkText="Vacations")
	WebElement VACATION_LINK;
	
	
	@FindBy(linkText="CONTACT")
	WebElement CONTACT_LINK;
	
	public Headerandsidepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Signon() {
		SIGNON_LINK.click();
	}
	
	public void Register() {
		REGISTER_LINK.click();
		}
	
	public void Supportlink() {
		SUPPORT_LINK.click();
	}
	
	public void Home() {
		HOME_LINK.click();
	}
	
	public void Flightlink() {
		FLIGHTS_LINK.click();
	}

	public void Hotellink() {
		HOTEL_LINK.click();
	}

	public void Car() {
		CARRENTALS_LINK.click();
	}

	public void Cruise() {
		CRUISES_LINK.click();
	}

	public void Destination() {
		CRUISES_LINK.click();
	}

	public void Vacation() {
		VACATION_LINK.click();
	}

	public void Contacts() {
		CONTACT_LINK.click();
	}



}
