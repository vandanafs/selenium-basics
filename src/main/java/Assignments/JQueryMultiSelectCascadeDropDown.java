package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryMultiSelectCascadeDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.id("justAnInputBox1")).click();

		// selectCascadeDropDropValues(driver,"choice 4", "choice 2 3","choice 6 2 2");
       //selectCascadeDropDropValues(driver, "choice 6 2 3");
		 selectCascadeDropDropValues(driver, "all");
	}

	public static void selectCascadeDropDropValues(WebDriver driver, String... value) {

		//List<WebElement> cascadeChoiceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		List<WebElement> cascadeChoiceList = driver.findElements(By.cssSelector("li.ComboTreeItemChlid"));
		
		
		System.out.println(cascadeChoiceList.size());

		for (int i = 0; i < cascadeChoiceList.size(); i++) {
			String text = cascadeChoiceList.get(i).getText();
				System.out.println(text);
				
				for(int k=0;k<value.length;k++) { ///...values cheching
					if(value[k].equalsIgnoreCase("all")) {
						if(text.length()>0)
						{
						cascadeChoiceList.get(i).click();
						}
						}
					else {  
						if(text.equals(value[k])) {
							if(text.length()>0) {
							cascadeChoiceList.get(i).click();
								break;
							}
					}
				}  
				   
		   }	
				
	
		
	}	
		
}
}
