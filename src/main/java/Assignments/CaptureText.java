package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys("vandana.f.09@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@ff");
		driver.findElement(By.id("loginBtn")).click();
		
		Thread.sleep(3000);
		
		//checkbox
		 //driver.findElement(By.id("remember")).click();
		String text = driver.findElement(By.className("private-checkbox__text")).getText();
		System.out.println(text);
		//capture emaid id label
		String emailIdLabel = driver.findElement(By.className("private-form__label UIFormControl__InlineFormLabel-sc-1vhyrz3-0 SnlfQ")).getText();
		System.out.println(emailIdLabel);
	//	String error = driver.findElement(By.className("private-alert__title H5-sc-1o270om-0 jaYosH Heading-sc-9dtc71-0 gEXcAV")).getText();
		//System.out.println(error);
	
	//String error2 = driver.findElement(By.className("private-alert__body has--vertical-spacing")).getText();
	//System.out.println(error2);
	
	
	}

}
