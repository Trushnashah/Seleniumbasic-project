package TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;

public class Baseclass {

	//public static WebDriver launchBrowser(String browserType) {
						
			WebDriver driver = null;
		@BeforeSuite
		public void launchBrowser() {
			System.out.println("Launch browser for suite");
			String browserType = "Firefox";
			
		if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette", "C:\\Trushna\\selenium download\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Trushna\\selenium download\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Trushna\\selenium download\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("This browser is not supported");
			}
		return;
		}
	}


