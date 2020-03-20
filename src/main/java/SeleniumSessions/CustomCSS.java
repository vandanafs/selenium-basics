package SeleniumSessions;

public class CustomCSS {

	public static void main(String[] args) {
		// CSS is better and faster than XPath
		// why Css faster than Xpath?
		// Xpath(extended html path, xml path) is address of element inside DOM 
		//css will hit direct thsat element 
		//  differnce bet XPATH and CSS
		  // 1. script CSS 100 locators and xpath with 100 Locators we see 10 to 15 min diffence late execution in XPath script
		//2. xpaht is nit supported in that CSS in first prefernce, but complex web Table Css can not solve following sibling,  precedding sibling, ancestor hence Xpath also imp 
		//3.depends on Application we choose to use CSS or Xpath 
		//4. Reallly complex DOM then XPath 
		
		//  //h1[text()='A fresh approach to customer engagement'] --> there  are no property like class or iD in that case Xpath, freshWOrks.com
		
		//HUBSPOT examples 
		//1. id -->#value of ID
		//2.class---->.class
		
		//   #username
		//   .form-control.private-form__control.login-email (remove space and add . with full class name )
		//   input.form-control.private-form__control.login-email  (tagName with full class name )
		//   .login-email (unique class name also works)
		//   input.login-email  (combination tagname and unique classname)
		
		//  # and . together (unique classname)
		//   #username.login-email
		//  input#username.login-email   (i have one input tag with username ID and login-email class)
		//  input.login-email#username
		//
		
		//how to write CSS with property when there is NO ID and Class
		
		//htmltag[prop='value']
		//   input[id='username']   ----> CSS
		// //input[@id='username'] ----> XPath
		//  input[id='username'][type='email']  ---> 2 property in 2 diff [] 
		
		//How to use contains text  in CSS * 
		//  input[id*='user']---> ID =username, ID contains user in it.
		//  input[id*='name']  
		
		//Starting text ^ carrot symbol
		//  input[id^='user']----> ID  starting with user 
		
		//Ending Text 
		// input[id$='name']
		
		// Parent and child combination with space/>
		// div.private-form__input-wrapper input#username
		// div.private-form__input-wrapper > input#username
		
		// freshworks.com
		//  ul.l-nav-list.nav-main-menu > li.nav-main-item  ---> 8 lis 
		//  ul.l-nav-list.nav-main-menu > li.nav-main-item > span  ---> 6 items
		// ul.l-nav-list.nav-main-menu li.nav-main-item span ---> 94 spans
		//ul.l-nav-list.nav-main-menu li.nav-main-item >span   -----> it gives direct spans associted with li 
		
		
		//comma , csss  hubSPOT
		//div.private-form__input-wrapper, input#username  ---> it displas combiation of both  results which are either div of that class or input id=username 
		// input#username,input#password ---> 2 collectios for password and username 
		
		///first-of-type, not used much  -->point to first elemnt of list , ex:freshworks.com
		// div.footer-nav.copyrights-nav.hide-in-mobile a -----> 6 entires
        // div.footer-nav.copyrights-nav.hide-in-mobile a:first-of-type  ---> first entry
		// div.footer-nav.copyrights-nav.hide-in-mobile a:last-of-type ---> last entry 
		
		// ul li:first-of-type  ---> A/B TEsting link:http://the-internet.herokuapp.com/
		// ul li:last-of-type ----> WYSIWYG Editor 
		
		//nth of type 
		// ul li:nth-of-type(n) ---> all the elements under li ex 44 elements 
		//  ul li:nth-of-type(4)   ---> 4th element Broken Images
		
		
		//Sibling of element In CSS  hubSOt
		//  div.private-form__input-wrapper +div  ---> following siblig just below  
		// ul li:nth-of-type(3)+li    -->  initially pointing 3rd li, with +li it points to  4th li --->http://the-internet.herokuapp.com/
		
	// ul li:nth-of-type(3)+li a ----> child of 4th li is a
		
		
		//Not operator in CSS , not used much least   hubspot 
		// input.form-control.private-form__control:not(.login-password)  ---> exclude password  using classname
		// input.form-control.private-form__control:not(#password)    -----> exclude password using id=password 
		
		
		
		
		
		
		
	}

}
