package com.trushna.EdurekaProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//For Page 
//1. Selenium Annotations
//2. Constructor for pagefactory
//3. Methods


public class HomepageFlightbook {

	//Annotations	
	@FindBy(name= "userName")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSWORD;
	
	@FindBy(name= "login")
	WebElement SIGNIN;
	
	@FindBy(linkText="your destination")
	WebElement YOURDEST_LINK;
	
	@FindBy(linkText="featured vacation destinations")
	WebElement FUTUREDEST_LINK;
	
	@FindBy(partialLinkText="Register")
	WebElement REGISTERHERE_LINK;
	
	@FindBy(partialLinkText="Business")
	WebElement BUSINESSTRAVEL_LINK;
	
	@FindBy(linkText="Salon Travel")
	WebElement SALON_LINK;
	
	// Constructor
	
	public HomepageFlightbook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public void enterUserName(String userName) {
		USERNAME.sendKeys(userName);
		}
	
	public void enterPassword(String password) {
		PASSWORD.sendKeys(password);
	}
	
	public void login() {
		SIGNIN.click();
		//PrintMessage.printMessage("TITLE:" + driver.getTitle());
	}
	
	public void Register() {
		REGISTERHERE_LINK.click();
	}
	
	
}
