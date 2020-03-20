package com.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Parameters;

@Test
public class LoginTest {

WebDriver driver;
	  
	
	By username=By.id("username");
	By password	=By.id("password");
	By loginBtn=By.id("loginBtn");
	By signUpLink=By.linkText("Sign up");
	By headingOnHomePage=By.xpath("//h1[text()='Sales Dashboard']");
	
	
	@BeforeTest
	@Parameters({"url","browser"})
	public void setup(String appurl, String browserName) throws Exception {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
		else {
			System.out.println("please pass the correct browswer Name");
			throw new Exception("NoSuchBrowserException");
		}
		driver.get(appurl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void signUpLinkTest() {
		System.out.println("Test Method 1 OR TC1");
		AssertJUnit.assertTrue(driver.findElement(signUpLink).isDisplayed());
	}
	
	@Test (priority=2)
	public void pageTitleTest() {
		System.out.println("TC2");
		String title=driver.getTitle();
		System.out.println("Title of page :"+title);
		Assert.assertEquals(title, "HubSpot Login", "Test Passed for Title");
		}
	
	@Test (priority=3)
	@Parameters({"username", "password"})
	public void loginTest(String uName, String Pwd) {
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(loginBtn).click();
		
	 String headingOnHomeP = driver.findElement(headingOnHomePage).getText();
	//	Assert.assertEquals(headingOnHomeP, "Sales Dashboard");
	Assert.assertTrue(headingOnHomeP.contains("Sales Dashboard"));
	}
	
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
