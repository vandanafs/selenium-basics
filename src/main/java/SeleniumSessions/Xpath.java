package SeleniumSessions;

import org.openqa.selenium.By;

public class Xpath {

	public static void main(String[] args) {
	
	//xpath--address of webELement
		
	//	1.absolute xpath
		//html/body/div[1]/div[5]/div[2]/ul/li	
	//	any chnages in DOm then it doesnt work
	//	2.relative xpath (direct )
		// indirect and direct child , / direct child 
		
		//a[@id='test']
		//ul//li//a[@id='test']
		
		//hubSpot  ...email id field
		//input[@id='username']
		//input[@id='username' and @type]  --->valid using and operator
		//input[@id='username' and @type='email']--->1
		//input[@id and  @type='email'] ---> 1 input having property id and type 
		//input[@id and  @type='email']---->3 elements 
		
		 //input[@class='form-control private-form__control login-email']
		//div//button...3
		
		By username=By.className("form-control private-form__control login-email");//this will not work cascaded class name, unique class name 
		By username1=By.cssSelector(".form-control.private-form__control.login-email");
		
		//indexing...when 3 entires  avaoilaable 
		//1.(//input[@type])[3]
		//2.(//input[@type])[position()=2]
		//3.(//input[@type])[last()]  --->for last position
		
		//sign up, links will have text, using text 
		
		 //i18n-string[text()='Sign up']....>text() is function
		
		
		//CRMPro
		//input[@type='submit' and @value='Login'].---> logon nutton
		
		//https://www.freshworks.com/
		//ul[@class='l-nav-list nav-main-menu']/li------>8
		//ul[@class='l-nav-list nav-main-menu']//li---->38 direct and indirect child 
		
		
		//hubSpot 
		//Reverse traversing (child to parent/.. ) OR //parent::
		//input[@id='username']/../../../..
		// //a[text()='da ca']//parent::td//preceding-sibling::td/input  ---> //parent::td   incrmpro webtable 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
