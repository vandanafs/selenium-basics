package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestBasic {

	//@Before ---->BS, BT,BC,BM
	//@Test
	//@After   =---> AM, AC, AT, AS
	
	
	WebDriver driver;
	  
	
	By username=By.id("username");
	By password	=By.id("password");
	By loginBtn=By.id("loginBtn");
	By signUpLink=By.linkText("Sign up");
	By headingOnHomePage=By.xpath("//i18n-string[text()='Take a closer look at how HubSpot works.']");
	
	
	@BeforeTest
	//@BeforeMethod
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());
	}
	
	@Test(priority=2)
	public void pageTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title of page :"+title);
		Assert.assertEquals(title, "HubSpot Login", "Test Passed for Title");
		}
	
	@Test(priority=3)
	public void loginTest() {
		driver.findElement(username).sendKeys("vandana.f.09@gmail.com");
		driver.findElement(password).sendKeys("Test@67890");
		driver.findElement(loginBtn).click();
		
	 String headingOnHomeP = driver.findElement(headingOnHomePage).getText();
		Assert.assertEquals(headingOnHomeP, "Take a closer look at how HubSpot works.");
	Assert.assertTrue(headingOnHomeP.contains("Take a closer look at how"));
	}
	
	
	@AfterTest
	//@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}
