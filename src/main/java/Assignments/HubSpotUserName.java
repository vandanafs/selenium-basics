package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotUserName {

	public static void main(String[] args) {
		
		By username=By.id("username");
		By password	=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		By homePageHeader = By.cssSelector(" h1.private-page__title");
		By loggedInUserName = By.cssSelector("div.user-info-name");

   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.get("https://app.hubspot.com/");
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.findElement(username).sendKeys("vandana.f.09@gmail.com");
   driver.findElement(password).sendKeys("Test@67890");	
	driver.findElement(loginBtn).click();
	
	driver.findElement(By.cssSelector(" img.nav-avatar")).click();
	String accName=driver.findElement(By.cssSelector("div.navAccount-accountName")).getText();
	System.out.println(accName);
//	Actions action=new Actions(driver);
//	action.moveToElement(target).build().perform();
//	
	
	
	
	}

}
