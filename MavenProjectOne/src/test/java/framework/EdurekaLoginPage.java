package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class EdurekaLoginPage {
	
	WebDriver driver;
	
	/**
	 * Constructor for EdurekaLoginPage.
	 * 
	 * @param driver
	 */
	public EdurekaLoginPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isEdurekaLoginPage()){
			
			throw new IllegalStateException("The Edureka Log In page is not displayed.");
		}
	}

	/**
	 * Is the Edureka Login page displayed?
	 * @return
	 */
	public boolean isEdurekaLoginPage(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);

		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='myModal']")));

		return true;
	}
	
	/**
	 * Enter email address on the Edureka log in page.
	 * 
	 * @param emailAddress
	 */
	public void enterEmail(String emailAddress) {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement emailInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.enterEmail_LoginPage));

		emailInput.clear();
		
		emailInput.sendKeys(emailAddress);
	}
	
	/**
	 * Enter password on the Edureka log in page.
	 * 
	 * @param password
	 */
	public void enterPassword(String password){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement passwordInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.enterPassword_LoginPage));
		
		passwordInput.clear();
		
		passwordInput.sendKeys(password);
	}
	
	/**
	 * Click the Login button on the Edureka log in page.
	 * 
	 * @return
	 */
	public EdurekaStudentMainPage clickLoginButton(){
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement loginButton = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.loginButton_LoginPage));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(loginButton).click().build().perform();
		
		webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='ajax-loader']")));
		
		return new EdurekaStudentMainPage(driver);
	}

}
