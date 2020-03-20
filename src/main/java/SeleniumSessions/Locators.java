package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {


	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://app.hubspot.com/login");
	Thread.sleep(5000);
	  //8 locators, are used to find webelement on webpage button, text,logo,inputbox
	//1.id  I id is always unique
	/*
     driver.findElement(By.id("username")).sendKeys("testsh@gmail.com");
    driver.findElement(By.id("password")).sendKeys("test$555");
    driver.findElement(By.id("loginBtn")).click();
	*/
	// WebElement userName = driver.findElement(By.id("username"));
	//WebElement password = driver.findElement(By.id("password"));
	//WebElement loginBtn = driver.findElement(By.id("loginBtn"));
	
	//userName.sendKeys("test@gmail.com");
	//password.sendKeys("tnggghy87/");
    // loginBtn.click();	
	
	//2.name I II
	 // driver.findElement(By.name("username"));
	  
	  //3.classname iV---unique class name 
	  ////form-control private-form__control login-email
	 // form-control private-form__control login-password m-bottom-3
	 // driver.findElement(By.className("login-email")).sendKeys("yty@gmail.com");
	 // driver.findElement(By.className("login-password m-bottom-3")).sendKeys("vhfhf");
	  		
	//4.xpath, III address of element its not property of element example xpath=somethig dom(data obj model)
	
	//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dnbdh@gmail.com");
	//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ygytgytv");
	//driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
	
	//5.css selector III, never find property css= so its address
	//driver.findElement(By.cssSelector("#username")).sendKeys("dhud@gmail.com");
	//driver.findElement(By.cssSelector("#password")).sendKeys("hbdhbhd");
	
	//6.link text,,,,only for links using text of the link
	//html tag should be <a>
	//90% of href property and text present no id in most cases
	//driver.findElement(By.linkText("Sign up")).click();//sign up link
	
	
	//7.partial link text , For links using partial text of  the link 
	//html tag sgould be <a>
	driver.findElement(By.partialLinkText("Sign ")).click();
	//there are  two links sign up and sign In , if we are using partial text "Sign" click on sign in it may click on sign up hence always use link text
	//90
	//8.tagName
	
	
	}
}
