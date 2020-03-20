package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryMultiSelectDropDownComplex {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
         Thread.sleep(5000);
		driver.findElement(By.id("justAnInputBox")).click();
		//ElementNotInteractableException bcpos xpath we have used 45 webELement 
		   
	//selectMultiDropDropValues(driver, "choice 2","choice 2 2","choice 6 1","choice 6 2 2");
		
		//selectMultiDropDropValues(driver, "choice 6 1");

	selectMultiDropDropValues(driver, "all");
	
	}

	/**
	 * this methos used to select the drop down values
	 * 1.select single "choce1"
	 * 2.select multi values "choice 1","choice 2", "Chioce 6"
	 * 3.select all values "all", "All","ALL"
	 * @param driver
	 * @param value
	 */
	public static void selectMultiDropDropValues(WebDriver driver, String... value) { //to pass diff choice ..., it behaves like array hence for loop 
		List<WebElement> dropDownListAllOptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		//cssselector span.comboTreeItemTitle
		//bcos xpath having 45 entires, actual only 15 r present ,ElementNotInteractableException for all condition exe, to handle this add try catch 
		
		
		int j=0;
		if(!value[j].equalsIgnoreCase("all")) {
		
			System.out.println(dropDownListAllOptions.size());
		for (int i = 0; i < dropDownListAllOptions.size(); i++) {
			String text = dropDownListAllOptions.get(i).getText();
				System.out.println(text);
				
				for(int k=0;k<value.length;k++) {
					
						
						if(text.equals(value[k])) {
							   
							   dropDownListAllOptions.get(i).click();
								break;
					
						}
				}  
				   
		   }	
		}		
	     
		else {
			 try {
			for(int all=0; all<dropDownListAllOptions.size();all++) {
			
				String text = dropDownListAllOptions.get(all).getText();
				System.out.println(text);
				dropDownListAllOptions.get(all).click();
				 
			}
		} catch (Exception e) {
		}
	}	
	}
}