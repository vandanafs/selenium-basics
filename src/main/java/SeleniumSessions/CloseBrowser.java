package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gooogle.com");
		
	    String title=driver.getTitle();
		
		System.out.println("Page title is :"+title);
		driver.quit();
	//	System.out.println(driver.getTitle());//then recreate launch browser 	
		driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
	}

}
