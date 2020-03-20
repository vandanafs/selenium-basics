package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vandana.f.09@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@67890");
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		
		Thread.sleep(5000);
		driver.navigate().to("https://app.hubspot.com/contacts/7143560/contacts/list/view/all/");
		 
		Thread.sleep(3000);
		selectContact(driver, "Rachit");
		selectContact(driver,"Shaanvi Sri");
		//span[text()='John M']//ancestor::td//preceding-sibling::td//input/..      //xpsath checkbox
	
	}
   
	
	  public static void selectContact(WebDriver driver, String name) {
		  Actions action=new Actions(driver);
			WebElement tarElement = driver.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']"));
		    action.click(tarElement).perform();
		
	  }
	
	
	
	
	
	
	
	
}
