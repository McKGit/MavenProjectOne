package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constants.GlobalConstants;
import framework.EdurekaLoginPage;
import framework.EdurekaMainPage;

public class Module12CaseStudy {
	
	private WebDriver driver;	
	
	private String edurekaUrl;
	
	@Test				
	public void testLoginEdureka() {
		
		driver.get(edurekaUrl); 

		EdurekaMainPage edurekaMainPage = new EdurekaMainPage(driver);
		
		EdurekaLoginPage edurekaLoginPage = edurekaMainPage.clickLoginLink();
	
		edurekaLoginPage.enterEmail("abostongala@gmail.com"); 
		
		edurekaLoginPage.enterPassword("WrongPassword"); 
		
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