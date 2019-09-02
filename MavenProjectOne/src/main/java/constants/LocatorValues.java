package constants;

import org.openqa.selenium.By;

/**
 * Class to store locators in.
 * 
 * @author Alison McKendree
 *
 */
public class LocatorValues {
	
		//BEGIN EDUREKA WEBSITE LOCATORS
		
		//Edureka Main Page
		
		public static By loginLink_EdurekaMainPage = By.linkText("Log In");
		
		//Edureka Log In Page

		public static By enterEmail_LoginPage = By.id("inputName");
		
		public static By enterPassword_LoginPage = By.xpath("//*[@id='pwd1']");
		
		public static By loginButton_LoginPage = By.xpath("//button[@data-gaact='Login Click']");

		//Edureka Student Main Page
		
		//<input type="search" id="homeSearchBar" maxlength="255" name="user_v1[query]" autocomplete="off" placeholder="Type something here... " onkeyup="return submitenter('homeSearchBar', event, 'Search Bar- Banner Search');">
		public static By searchInput_StudentMainPage = By.id("homeSearchBar");
		
		public static By searchIcon_StudentMainPage = By.id("homeSearchBarIcon");
		
		public static By communityLink_StudentMainPage = By.linkText("Community");
		
		public static By blogLink_StudentMainPage = By.linkText("Blog");
		
		public static By browseLink_StudentMainPage = By.linkText("Browse Courses");
		
		//Edureka Main Blogs Page
		
		public static By interviewQuestionsLink_MainBlogsPage = By.linkText("Interview Questions");
		
		//Edureka Main Interview Questions Page

		public static By topSelIntQuest2018_MainInterviewQuestionsPage = By.linkText("Top Selenium Interview Questions And Answers You Must Prepare In 2018");
		
		//Edureka Selected Interview Questions Page
		
		public static By headerText_SelectedInterviewQuestionsPage = By.xpath("//h3[contains(text(), 'Top Selenium Interview Questions And Answers You Must Prepare In 2018')]");
		
		//EdurekaSearchCourseResultsPage
		
		public static By clickCourseLink_EdurekaSearchCourseResultsPage = By.linkText("Advanced Java Certification Training");
		
		//CourseDescriptionPage
		
//		<a href="/orders/enroll/193?clp_version=3&amp;offer_id=" class="enroll-clp-btn-user on_hide_this_show_other" data-courseid="193" data-batchid="">
//	    <button>Enroll Now</button></a>
		
//		/html/body/div[3]/div[12]/div[1]/div/div/section[1]/div/div[2]/div[2]/a/button
		public static By clickEnrollLink_CourseDescriptionPage = By.xpath("/html/body/div[3]/div[12]/div[1]/div/div/section[1]/div/div[2]/div[2]/a/button");
		//https://www.edureka.co/orders/enroll/193?clp_version=3&offer_id=
		//public static By clickEnrollLink_CourseDescriptionPage = By.xpath("//a[@href='https://www.edureka.co/orders/enroll/193?clp_version=3&offer_id=']");
		
		public static By advertisingPopup_CourseDescriptionPage = By.xpath("//*[@id='clp_banner_modal'/div/div/div/p[1]");
		
		public static By closeAdvertisingPopup_CourseDescriptionPage = By.xpath("//*[@id=clp_banner_modal']/div/div/button");
		
		//EdurekaCoursePaymentDetailsPage
		
		//public static By payPalPymtMethod_EdurekaCoursePaymentDetailsPage = By.xpath("//*[@id='paypal-animation-content']/div[1]/div[1]");
		
		public static By payPalPymtMethod_EdurekaCoursePaymentDetailsPage = By.xpath("//*[@id='xcomponent-paypal-button-3847af79c4']");
		
		//*[@id="paypal-animation-content"]/div[1]/div[1]/img[2]
		
		//Student Main Page
		
		//<a href="https://learning.edureka.co/my-profile">My Profile</a>
		
		public static By myProfileLink_EdurekaStudentMainPage = By.linkText("My Profile");

		//<a _ngcontent-c7="" class="profile-edit-icon" id="personal_details"><i _ngcontent-c7="" class="icon-pr-edit"></i></a>

		public static By editProfileLink_EdurekaMyProfilePage = By.id("personal_details");
		
		//Edureka Student Personal Details page.
		
		public static By cameraLink_EdurekaStudentPersonalDetailsPage = By.xpath("//div[@class='profile-photo-section']/a");
//		<div class="profile-photo-section">
//        	<span class="div-title">Profile Photo</span>
//        <	img alt="Profile" class="img-circle img-responsive" src="assets/img/profile.png">
//     <a>
           // <i class="icon-camera"></i>
//        </a>
//</div>
		
		//END EDUREKA WEBSITE LOCATORS
		
		//PAY PAL LOCATORS
		
		//PayPayPage'
		
		public static By emailInput_PayPalPage = By.id("email");

		public static By passwordInput_PayPalPage = By.id("password");

		public static By loginButton_PayPalPage = By.id("btnLogin");
		
		//OTHER WEBSITE LOCATORS
		public static String membershiplink_LandingPage = "xpath://*[@id=\"ctl00_topMegaMenu_deskTopMenu\"]/div/ul/li[1]/a";
		public static String individualLink_LandingPage = "linktext:Individual";
		public static String cartValue_MembershipPage = "id:totalPrice";
		public static String joinnowbutton_MembershipPage = "name:ctl00$Body$btnJoinNow";
		public static String totalPriceshoppingcart_ShoppingcartPage = "xpath://*[@id=\"ctl00_body_lblSummary_Total\"]";
		public static String createanaccount_ShoppingcartPage = "linktext:Create an Account";
		public static String enterfirstname_AddressbookPage = "name:ctl00$Body$tbxNPFirstName";

}
