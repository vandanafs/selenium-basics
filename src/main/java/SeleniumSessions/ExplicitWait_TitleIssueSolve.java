package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_TitleIssueSolve {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login");
		
		
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.titleContains("HubSpot"));
	//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
	//wait.until(ExpectedConditions.titleIs("HubSpot"));//TimeoutExceptions
		
		System.out.println(getTitleExplicitly(driver, "HubSpot"));
		

	}

	public static String getTitleExplicitly(WebDriver driver, String value) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(value));
		return driver.getTitle();
	}
	
	
}
