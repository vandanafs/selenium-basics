package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {//menu move mouse then we see menu optiins

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
	
	Thread.sleep(5000);
     WebElement contentElement = driver.findElement(By.className("menulink"));
	//WebElement contentElement = driver.findElement(By.xpath("//a[@class='menulink']"));
//	WebElement contentElement=driver.findElement(By.linkText("Content  "));
	
     doMoveToElement(driver, contentElement);
   //driver.findElement(By.linkText("COURSES")).click();//actual text in html dom  "Courses" but preference given to text visible on UI its COURSES
	driver.findElement(By.xpath("//a[@href='http://mrbool.com/course']")).click();
	
	}

	
	public static void doMoveToElement(WebDriver driver, WebElement element) throws InterruptedException {
		Actions action=new Actions(driver);
		   action.moveToElement(element).build().perform();
		   Thread.sleep(3000);
	}
	
	
}
