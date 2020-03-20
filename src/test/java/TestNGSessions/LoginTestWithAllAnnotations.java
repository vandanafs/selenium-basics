package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithAllAnnotations {

	//@Before ---->BS, BT,BC,BM,,,,, BS BT BC executed only once  for preconditions for my Test 
	//@Test
	//@After   =---> AM, AC, AT, AS.....AC AT And AS exceuted only once 
	
	/*
	 * BS
	 * BT
	 * BC
	 * 
	 * BM
	 * TC1
	 * AM
	 * 
	 * BM
	 * TC2
	 * AM
	 * 
	 * AC
	 * AT
	 * AS
	 
	 */
	WebDriver driver;
	  
	
	By username=By.id("username");
	By password	=By.id("password");
	By loginBtn=By.id("loginBtn");
	By signUpLink=By.linkText("Sign up");
	By headingOnHomePage=By.xpath("//i18n-string[text()='Take a closer look at how HubSpot works.']");
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before Suite ...prepare test data");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before TEst......DB Conncetuon");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class...get the value from DB");
	}
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void signUpLinkTest() {
		System.out.println("Test Method 1 OR TC1");
		Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		System.out.println("TC2");
		String title=driver.getTitle();
		System.out.println("Title of page :"+title);
		Assert.assertEquals(title, "HubSpot Login", "Test Passed for Title");
		}
	
	@Test(priority=3, enabled=false)
	public void loginTest() {
		driver.findElement(username).sendKeys("vandana.f.09@gmail.com");
		driver.findElement(password).sendKeys("Test@67890");
		driver.findElement(loginBtn).click();
		
	 String headingOnHomeP = driver.findElement(headingOnHomePage).getText();
		Assert.assertEquals(headingOnHomeP, "Take a closer look at how HubSpot works.");
	Assert.assertTrue(headingOnHomeP.contains("Take a closer look at how"));
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("After Method");
	}
	
	@AfterClass
		public void afterClass() {
			System.out.println("After class...delete the user");
		}
		
		@AfterTest
			public void afterTest() {
				System.out.println("After Tests..disconnect the DB");
				}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("After suite .....delete the Test Data");
		}
		
		
		
}
