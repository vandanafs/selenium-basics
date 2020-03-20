package TestNGSessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountCOncepts {

	//user creation scenario used most, 10 accounts or users will be created .
//hit the API 
	@BeforeMethod
	public void launchBrow() {
		System.out.println("Bwoser Launched");
	}
	
	@Test(priority=1, invocationCount=2)
	public void test1() {
		System.out.println("Test 1 ");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("Test 2");
	}
	
	
	@Test(priority=-1, invocationCount=3)
	public void test3() {
		System.out.println("Test3");
	}
	
	
}
