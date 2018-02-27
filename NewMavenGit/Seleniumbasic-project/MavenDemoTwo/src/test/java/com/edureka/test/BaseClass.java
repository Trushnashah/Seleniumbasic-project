package com.edureka.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver = null;

	@BeforeTest
	@Parameters({"browserType"})
	public void launchBrowser(String browserType) {
		System.out.println("in launch browser before test in base class");

//		String browserType = "firefox";

		if (browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette",
					"D:\\Selenium\\Drivers\\geckodriver_V019\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserType.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\Selenium\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("this browser is not supported");
		}

	}
	
	
	@BeforeSuite()
	public void anotherBeforeSuite(){
		System.out.println("in another before suite in base class");
	}
	
	@BeforeSuite
	public void loadConfigurations(){
		System.out.println("in @Before suite to load configuration in base class");
	}
}
