package com.trushna.EdurekaProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EdurekaProject.util.PrintMessage;

public class FlightConfrimationPage {

@FindBy(xpath=".//td[3]/a[@href='mercurysignoff.php']")
WebElement LOGOUT;

@FindBy(linkText= "mercurywelcome.php")
WebElement BACTTOHOME;

@FindBy(linkText= "mercuryreservation.php")
WebElement BACKTOFLIGHT;


public FlightConfrimationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public void Logout() {
	LOGOUT.click();
	PrintMessage.printerrorMessage("Loggin Off");
	//System.out.println(LOGOUT.getText());
	LOGOUT.getText();
	
	}

}
