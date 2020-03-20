package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gooogle.com");
		
	    String title=driver.getTitle();
		System.out.println("page title is:"+title);
		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();//google
		driver.navigate().forward();//amazon
		driver.navigate().back();//google
		driver.navigate().refresh();
		
		
		
	}

}
