package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		List<WebElement> optionListDay = driver.findElements(By.xpath("//select[@id='day']/option"));
		List<WebElement> optionListMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		List<WebElement> optionListYear = driver.findElements(By.xpath("//select[@id='year']/option"));

	//	getAllDropDownOptions(optionListDay);
//		 getAllDropDownOptions(optionListMonth);
//		 getAllDropDownOptions(optionListYear);

		// without calling 3 times can call once with 3 ... only work with single
		// webELement interaction not multiple webElement interaction
		Thread.sleep(5000);
		selectAllDropDownOptions(optionListDay, "21"); 
//		selectAllDropDownOptions(optionListMonth, "Apr");
//		selectAllDropDownOptions(optionListYear, "2014");

		//selectAllDropDownOptions(optionListDay, "10","14","16","18");
		
	}

	public static ArrayList<String> getAllDropDownOptions(List<WebElement> optionList) {
		int totalOptions = optionList.size();
		ArrayList<String>	ar=new ArrayList<String>();
		System.out.println("total options :" + totalOptions);
		for (int i = 0; i < totalOptions; i++) {
			String optionVal = optionList.get(i).getText();
		//	System.out.println(optionVal);//working display all values 
			ar.add(optionVal);
			
		}
           return ar;//returning empty list 
	}

	public static void selectAllDropDownOptions(List<WebElement> optionList, String... dob) {

		for (int i = 0; i < optionList.size(); i++) {
			    String optionText = optionList.get(i).getText();
			    System.out.println(optionText);
				for(int k=0;k<dob.length;k++) {
					if (optionText.equals(dob))
				optionList.get(i).click();
			}
		}

	}

}
