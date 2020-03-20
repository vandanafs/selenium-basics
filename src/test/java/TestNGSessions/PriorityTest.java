package TestNGSessions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityTest {

	
	
	@Test(priority=2, enabled=false)
	public void test1() {
		System.out.println("Test 1 ");
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("Test 2");
	}
	
	
	@Test(priority=-1, enabled=false)
	public void test3() {
		System.out.println("Test3");
	}
		@Test
		public void test4() {
			System.out.println("test4");
		}
		
		
		@Test
		public void test5() {
			System.out.println("Test5");
		}
		
		
		@Test(priority=1)
		public void test6() {
			System.out.println("Test5");
		}

	}
	
	
	

