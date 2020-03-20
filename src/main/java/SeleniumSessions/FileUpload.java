package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");
		
		//if you use click we will struct then sendkeys used here  exceptional case
	//work only type =file 99 case it will be file , if not ask UI Dev ask to change type=file
		driver.findElement(By.name("upfile")).sendKeys("D:\\upload test\\abc.txt");
		
		
	}

}
