package com.trushna.EdurekaProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	
	@FindBy(name="firstName")
	WebElement FIRSTNAME_NAME;
	
	@FindBy(name="lastName")
	WebElement LASTNAME_NAME;
		
	@FindBy(name="phone")
	WebElement PHONE;
	
	@FindBy(id="userName")
	WebElement EMAIL;
	
	@FindBy(name="address1")
	WebElement ADDRESS1;
	
	@FindBy(name="address2")
	WebElement ADDRESS2;
	
	@FindBy(name="city")
	WebElement CITY;
	
	@FindBy(name="state")
	WebElement STATE;
	
	@FindBy(name="country")
	WebElement COUNTRYNAME;
	
	@FindBy(name="postalCode")
	WebElement POSTALCODE;
	
	@FindBy(name="email")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSCODE;
	
	@FindBy(name="confirmPassword")
	WebElement CONFIRMPASSWORD;
	
	@FindBy(name="register")
	WebElement SUBMIT;
	
	
public RegisterPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public void enterFirstname(String firstName) {
	FIRSTNAME_NAME.sendKeys(firstName);
}

public void enterLastname(String lastName) {
	LASTNAME_NAME.sendKeys((lastName));
}

public void enterPhone(String phone) {
	PHONE.sendKeys(phone);
}

public void enterEmailId(String email) {
	EMAIL.sendKeys(email);
}

public void enterAddressLine1(String address1) {
	ADDRESS1.sendKeys(address1);
}

public void enterAddressLine2(String address2) {
	ADDRESS2.sendKeys(address2);
}

public void enterCity(String city) {
	CITY.sendKeys(city);
}

public void enterState(String state) {
	STATE.sendKeys(state);
}


public void selectCountryfromdropdown( String country){
	
	Select countryDropDown = new Select(COUNTRYNAME);
	countryDropDown.selectByVisibleText(country);
	System.out.println("Selected country");
}

public void enterPostalCode(String postalcode) {
	POSTALCODE.sendKeys(postalcode);
}

public void enterUserName(String username) {
	USERNAME.sendKeys(username);
}
public void enterPassword(String passcode) {
	PASSCODE.sendKeys(passcode);
}
public void enterConfirmPassword(String confirmpwd) {
	CONFIRMPASSWORD.sendKeys(confirmpwd);
}

public void submitbutton()
{
	SUBMIT.click();
}







}
