package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
	
	public static WebDriver driver;
	
	public static void openChrome() {
		//Both versions 92.4515
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drives/chromedriver_linux");
		//System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drives\\chromedriver.exe");
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("javascriptEnable");
		options.addArguments("--disable-infobars");
		
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void killDriver() {
		driver.close();
		driver.quit();
	}
	
	//Only for drivers test
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drives/chromedriver_linux");
		//System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drives\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		//options.addArguments("--headless");
		options.addArguments("javascriptEnable");
		options.addArguments("--disable-infobars");
		
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
	}
}