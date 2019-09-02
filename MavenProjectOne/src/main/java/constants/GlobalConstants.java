package constants;

public class GlobalConstants {

	public final static String testDataPathModule9 = "C:\\TestData\\Module9CaseStudyTestData.xlsx";

	public final static String testDataPathModule10 = "C:\\TestData\\Module10CaseStudyTestData.xlsx";

	public final static String dataSheetName = "TestData";

	public final static String resultsSheetName = "TestResults";
	
	public final static String EdurekaURL = "http://www.edureka.co";
	
	public final static String chromeWebDriverSystemProperty = "webdriver.chrome.driver";
	
	public final static String chromeWebDriverPath = "C:\\Automation\\ChromeWebDriver\\chromedriver.exe";

	public static String geckoDriverSystemProperty = "webdriver.gecko.driver";
	
	public static String geckoWebDriverPath = "C:\\GeckoDriver\\geckodriver.exe";
	
	public static String browserType = "chrome";
	
	public final static String getEdurekaURL(){
		
		return EdurekaURL;
	}
	
	public final static String getTestDataPathModule10(){
	
		return testDataPathModule10;
	}
	
	public final static String getTestDataPath(){
		
		return testDataPathModule10;
	}
	
	public final static String getChromeWebDriverSystemProperty(){
		
		return chromeWebDriverSystemProperty;
	}

	public static String getChromeWebDriverPath() {

		return chromeWebDriverPath;
	}
	
	public static String getGeckoWebDriverPath() {

		return geckoWebDriverPath;
	}

	public static String getGeckoDriverSystemProperty(){
		
		return geckoDriverSystemProperty;
	}
	
	public static String getBrowserType(){
		
		return browserType;
	}

	public static String getSheetName() {
		return dataSheetName;
	}

	public static String getDataSheetName() {
		return dataSheetName;
	}

	public static String getTestResultsSheetName() {

		return resultsSheetName;
	}

	
	
}
