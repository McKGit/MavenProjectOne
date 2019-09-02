package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.LocatorValues;

/** 
 * The Edureka Student Main page class.
 * 
 * @author Alison McKendree
 * @date 10/6/2018
 *
 */
public class EdurekaStudentMainPage {
	
	WebDriver driver;
	
	public EdurekaStudentMainPage(WebDriver driver){
		
		this.driver = driver;
		
		if(!isStudentMainPage()){
			
			throw new IllegalStateException("The Edureka Student Main Page is not displayed.");
		}
	}

	/**
	 * Is the Edureka Student Main page displayed?
	 * @return
	 */
	private boolean isStudentMainPage() {

		return true;
	}

	/**
	 * Click the Community link on the Edureka Student Main page.
	 */
	public void clickCommunityLink() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement communityLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.communityLink_StudentMainPage));
		
		communityLink.click();
	}
	
	/**
	 * Click the Blog link on the Edureka Student Main page.
	 * @return 
	 */
//	public EdurekaMainBlogsPage clickBlogLink() {
//
//		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
//		
//		WebElement blogLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.blogLink_StudentMainPage));
//		
//		blogLink.click();
//
//		for (String winHandle : driver.getWindowHandles()) { 
//
//			System.out.println(winHandle);
//
//		    driver.switchTo().window(winHandle);                     
//
//		}
//		return new EdurekaMainBlogsPage(driver);
//	}

	/**
	 * Enter search criterion into search input on Student Main page.
	 * @param searchTerm 
	 * @return 
	 */
//	public EdurekaSearchCourseResultsPage enterSearchTerm(String searchTerm) {
//		
//		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
//		
//		WebElement searchInput = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.searchInput_StudentMainPage));
//		
//		searchInput.sendKeys(searchTerm);
//		
//		searchInput.sendKeys(Keys.ENTER);
//		
//		return new EdurekaSearchCourseResultsPage(driver);
//	}

	/**
	 * Click the search icon on the Student Main page.
	 * @return 
	 */
//	public EdurekaSearchCourseResultsPage clickSearchIcon() {
//
//		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
//		
//		WebElement searchIcon = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.searchIcon_StudentMainPage));
//		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(searchIcon).click().build().perform();
//		
//		return new EdurekaSearchCourseResultsPage(driver);
//		
//	}

	/**
	 * Click Browse link on the Student Main page.
	 */
	public void clickBrowseLink() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement browseLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.browseLink_StudentMainPage ));
		
		browseLink.click();
	}

	public void clickProfileLink() {

		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement profile = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Alison")));
		
		profile.click();
		
	}

	public EdurekaMyProfilePage clickMyProfileLink() {
		
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		
		WebElement myProfileLink = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(LocatorValues.myProfileLink_EdurekaStudentMainPage));

		myProfileLink.click();
		
		return new EdurekaMyProfilePage(driver);
	}
}
