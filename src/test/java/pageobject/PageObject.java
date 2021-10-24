package pageobject;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import factory.WebDriverFactory;

//Parent Class from all PageObjects.
//Used to instantiate utils methods, create connections, etc
public class PageObject {

	public WebDriver driver;

	public PageObject() {
		this.driver = WebDriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public boolean verifyExistence(WebElement element) {
		boolean respose = false;
		try {
			if (element.isDisplayed()) {
				respose = true;
			} else {
				respose = false;
			}
		} catch (NoSuchElementException el) {
			respose = false;
		}
		return respose;
	}
}
