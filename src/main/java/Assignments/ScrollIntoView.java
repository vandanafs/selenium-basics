package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		
		WebElement aboutUs = driver.findElement(By.linkText("About Us"));
		
		jsUtil.scrollIntoView(aboutUs);
		aboutUs.click();
	}

}
