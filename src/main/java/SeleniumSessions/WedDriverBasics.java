package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WedDriverBasics {

	public static void main(String[] args) {
		
 //  value="C:\\Users\\vanda\\Downloads\\chromedriver_win32"   location
		// WebDriverManager.chromedriver().setup();
	System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vanda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", "C:\\Users\\vanda\\workspace2\\Selenium3WebDriver\\Driver");
		WebDriver driver=new ChromeDriver();
		//if ur company using just Chrome then u can write 
		// ChromeDriver driver=new   ChromeDriver();
		
		//below methods are implemented in ChromeDriver class 
         driver.get("http://www.google.com");//  without http it doesnt work.....its replica of chrome 
        String title= driver.getTitle();
        System.out.println( "page tile is: "+ title);
        
        //Verification/check point...  when we include with verification points called automation testing 
        if(title.equals("Google")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("incoreect  title");
        }
        
      //  System.out.println(driver.getPageSource());
       System.out.println( driver.getCurrentUrl());
        
        driver.quit();
        
        
	}

}
