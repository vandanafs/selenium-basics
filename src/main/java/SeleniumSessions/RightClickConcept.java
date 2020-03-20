package SeleniumSessions;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//right click button, ie application specific button   with some options where edit, delete, copy and paste 

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClickMeButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//span[text()='right click me']
		
		
	     Actions action=new Actions(driver);
	     
          action.contextClick(rightClickMeButton).perform();
	   List<WebElement> rightClcikOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
		
	  for (int i=0; i<rightClcikOptions.size();i++) {
		  String text = rightClcikOptions.get(i).getText();
		   System.out.println(text);
		  if(text.equals("Copy")) {
			  Thread.sleep(5000);
			  rightClcikOptions.get(i).click();
			  break;
		  }
	  }

	}

}
