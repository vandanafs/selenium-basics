package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		WebElement loginLink = driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"));
		WebElement travelAgentLogin = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[15]/ul/li[3]/a"));
		
		doMoveToElement(driver, loginLink);
		// travelAgentLogin.click();
		doClick(travelAgentLogin);

		driver.navigate().back();

		WebDriverWait wait1 = new WebDriverWait(driver, 15);// without WebDriverWait 2nd LOGIN/SIGNUP mouseMove not
															// working
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='ctl00_HyperLinkLogin']")));
		
		WebElement spiceClubMembersMenu = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		WebElement memberLogin = driver.findElement(By.xpath("//li[@class='hide-mobile']//a[text()='Member Login']"));
		
		doMoveToElement(driver, element1);
		doMoveToElement(driver, spiceClubMembersMenu);
		Thread.sleep(3000);
		doMoveToElement(driver, memberLogin);
		doClick(memberLogin);
		//memberLogin.click();
		

	}

	public static void doMoveToElement(WebDriver driver, WebElement element) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);
	}

	public static void doClick(WebElement element) {
		element.click();
	}
}
