package TestNgPractice;

import org.testng.annotations.Test;

public class Dummyclass {

	@Test(priority=1,groups= {"smoke"})
	public void testClass() {
		System.out.println("First dummy testing");
	}

	@Test(priority=0,groups= {"Regression"})
	public void invalidCred(){
		System.out.println("Invalid credintials");
	}
	
	@Test(groups= {"sanity"})
	public void nullUsername(){
		System.out.println("Null user name");
		
	}
	}

