package interview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUPCase1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowsID = it.next();
		String chindWindowsID3= it.next();
		String chindWindowsID4 = it.next();
		
		
		driver.switchTo().window(chindWindowsID3);//control at 3rd PU
		System.out.println("PopUp 3 title  :"+driver.getTitle());
		driver.close();//3rd
		
		driver.switchTo().window(chindWindowsID4);//at 4th pop up
		System.out.println("Pop up 4 title:"+driver.getTitle());
		driver.close();//4th
		
		driver.switchTo().window(parentWindowsID);
		System.out.println("parent window title:"+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
	}

}
