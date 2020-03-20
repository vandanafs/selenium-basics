package interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(5000);
		//1.count total no of links
		//2.get the text of each link without space
		//3.get the href url property for each link
		
  List<WebElement> linksList = driver.findElements(By.tagName("a"));//for image give img tagname
		
		int totalLinks = linksList.size();
		System.out.println("No of links of page:"+totalLinks);//1
		
		for(int i=0;i<totalLinks;i++) {
			String text = linksList.get(i).getText();
			
			//only print text linsk
			if(!text.isEmpty()) {
				System.out.println(i+"--->"+text);//2
				System.out.println(linksList.get(i).getAttribute("href"));//image href property not available src
			}
				
		}
	}

}
