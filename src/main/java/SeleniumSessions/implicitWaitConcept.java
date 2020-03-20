package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWaitConcept {
//imp wait --will be applied for all web elements by default.
	//global wait,,, WebElements 
	//imp wait is dynamic in nature, applicable for elements and elemnts .
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://app.hubspot.com/login");
	//Thread.sleep(5000);//static wait 
     driver.findElement(By.id("username")).sendKeys("avandanabs");//e1
     driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);//nullify IMP wait 
     driver.findElement(By.id("password")).sendKeys("tetsjjjj");//e2
     //automatically it waits for all elements lest say we have 100 elements 
     
     //e3
     //e4  i want keep imp wait for e5
 	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //e5
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
