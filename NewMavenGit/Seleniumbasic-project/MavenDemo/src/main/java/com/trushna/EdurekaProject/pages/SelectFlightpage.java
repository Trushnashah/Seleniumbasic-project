package com.trushna.EdurekaProject.pages;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

	public class SelectFlightpage {

		String DEPART_FLIGHTS_NAME = "outFlight";
		
		String RETURN_FLIGHTS_NAME = "inFlight";
		
		String CONTINUE_NAME = "reserveFlights";
		
		
		public  SelectFlightpage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		public void selectToFlight(WebDriver driver, String flightNameValue) {

			selectFlight(driver, By.name(DEPART_FLIGHTS_NAME), flightNameValue);

		}

		
		public void selectReturnFlight(WebDriver driver, String flightNameValue) {

			selectFlight(driver, By.name(RETURN_FLIGHTS_NAME), flightNameValue);

		}

		
		public void clickOnContinueAndWait(WebDriver driver) {

			driver.findElement(By.name(CONTINUE_NAME)).click();
			
			//SeleniumUtil.waitForTitle(driver, title);
		}

		/**
		 * 
		 * @param driver
		 * @param by
		 * @param flightValue
		 */
		public void selectFlight(WebDriver driver, By by, String flightValue) {

			List<WebElement> flights = driver.findElements(by);

			for (WebElement flight : flights) {
				System.out.println("Flight value:" + flight.getAttribute("value"));
				if (flight.getAttribute("value").equalsIgnoreCase(flightValue)) {
					flight.click();
				}
			}
		}
	}


