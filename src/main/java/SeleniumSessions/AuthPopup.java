package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {

	public static void main(String[] args) {
		//ask username and password 
		//example router and modem config we have to provide admin admin as UN and PW

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String username="admin";
		String password="admin";
		//after //UN:PW@  --->http://www.google.com
		//driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	   
		driver.get("http://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
