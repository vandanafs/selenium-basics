package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	   ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);

//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver=new FirefoxDriver(fo);
		
		driver.get("http://www.gooogle.com");
	    String title=driver.getTitle();
		System.out.println("Page title is :"+title);
		
		if(title.contentEquals("Google")) {
			System.out.println("correct tile ");
		}
		else {
			System.out.println("incoreecr  title");
		}
		
		//driver.quit();
	}

}
