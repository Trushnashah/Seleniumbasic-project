package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTestng extends Baseclass {

	//static WebDriver driver = null;
	@BeforeMethod
	public void launchurl() {
		driver.get("http://newtours.demoaut.com/");
	}
	@Test(priority=1,groups= {"sanity"})
	public void login() {
	driver.get("http://newtours.demoaut.com/");
	WebElement usernamesignin =driver.findElement(By.name("userName"));
	usernamesignin.sendKeys("trushna.shah84");
	WebElement pwdsignin =driver.findElement(By.name("password"));
	pwdsignin.sendKeys("For1");;
	WebElement signinbutton =driver.findElement(By.name("login"));
	signinbutton.click();
	System.out.println("login successfully");
	}
	
	@Test(priority=0,groups={"smoke"})
	public void Hotel() {
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.xpath(".//font[1][@size='4']")).getText();
		System.out.println("Hotel click done");
	}
	
}
