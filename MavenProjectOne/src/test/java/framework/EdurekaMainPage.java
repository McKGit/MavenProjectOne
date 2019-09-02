package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;


/**
 * Edureka Main page.
 * 
 * @author Alison McKendree
 * @date 10/6/2018
 *
 */
public class EdurekaMainPage {
	
	WebDriver driver;
	
	public EdurekaMainPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isEdurekaMainPage()){
			
			
			
		}
		
	}

	/*
	 * 
	 * Is the Edureka Main page displayed?
	 */
	private boolean isEdurekaMainPage() {
		
		String expectedText = "Don’t just learn it, Master it!";
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		try{
			webDriverWait.until(ExpectedConditions.textToBe(By.tagName("h1"), expectedText));
			
		}catch(Exception e){
			
			return false;
		}
			return true;
	}
	
	/**
	 * Click the Log In link on the Edureka main page.
	 * @return 
	 * 
	 */
	public EdurekaLoginPage clickLoginLink(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement loginLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.loginLink_EdurekaMainPage));
		
		loginLink.click();
		
		return new EdurekaLoginPage(driver);
	}
}
