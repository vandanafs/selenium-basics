package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryMultiSelectDropDownAllOther {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
         Thread.sleep(5000);
		driver.findElement(By.id("justAnInputBox")).click();
		//List<WebElement> dropDownListAllOptions = driver.findElements(By.xpath("//li//input[@type='checkbox']"));//v xpath not fetching text
	
		
	//selectMultiDropDropValues(driver, "choice 2","choice 4","choice 6 1");
		 
		//selectMultiDropDropValues(driver, "choice 6 1");

	selectMultiDropDropValues(driver,"choice2", "all");
	
	}

	
	public static void selectMultiDropDropValues(WebDriver driver, String... value) { //to pass diff choice ..., it behaves like array hence for loop 
		List<WebElement> dropDownListAllOptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
	
		
		for (int i = 0; i < dropDownListAllOptions.size(); i++) {
			String text = dropDownListAllOptions.get(i).getText();
				System.out.println(text);
				
				for(int k=0;k<value.length;k++) { ///...values cheching
					if(value[k].equalsIgnoreCase("all")) {
						try {
						dropDownListAllOptions.get(i).click();
					       } catch (Exception e) {
					    	   
					       }   
					} 	   
					    	   
					else {  
						if(text.equals(value[k])) {
							   
							   dropDownListAllOptions.get(i).click();
								break;
					}
				}  
				   
		   }	
				
	
		
	}	
	}
}
