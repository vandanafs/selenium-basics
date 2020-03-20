package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public static void main(String[] args) {
		WebDriver driver=null;
		
		String browser="opera";
		if(browser.equals("Chrome")) {
			//System.setProperty(key, value);
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if (browser.equals("safari")) {
			driver=new SafariDriver();
		}
		
		else {
			System.out.println("please use the correct browser...browser not found");
		}
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}
