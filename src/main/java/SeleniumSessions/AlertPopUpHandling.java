package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		//javascript popup, can not inspect ok button or text in the js pop up, these are not web elements, pop up elements. 
		//goto html console in any page, there is alert method 
		//alert("this is vandnana")

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//click on sign in
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		//switch driver to pop up(alert)
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Text msg is correct");
		}else
		{
			System.out.println("incorrect text msg");
		}
		
		//clcik ok button
		alert.accept();//ok button
		//alert.dismiss();//dismiss press escape from KB
	}

}
