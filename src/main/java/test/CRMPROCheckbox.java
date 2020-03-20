package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumSessions.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMPROCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://classic.crmpro.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		WebElement frameElement1 = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		driver.switchTo().frame(frameElement1);
		driver.findElement(By.xpath("//ul[@class='mlddm']/li[4]/a")).click();
	
		Thread.sleep(5000);
		selectContact(driver, "da ca");
		selectContact(driver,"David Thomos");
		//a[text()='da ca']/..//preceding-sibling::td/input[@type='checkbox']
		//a[text()='da ca']//parent::td//preceding-sibling::td/input
	}
   
	
	  public static void selectContact(WebDriver driver, String name) {
		  Actions action=new Actions(driver);
			WebElement tarElement = driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//preceding-sibling::td/input"));
		    action.click(tarElement).perform();
		
	  }
	
	
	
	
	
	
	
	
}
