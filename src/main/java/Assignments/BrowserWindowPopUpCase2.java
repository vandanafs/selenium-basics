package Assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpCase2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		handleAndIterator(driver);
		driver.findElement(By.linkText("Good PopUp #4")).click();
		handleAndIterator(driver);
		
	}

	public static void handleAndIterator(WebDriver driver) {
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentWindowsID=it.next();
		 System.out.println("parent window "+parentWindowsID);
			String childWindowID= it.next();
			driver.switchTo().window(childWindowID);
			System.out.println("child window:" +childWindowID);
			

			// control at childWindowID3
			System.out.println("PopUp title:" + driver.getTitle());
			driver.close();// 3rd pop up
			driver.switchTo().window(parentWindowsID);
		
}
}