package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
 // Throwable is super  class of Exception.class
//	super class of all Exception is Exception.class
	
	//when to use in real time projects
	// 1.demo to customer or management TCs not working due to somr Exception just make it greeen by proving Exception class
	//2.Deliberately i want to test negative scenario, my test should throw exception in case handle Exception
	//@Test(expectedExceptions=Throwable.class)
	//@Test(expectedExceptions=ArithmeticException.class)
	//@Test(expectedExceptions=NullPointerException.class)
	
	//multiple Exceptions are 
	@Test(expectedExceptions= {ArithmeticException.class, NullPointerException.class})
	public void loginTest() {
		System.out.println("login test...starting");
		
	int i=9/0;
	System.out.println("login test..end");
	
	
	}
	
}
