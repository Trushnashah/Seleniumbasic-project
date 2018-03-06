package TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstcry extends Baseclass {
	@BeforeMethod
	public void runurl() {
		driver.get("http://www.firstcry.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginintoFC() {
	 driver.findElement(By.xpath("//*[@id=\"amt\"]/div[2]/div[1]/div[1]/div[3]/div")).click();
		
	}
	}


