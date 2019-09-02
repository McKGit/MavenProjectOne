package framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class EdurekaStudentPersonalDetailsPage {
	
	WebDriver driver;

	
	public EdurekaStudentPersonalDetailsPage(WebDriver driver) {
	
		this.driver = driver;
		
	}


	public void clickCameraLink() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement cameraLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.cameraLink_EdurekaStudentPersonalDetailsPage));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", cameraLink);
		
		//cameraLink.click();
		
	}

}
