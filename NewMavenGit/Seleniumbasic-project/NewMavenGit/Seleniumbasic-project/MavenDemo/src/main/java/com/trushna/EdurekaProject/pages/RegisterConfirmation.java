package com.trushna.EdurekaProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterConfirmation {

	@FindBy(xpath="*//table//tr[3]//td//font/b")
			WebElement REGISTER_CONFIRMATION;
			
	
	public void RegisterConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void RegisterconfirmationMsg(WebDriver driver, String confirmationText) {
		
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.titleIs(confirmationText)) ;
		REGISTER_CONFIRMATION.getText();
		
	}
}
