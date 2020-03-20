package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcepts {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		

		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginbtn");
		waitForElementToBePresent(driver, username, 16).sendKeys("vandanjujdd");
		
//		WebDriverWait wait=new WebDriverWait(driver,15);//object RHS
//		wait.until(ExpectedConditions.presenceOfElementLocated(username));//checks on DOM 
//		
//		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(username)));//not working both DOM and UI should happend together hence not working
		//driver.findElement(username).sendKeys("vandanafrr");
		driver.findElement(password).sendKeys("yetsts");
		waitForElementToBePresent(driver, loginBtn, 15).click();
		System.out.println(driver.getTitle());

	}

	public static WebElement waitForElementToBePresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);// object RHS
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));// checks on DOM

		return driver.findElement(locator);
	}

	
	
	
}
