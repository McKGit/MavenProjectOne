package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

public class EdurekaMyProfilePage {

	WebDriver driver;
	
	public EdurekaMyProfilePage(WebDriver driver) {

	this.driver = driver;
	
	}

	public EdurekaStudentPersonalDetailsPage clickEditProfileLink(){
		
		//<a _ngcontent-c7="" class="profile-edit-icon" id="personal_details"><i _ngcontent-c7="" class="icon-pr-edit"></i></a>
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement editProfileLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.editProfileLink_EdurekaMyProfilePage));
		
		editProfileLink.click();
		
		return new EdurekaStudentPersonalDetailsPage(driver);
	}

}
