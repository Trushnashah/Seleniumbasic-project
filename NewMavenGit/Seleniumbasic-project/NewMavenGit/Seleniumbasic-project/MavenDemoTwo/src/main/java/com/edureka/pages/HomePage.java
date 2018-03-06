package com.edureka.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePage {

	//locatorType -- locator value
	
	@FindBy(name="userName")
	WebElement USERNAME;
	
	@FindBy(name="password")
	WebElement PASSWORD;
//Trushna
	@FindBy(name="login")
	WebElement SIGNIN;

	@FindBy(linkText="your destination")
	WebElement URDESTINATION;
	
	@FindBy(linkText="your destination")
	List<WebElement> URDESTINATIONS;
	
	@FindAll({@FindBy(name="demo"),@FindBy(id="demo1")})
	WebElement ele;
	
	@FindBys({@FindBy(name="demo"),@FindBy(name="demo1")})
	List<WebElement> elements;
	
	@FindBy(name="demo")
	List<WebElement> data;
	
	@FindBy(name="demo1")
	List<WebElement> data2;
	
	

	public HomePage(WebDriver driver){
//		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {

//		driver.findElement(By.name(USERNAME_NAME)).sendKeys(userName);
		USERNAME.sendKeys(userName);
	}

	public void enterPassword(String password) {

		PASSWORD.sendKeys(password);
	}

	public void clickOnSubmit() {

		SIGNIN.click();
	}

	public void clickOnYourDestination() {
		URDESTINATION.click();
	}

}
