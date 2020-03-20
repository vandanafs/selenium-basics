package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserElementActions {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		
		
		Actions action=new Actions(driver);
        action.sendKeys(emailId, "vandanafrrr@gmail.com").build().perform();//can ignore build() but better practice can use 
        action.sendKeys(password, "trest123").build().perform();
       action.click(loginBtn).build().perform();
        
       // doActionSendKeys(driver, emailId, "vandanaty@gamil.com");
        
	}

	
	   public static void doActionSendKeys(WebDriver driver,WebElement element, String value) {

			Actions action=new Actions( driver);
		    action.sendKeys(element, value).build().perform();
		   
	   }
}
