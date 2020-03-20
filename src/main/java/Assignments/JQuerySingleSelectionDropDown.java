package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuerySingleSelectionDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
    driver.findElement(By.id("justAnotherInputBox")).click();
    // selectSingleDropDownValue(driver, "choice 2","choice 4","choice 6 2");//only 1st option getting selected
  //  selectSingleDropDownValue(driver, "choice 1","choice 2");//only 1st option getting selected
     selectSingleDropDownValue(driver, "choice 6 2");
  }
  public static void selectSingleDropDownValue(WebDriver driver, String... value) throws InterruptedException {
		    List<WebElement> chioceList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		          
		    
		   System.out.println(chioceList.size());
		   System.out.println(value.length);
		   
		   for(int i=0; i<chioceList.size();i++) {
			   String text = chioceList.get(i).getText();
			   System.out.println(text);
			//   System.out.println(i);
//			   
			   try {
			      for (int k=0;k<value.length;k++) {//... array
			    	     if(text.equals(value[k])) {
			    	    	 System.out.println(text);
			    	    	 Thread.sleep(3000);
			    	    		
			    	    	chioceList.get(i).click();
			    	     break;
			      }
			      }	   
			   }
			   catch (Exception e) {
				}
			   
		   }
		   
		   
		   
		   
		   
		   
	   }
}
	
	
	
	
	
	
	
	

