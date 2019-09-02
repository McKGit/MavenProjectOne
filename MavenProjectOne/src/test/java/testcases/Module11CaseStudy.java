package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//mport org.sikuli.script.Screen;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import framework.EdurekaLoginPage;
import framework.EdurekaMainPage;
import framework.EdurekaMyProfilePage;
import framework.EdurekaStudentMainPage;
import framework.EdurekaStudentPersonalDetailsPage;

/**
 * Module 11 Case Study due 10/7/2018; Submitted 10/7/2018
 * 
 * Create a maven project to upload your photo on edureka portal using maven frameworks.
 * Configure the same with Jenkins to run the test every day.
 * Steps:
 * Create a Maven project and perform the below steps:
 *
 * MY NOTE: I was able create the project as a Maven project that runs on Jenkins.
 * Could not implement step 4: see below and my code. 
 * Maven POM had trouble with my Sikuli dependency and running as testNG: it had trouble with the Jar.
 * I WONDER if it is because I am using Windows 7...I DO have a 64-bit machine and Java 8.
 * 
 * 1.Launch edurekaportal on the browser. - DONE
 * 2.Login with the credentials - DONE
 * 3.Navigate to edit profile page - DONE
 * 4.Edit uploading photo button - TROUBLE HERE INTEGRATING SIKULIX
 * 5.Integrate with jenkins to rerun the testcase daily - DONE
 * 
  * @author Alison McKendree
 * 	@10/7/2018
 *
 */

public class Module11CaseStudy {
	
	private WebDriver driver;	
	
	private String edurekaUrl;
	

	@Test				
	public void uploadPhotoToEdureka() {	

		driver.get(edurekaUrl);  
		
		EdurekaMainPage edurekaMainPage = new EdurekaMainPage(driver);
		
		
//		EdurekaLoginPage edurekaLoginPage = edurekaMainPage.clickLoginLink();
//		
//		edurekaLoginPage.enterEmail("abostongala@gmail.com"); //enter email here
//		
//		edurekaLoginPage.enterPassword("GuidoLearn39"); //enter password here
//
//		EdurekaStudentMainPage edurekaStudentMainPage = edurekaLoginPage.clickLoginButton();

//		edurekaStudentMainPage.clickProfileLink();
//        
//        System.out.println("Clicked on the Profile link.");
//        
//        EdurekaMyProfilePage edurekaMyProfilePage = edurekaStudentMainPage.clickMyProfileLink();
//        
//        System.out.println("Clicked on the My Profile link.");
//        
//        EdurekaStudentPersonalDetailsPage edurekaStudentPersonalDetailsPage = edurekaMyProfilePage.clickEditProfileLink();
//        
//        edurekaStudentPersonalDetailsPage.clickCameraLink();
//        
//        System.out.println("Clicked on the camera link.");
//        
//        //C:\Module11Picture\flower.jpeg
//        
//        String filepath = "C:\\Module11Picture\\";
//
//        String inputFilePath = "C:\\Module11Picture\\";
//        		
//        Screen s = new Screen();
//        
//        Pattern chooseFile = new Pattern(filepath + "chooseFile.PNG");
//        
//        Pattern fileInputTextBox = new Pattern(filepath + "fileInput.PNG");
//        
//        Pattern openButton = new Pattern(filepath + "openButton.PNG");
//        
//        s.click(chooseFile);
//        
//        s.wait(fileInputTextBox, 20);
//        
//        s.type(fileInputTextBox, inputFilePath + "flower.jpg");
//
//        s.click(openButton);
		
	}	

	@BeforeTest
	public void beforeTest() {	
		
		String chromeWebDriverPath = GlobalConstants.chromeWebDriverPath;
		
		String chromeWebDriverSystemProperty = GlobalConstants.chromeWebDriverSystemProperty;
		
		System.setProperty(chromeWebDriverSystemProperty, chromeWebDriverPath);

		driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		
		edurekaUrl = GlobalConstants.getEdurekaURL();
		
	}		
	//@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
