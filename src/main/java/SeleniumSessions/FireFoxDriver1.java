package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxDriver1{

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
	//	System.setProperty("WebDriver.gecko.driver", "")
		WebDriver driver=new FirefoxDriver();
		//safari browser therer is no exe file inbuild under window tab
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
