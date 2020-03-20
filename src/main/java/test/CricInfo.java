package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfo {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/series/19282/scorecard/1185318/south-africa-vs-australia-3rd-t20i-australia-in-sa-2019-20");
		driver.manage().window().maximize();
		
		getScoreList(driver, "DA Warner");
		wicketTaker(driver," DA Warner");
		getScoreList(driver, "MS Wade");
	}

	
	   public static void getScoreList(WebDriver driver,String player) {
		   
		   System.out.println(player +  "\t");
		   List<WebElement> scoreList = driver.findElements(By.xpath("//a[text()='"+player+"']//parent::div//following-sibling::div[@class='cell runs']"));
			
			
	         
			 for (int i=0; i< scoreList.size(); i++) {
				System.out.println( scoreList.get(i).getText());
				 
			 } 
			  }
	   
	   
	   public static String wicketTaker(WebDriver driver, String playerName) {
		   
		String text = driver.findElement(By.xpath("//a[text()='"+playerName+"']//parent::div//following-sibling::div[@class='cell commentary']/a")).getText();
		System.out.println("Wicket taker :"+text);
		return text;
	   }
}
