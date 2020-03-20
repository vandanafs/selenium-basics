package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WedDriverBasics {

	public static void main(String[] args) {
		
 //  value="C:\\Users\\vanda\\Downloads\\chromedriver_win32"   location
		// WebDriverManager.chromedriver().setup();
	//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
	System.setProperty("WebDriver.gecko.driver", "C:\\Users\\vanda\\Downloads\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
		 driver.get("http://www.google.com");
        String title= driver.getTitle();
        System.out.println( "page tile is: "+ title);
        
        
        if(title.equals("Google")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("incoreect  title");
        }
        
       System.out.println( driver.getCurrentUrl());
        
        driver.quit();
        
        
	}

}
