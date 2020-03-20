package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {
	//frame also webelement, right click to inspect "view frame souce" then frames are involved
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		//get count of frames 
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println("totla frame :"+frameCount);
		//to switch to that frame method, these are overloaded methods
		//1.using index,frame(index)
		//2.frame id or name
		//3.when id and name not availabe create webelement using xpath
		Thread.sleep(4000);
	
	   //driver.switchTo().frame(2);//1.index, it can be changed any time 
		//driver.switchTo().frame("main");//2.using id or name its better
		WebElement frameElement = driver.findElement(By.name("main"));//3.using xpath
		// xpath: /html/frameset/frameset/frameset/frame[1]
		driver.switchTo().frame(frameElement);
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
       System.out.println(text);	
	
	driver.switchTo().defaultContent();//naviagte back to page
	}

}
