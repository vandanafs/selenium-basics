package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	public static void main(String[] args) throws InterruptedException {
		//verify sign up link
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
		System.out.println(signUpLink.isDisplayed());
		
		List<WebElement> signupList = driver.findElements(By.linkText("Sign up"));
		if(signupList.size()>0) {
			System.out.println("signup link present on the  page");
		}
		else {
			System.out.println("signUp link is not present on page");
		}
	}

}
