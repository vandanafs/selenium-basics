package SeleniumSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		driver.get("http://www.facebook.com");
       
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		jsUtil.flash(day);
		
		//select class object only works when there is "select tag" in html doc
		Select select1 = new Select(day);
		System.out.println(select1.isMultiple());// multiple or not , Fb is false
		
		System.out.println(getAllOptionsListDropDown(day));
		System.out.println(getAllOptionsListDropDown(month));
		System.out.println(getAllOptionsListDropDown(year));
		
//		Select select1 = new Select(day);
//		select1.selectByIndex(17);//using index
//		Thread.sleep(3000);
//		select1.selectByVisibleText("27");
		
//		Select select2=new Select(month );//if ur using for country then next few countires got added up then it will not work.index gets change 
//		select2.selectByValue("3");
//		Thread.sleep(3000);
//		select2.selectByVisibleText("Nov");
//		Thread.sleep(3000);
//		select2.selectByValue("7");
		
//		Select select3 = new Select(year);
//		select3.selectByIndex(2);//using index
//		Thread.sleep(3000);
//		select3.selectByVisibleText("1986");
//		
		//For every drop down we re creating new select hence create generic class
//		selectDropDownValueByText(day, "11");
//		selectDropDownValueByText(month, "Mar");
//		selectDropDownValueByText(year, "2018");
//		
//		selectDropDownValueByindex(day, 12);
//		selectDropDownValueByindex(month, 12);
//		selectDropDownValueByindex(year, 2018);
		
	}

	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	
	}
	
	public static void selectDropDownValueByindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
		
		//to print all the options on dropdown
		public static ArrayList<String> getAllOptionsListDropDown(WebElement element) {
			Select select1=new Select(element);
			ArrayList<String>	ar=new ArrayList<String>();
			List<WebElement> optionList = select1.getOptions();//list of web elements
			System.out.println("total List options:"+ optionList.size());
			for(int i=0; i< optionList.size();i++) {
				String optionVal = optionList.get(i).getText();
				ar.add(optionVal);
			}
			  return ar;//this is print array form 
		
		
		
		
	}
	
}
