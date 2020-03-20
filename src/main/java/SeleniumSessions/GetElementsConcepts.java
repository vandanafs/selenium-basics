package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetElementsConcepts {
    static JavaScriptUtil jsUtil;
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		 jsUtil=new JavaScriptUtil(driver);
		
		Thread.sleep(5000);

	//1.driver.findElement(By.id("username")).sendKeys("vandana.f.09@gmail.com");
	//2.	WebElement email = driver.findElement(By.id("username"));
	//	email.sendKeys("vandj.f.09@gmail.com");
		
		
		//by locators: id is static method in By class,Id method returning By refernce
		//locators can be managed for each page (home page, login) and changes are there goto locators and update 
		//easy mainataince for framework
		By email = By.id("username");
		By password = By.id("password");
		By loginbtn = By.id("loginBtn");
	    By signuplink=By.linkText("Sign up666");

	    //3.approach webElement
	    //driver.findElement(email).sendKeys("bvtyf@gmail.com");
	  //  driver.findElement(password).sendKeys("tffwww");
     //   driver.findElement(loginbtn).click();
     //   driver.findElement(signuplink).isDisplayed();
	 
	    //4.quite generic, we can these methods for any web applications
	    //advatage
	    //1.code looks clean and neat reuseable, best geeneric methods
	    //2.error handling (exception )
	    //3.documenting 
	    getElement(driver, email).sendKeys("fghggh");
	    doSendkeys(driver, password, "test@errt");
        doClick(driver, loginbtn);
        
      if(  doIsDisplayed(driver, signuplink)) {
       String text = doGetText(driver, signuplink);
        System.out.println(text);
      }
      else {
    	  	System.out.println(signuplink +"is not displayed :");
      }
        
	}
	
	
        //4.approach is creating generic method for each action 
/**
 * this method is used to create webelement on the basis of locators
 * @param driver
 * @param locator
 * @return
 */
	  
        public static WebElement getElement(WebDriver driver,By locator) {
        	//when ever get we have find element, we might exception 
        	WebElement element=null;
        	try {
               element = driver.findElement(locator);
               jsUtil.flash(element);
        	}
        	catch (Exception e) {
        		System.out.println("WebElement could not be created  :"+locator);
        	}
               return element;
        }
        
        /**
         * this method used to create sendKeys 
         * @param driver
         * @param locator
         * @param value
         */
      
        public static void doSendkeys(WebDriver driver,By locator,String value) {
        	getElement(driver, locator).sendKeys(value);
        }
	
     /**
      * this method used for clicking on the element
      * @param driver
      * @param locator
      */
        public static void doClick(WebDriver driver, By locator) {
        	getElement(driver, locator).click();
        }
        
        /**
         *this method used for getting text
         * @param driver
         * @param locator
         * @return
         */
        public static String doGetText(WebDriver driver,By locator) {
        	return getElement(driver,locator).getText();
        }
        
        /**
         * this method used for checking for element displayed
         * @param driver
         * @param locator
         * @return
         */
        public static boolean doIsDisplayed(WebDriver driver, By locator) {
        	return getElement(driver, locator).isDisplayed();
        }
        
}
