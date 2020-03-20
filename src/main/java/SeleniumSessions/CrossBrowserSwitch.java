package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserSwitch {

	public static void main(String[] args) {
		WebDriver driver = null;
		String browser="chrome";
		
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("Chrome launch");
		  break;
		  
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("FireFox launch");
		  break;
		  
		case "safari":
			//WebDriverManager.sa
			driver=new SafariDriver();
			System.out.println("Safari");
			break;
			
			default:
				System.out.println("incorrect browser, please provide correct ");
				break;
				}
		    driver.get("http://www.google.com");
		    System.out.println(driver.getTitle());
	}

}
