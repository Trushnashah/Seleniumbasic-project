package TestNgPractice;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;


import com.trushna.EdurekaProject.pages.HomepageFlightbook;
import com.trushna.readdatafromExccel.readDatafromExcel;



public class DataProviderandReaddatafromExcel extends Baseclass {
	
	@BeforeClass()
	public void LounchURL() throws InterruptedException{
	 Thread.sleep(2000);
	 //System.setProperty("webdriver.firefox.marionette", "C:\\Trushna\\selenium download\\geckodriver.exe");
	//	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	}

@Test(dataProvider="logindata")
public void logintourl(String userName, String password) {
	
	HomepageFlightbook page= new HomepageFlightbook(driver);
	page.enterUserName("userName");
	page.enterPassword("password");
	page.login();
	
}

@DataProvider(name="logindata")
public Object[][] LoginData() throws Exception{
	String[][] DataFromExcel= readDatafromExcel.ReadDataFromExcel();
	return DataFromExcel;
}


	/*@BeforeMethod()
	public void lunchurl() throws InterruptedException {
		 Thread.sleep(2000);
	driver.get("http://newtours.demoaut.com/");
	
	}
	
		@Test(dataProvider="Inputforlogin")
		public void loginIntoUrl(String userName,String password) {
			System.out.println("userName:" + userName + " password: "+ password);
			driver.findElement(By.name("userName")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		System.out.println("login successfully");
		}
		
		@Test(dataProvider="InputforRegister")
		public void registerintourl(String FirstName, String lastname, String phone, String Email, String Address, 
				String City, String State, String postalcode, String Username,
				String password, String confirmpassword) {
		
			System.out.println("Firstname:" + FirstName + " Lastname: "+ lastname + "Phone: "+ phone+ "Email: "+Email+
					"Address: "+ Address + "City: "+ City+ "State: "+ State+"Postalcode: "+ postalcode+
					 "Username: "+Username+ "Password: "+ password+"Confirmpassword: "+confirmpassword );
			
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys(FirstName);
			driver.findElement(By.name("lastName")).sendKeys(lastname);
			driver.findElement(By.name("phone")).sendKeys(phone);
			driver.findElement(By.id("userName")).sendKeys(Email);
			driver.findElement(By.name("address1")).sendKeys(Address);
			//driver.findElement(By.name("address2")).sendKeys();
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(postalcode);
			driver.findElement(By.name("email")).sendKeys(Username);
			driver.findElement(By.name("password")).sendKeys();
			driver.findElement(By.name("confirmPassword")).sendKeys();
			driver.findElement(By.name("register")).click();
		
		System.out.println("Registered successfully");
		}
		/*@DataProvider(name="Inputforlogin")
		public Object[][] loginInputFromExcel() throws Exception {
			String[][] dataFromExcel = ReadDataFromExcel.readDataFromExcel();
			//return dataFromExcel;
			return dataFromExcel;
				}
		
		@DataProvider(name= "InputforRegister")
		public Object[][] registerInputfromExcel() throws Exception {
			String[][] DataFromExcel = ReadDataFromExcel.readDataFromExcel();
					return DataFromExcel ;
		}
		/*@AfterMethod
		//public void registerScreenshot() {
			TakesScreenshot screen = (TakesScreenshot) driver;
			File file =screen.getScreenshotAs(OutputType.FILE);
			String path= "C:\\Trushna\\Selenium Edureka\\Edureka_Project_submit";
			try {
				FileUtils.c
			}
			*/
		
		
		}

