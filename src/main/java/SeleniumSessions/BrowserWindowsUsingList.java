package SeleniumSessions;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowsUsingList {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
	
Set<String> handle = driver.getWindowHandles();
	Iterator<String> it = handle.iterator();
	String parentWId = it.next();
	
	List<String> windowsList=new ArrayList<String>(handle);
	//ArrayList is child of List Interface
	//never write new List<> bcos interface can not new object 
	
	String parentWindowsID = windowsList.get(0);
	String childWindowID = windowsList.get(1);
	System.out.println("patrent windows ID :"+parentWindowsID);
	System.out.println("child windows ID:"+childWindowID);
	
	
	
	
	
	
	
	}

}
