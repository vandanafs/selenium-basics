package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Good PopUp #3")).click();

	    Set<String> handles = driver.getWindowHandles();// set will not contain any duplicate elements but list will
														// have duplicate values, total windows on page including parent page
         
		Iterator<String> it = handles.iterator();//it will not maintain order based indexing hence no For loop
		//iterator pointing to just above set object(just above actual memory allocation of browser windows)
		//hence we have write it.next(); to pick parent browser
		String parentWindowID = it.next(); //first it points 1000 memory location then it.next() points to parent windows
		System.out.println("parent windows id :"+parentWindowID );
		//System.out.println(parentWindowID.);
		String childPopUpID = it.next();
		System.out.println("child windows id:"+childPopUpID);
		
		//now we have to switch pop up in order to perform any action on pop up
		driver.switchTo().window(childPopUpID);
		System.out.println("child windows title:"+driver.getTitle());
		driver.close();//driver control at child pop up hence close if u quit all browser close
		//now driver  lost hence switch to parent windows 
		driver.switchTo().window(parentWindowID);
		System.out.println("parent windows title:"+driver.getTitle());
		//now can use anything close or quit 
		
	}

}
