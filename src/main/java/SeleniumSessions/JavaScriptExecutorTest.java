package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		// driver.get("https://app.hubspot.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		;

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.checkPageIsReady();
		// jsUtil.generateAlert("This is vandna");

		// WebElement loginBtn =
		// driver.findElement(By.xpath("//input[@type='submit']"));
		// jsUtil.clickElementByJS(loginBtn);//button or links anythging

		// jsUtil.drawBorder(loginBtn); // useful sending screen shot developers

		// jsUtil.refreshBrowserByJS();

		// System.out.println(jsUtil.getBrowserInfo());//how many browers have installed
		// on my laptop
		// System.out.println(jsUtil.getPageInnerText());//manual tester time taking ,
		// so quick with automation content testoing

		// if(jsUtil.getPageInnerText().contains("Companies & Contacts"))
		// System.out.println(true);

		// if(jsUtil.getPageInnerText().contains("Backup & Security"))
		// System.out.println(true);

		// System.out.println(jsUtil.getTitleByJS());//this internally calls
		// driver.getTitle();

		// jsUtil.sendKeysUsingJSWithId("username", "vandnaf");

		// jsUtil.scrollPageDown();

		//WebElement forgotPwd = driver.findElement(By.linkText("Forgot Password?"));// lets say i want to click on forgot
																					// Pwd link but not visible on
																					// current view hence keep scrolling
																					// until you see that elemnt
		//jsUtil.scrollIntoView(forgotPwd);// for particular element stop there and click

		//jsUtil.flash( forgotPwd);
	 
		
		
		
		
		
		
		
		
		
		
		
	}

}
