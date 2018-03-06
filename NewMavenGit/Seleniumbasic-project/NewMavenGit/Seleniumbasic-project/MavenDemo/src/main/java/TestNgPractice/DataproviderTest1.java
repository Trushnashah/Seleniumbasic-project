package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import com.trushna.readdatafromExccel.readDatafromExcel;

public class DataproviderTest1 extends Baseclass{
	
	@BeforeMethod
	public void launchurl() {
		driver.get("http://newtours.demoaut.com");
	}
		@Test(dataProvider= "Inputforlogin")
		public void login(String userName, String password ) {
			System.out.println("userName:" + userName + " password: "+ password);
			driver.findElement(By.name("userName")).sendKeys(userName);;
			driver.findElement(By.name("password")).sendKeys(password);
	//	WebElement usernamesignin =driver.findElement(By.name("userName"));
		//usernamesignin.sendKeys("trushna.shah84");
		
	//	WebElement pwdsignin =driver.findElement(By.name("password"));
		//5\-pwdsignin.sendKeys("For1");
		
		WebElement signinbutton =driver.findElement(By.name("login"));
		signinbutton.click();
		System.out.println("login successfully");
	}	
		//******************Hardcoding Data***************
		/*//@DataProvider(name="Inputforlogin")
		public Object[][] loginInputFromExcel() throws Exception {
			String[][] DataFromExcel= readDatafromExcel.ReadDataFromExcel();
			return DataFromExcel;
		}
			
	//	@DataProvider(name="Inputforlogin")
		  public Object[][] logininput(){
		    Object[] firstset = new Object[] {"trushna.shah84","For1"};
			Object[] secset = new Object[] {"naveen","test"};
			Object[] thirdset = new Object[] {"naveen","test2"};
			Object[] forthset = new Object[] {"trushna","shah"};
			Object[][] data = new Object[][] {firstset,secset,thirdset,forthset};
			return data;
			}*/
		
		
		
}


