package TestNGSessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodsConcepts {

//if login getting failed then HomePgae and Search Page shoukd not bcos they are depends on loginTest
	


	
	@Test(priority=1)
	public void loginTest() {
		System.out.println("Login Test ");
	//	int i=9/0; //delibearelty fail hency HP and SP should not execute
	}
	
	@Test(priority=2,invocationCount=2,dependsOnMethods= {"loginTest"},expectedExceptions=Exception.class)
	public void homePageTest() {
		System.out.println("HomePage TEst");
		int i=9/0;
	}
	
	
	@Test(priority=3,dependsOnMethods= {"loginTest","homePageTest"})
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	
}
