package SeleniumSessions;

public class CustomXPath2 {

	public static void main(String[] args) {

		// to capture heading, span and text of label and link
		// https://www.freshworks.com/
		// //h1[text()='A fresh approach to customer engagement']

		// //div[text()='GET STARTED'] ----> link ---> text on page

		// //a[text()='Sign Up'] ....> link on CRM PRO

		/// contains() is function in hubSPot
		// //input[contains(@id,'username')] ---> input tag contains id=username
		// //i18n-string[contains(text(),'Sign up')] ---> sign up link
		// //button[contains(@id,'loginBtn')] ---> button contains id=loginBtn
		// //button[contains(@type,'submit')] ---> button contains type=submit
		// //button[contains(@type,'submit') and (@id='loginBtn')] ---> combining 2 properties  
		// //button[contains(@type,'submit') and contains (@id,'loginBtn')]   ---> combining 2 properties with contains 
		

		// <input "id=username_123"/>
		// <input "id=username_1234"/>
		// <input "id=username_12355656"/> // everytime id getting changed

		// //input[contains(@id='username_')] ///bcos id =username_ is constant in all ID
		// //input[starts-with(@id,'username_')] -----> username_ 
		//  //*[contains(@type,'submit') and (@id='loginBtn')]   --> any html tag contains type=submit but not good practice
		//
		// 
		
	       //dynamic text 
		//  //i18n-string[text()='[a-z A-Z 0-9]']
		
		//starts with
		// //input[starts-with(@id,'username')]  or //input[starts-with(@id,'user')]
		//  
     
		
		 //Xpath axes
		// //div[@class='input-group']/input  ---> CRMPRO / direct child  2 enties
		// //div[@class='input-group']//input  ----> direct and indirect child  3 entires
		//  //div[@class='input-group']//following::input[@type='text']  ----> userName field  same xpath
		// //div[@class='input-group']//following::input[1] ----> username field  same 
		// (//div[@class='input-group']//following::input)[1]  ----> username  filed same 
		
		
		
		//  /following:: OR //following::( after ) used direct or indirect sibling ,,,freshWorks.com
		// //ul[@class='l-nav-list nav-main-menu']//following::li[contains(@class,'nav-main-item')] ----> 8 li OR
		//  //ul[@class='l-nav-list nav-main-menu']/li   --> both are same 8 li 
		
		// //preceding:: used for parents and grandparents( before  or backward  )
		// //input[@id='username']//preceding::div ---> hubspot 
		
		////div[@class='input-group']//ancestor::div[@class='container'] -->CRMPRO
		
		////span[text()='John M']//ancestor::td//preceding-sibling::td//input[@type='checkbox'] ---> hubspot 
		//table checkbox selection ->  span ancestor is td , we need travese back to asnother td hence predecing-sibling::td..in that we want input tag
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
