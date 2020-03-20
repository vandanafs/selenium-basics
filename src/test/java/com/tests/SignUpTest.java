package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpTest {

	WebDriver driver;
	
	By signUpLink=By.xpath("//i18n-string[text()='Sign up']");
	By signUPLink=By.linkText("Sign up");
	By termsServicesLink=By.linkText("HubSpot Customer Terms of Service.");
	By createFreeAcc=By.xpath("//h4[text()='Create your free account']");
	
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
	public void verifyTermAndServicesTest() {
		//driver.findElement(signUpLink).click();
		Assert.assertTrue(driver.findElement(termsServicesLink).isDisplayed());
		
	}
	
	@Test(priority=2)
	public void verifyCreateFreeAccountTest() {
		Assert.assertTrue(driver.findElement(createFreeAcc).isDisplayed());
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
