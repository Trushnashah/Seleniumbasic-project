package com.trushna.EdurekaProject.pages;

import java.util.List;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.EdurekaProject.util.PrintMessage;

public class FlightBookingPage {

	/*@FindBy(css = "[name^='passFirst']")
	//List<WebElement> firstNameEles;// = "[name^='passFirst']";
	WebElement firstNameEles;*/
	
	@FindBy(name="passFirst0")
	WebElement firstpass0;

	@FindBy(name="passFirst1")
	WebElement firstpass1;
	
	@FindBy(name="passFirst2")
	WebElement firstpass2;
	
	
	@FindBy(css = "[name^='passLast']")
	//List<WebElement> lastNamesEles;
	WebElement astNamesEles;
	
	@FindBy(css = "[name^='pass.'][name$='.meal']")
	//List<WebElement> mealPrefElems;
	WebElement mealPrefElems;
	
	@FindBy(name="creditCard")
	WebElement selectCreditCard;
	
	@FindBy(name="creditnumber")
	WebElement enterCreditCardNumber;
	
	@FindBy(xpath=".//td[3]/select[1][@name='cc_exp_dt_mn']")
	WebElement monthOfExpiration;
	
	@FindBy(xpath=".//td[3]/select[2][@name='cc_exp_dt_yr']")
	WebElement yearOfExpiration;
	
	@FindBy(name="cc_frst_name")
	WebElement nameOfCCholder ;
	
	@FindBy(name="cc_mid_name")
	WebElement middlefCCholder ;
	
	@FindBy(name="cc_last_name")
	WebElement lastOfCCholder ;
	
	@FindBy(xpath=".//tr[8]/td[2]/input[@name='ticketLess']")
	WebElement ticketlessCheckboxSelect;
	
	
	@FindBy(name="billAddress1")
	WebElement billaddress1ForFlightBook;
	
	@FindBy(name="billAddress2")
	WebElement billaddress2ForFlightBook;
	
	@FindBy(name="billCity")
	WebElement billNameOfCity;
	
	@FindBy(name="billState")
	WebElement billNameOfState;
	
	@FindBy(name="billZip")
	WebElement billPostalCode;
	
	@FindBy(name="billCountry")
	WebElement billOfCountry;
	
	@FindBy(xpath=".//tr[14]/td[2]/input[@name='ticketLess']")
	WebElement sameAsBillAddCheckbox;
	
	
	@FindBy(name="delAddress1")
	WebElement deladdress1ForFlightBook;
	
	@FindBy(name="delAddress2")
	WebElement deladdress2ForFlightBook;
	
	@FindBy(name="delCity")
	WebElement delNameOfCity;
	
	@FindBy(name="delState")
	WebElement delNameOfState;
	
	@FindBy(name="delZip")
	WebElement delPostalCode;
	
	@FindBy(xpath=".//td[2]/select[@name='delCountry']")
	WebElement delOfCountry;
	
	@FindBy(name = "buyFlights")
	WebElement SECURE_PURCHASE;
	
	
	public FlightBookingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void EnterName0(String name0 ) {
		firstpass0.sendKeys(name0);
	}
	
	

	public void EnterLastname(String lastname) {
		astNamesEles.sendKeys(lastname);
	}
	
	public void SelectMeal(String meal){
		Select meal1= new Select(mealPrefElems);
		meal1.selectByVisibleText(meal);
	}
	
	public void CreditcarDetail(String CCdetail) {
	Select CC= new Select(selectCreditCard);
	CC.selectByVisibleText(CCdetail);
	}
	
	public void CredicCardNumber(String CCnumber) {
		enterCreditCardNumber.sendKeys(CCnumber);
	}
		
	public void ExpirationMonthDetail(String ExpMonth) {
	Select monthOfExp =new Select(monthOfExpiration);
	monthOfExp.selectByVisibleText(ExpMonth);
	}
	
	public void ExpirationYearDetail(String ExpYear) {
		Select YearExp =new Select(yearOfExpiration);
		YearExp.selectByVisibleText(ExpYear);
		}

	public void enterCCholderName(String CCname) {
		nameOfCCholder.sendKeys(CCname);
	}
	
	public void enterCCholdermidName(String CCmidname) {
		middlefCCholder.sendKeys(CCmidname);
	}
	
	public void enterCCholderlastName(String CClastname) {
		lastOfCCholder.sendKeys(CClastname);
	}
	
	public void Address1OfBill(String billAdd1) {
		billaddress1ForFlightBook.sendKeys(billAdd1);
	}
	
	public void Address2OfBill(String billAdd2){
		billaddress2ForFlightBook.sendKeys(billAdd2);
	}
	
	public void CityofBill(String billCity1) {
	billNameOfCity.sendKeys(billCity1);
	}
	
	public void StateofBill(String billState1) {
	billNameOfState.sendKeys(billState1);
	}
	
	public void PostalcodeofBill(String billPostal1) {
		billPostalCode.sendKeys(billPostal1);
	}
	public void CountryofBill(String billCountry1) {
		Select BillCountry= new Select (billOfCountry);
			BillCountry.selectByVisibleText(billCountry1);
	}
	
	

	
	public void Address1Ofdel(String delAdd1) {
		deladdress1ForFlightBook.sendKeys(delAdd1);
	}
	
	public void Address2Ofdel(String delAdd2){
		deladdress2ForFlightBook.sendKeys(delAdd2);
	}
	
	public void Cityofdel(String delCity1) {
	delNameOfCity.sendKeys(delCity1);
	}
	
	public void Stateofdel(String delState1) {
		delNameOfState.sendKeys(delState1);
	}
	
	public void Postalcodeofdel(String delPostal1) {
		delPostalCode.sendKeys(delPostal1);
	}
	public void Countryofdel(String delCountry1) {
			Select delCounty= new Select(delOfCountry);
		delCounty.selectByVisibleText(delCountry1);
	}
		
	public void secureButtonClick() {
		SECURE_PURCHASE.click();
	}
	
	
	
	}

		

