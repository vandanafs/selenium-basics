package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement targetElemnt = driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
	
		//action.dragAndDrop(srcElement, targetElemnt).perform();//just drag and drop recently got added  bcos only one action no need of build 
		
		action  ///this is another way of doing interview 
		.clickAndHold(srcElement)
		.moveToElement(targetElemnt)
		.release()
		.build()  //generate composite actions, collect user actions and perform  
		.perform();

	}

}
