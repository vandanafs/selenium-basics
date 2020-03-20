package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementTExt {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
	System.out.println(driver.findElement(By.className("signup-link")).getText())	;
	
	//click- link,button,images,checkbox,radiobutton
	//sendKeys()-test fieldsd
	//getText()-getting text from label, text,error msg
		driver.quit();
	}

}
