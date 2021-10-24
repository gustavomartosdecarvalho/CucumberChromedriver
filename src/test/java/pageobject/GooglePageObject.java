package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePageObject extends PageObject {
	
	@FindBy(name = "q")
	private WebElement txtResearch;
	
	@FindBy(xpath = "btn")
	private WebElement btnResearch;
	
	public void search(String researchString) {
		txtResearch.sendKeys(researchString);
		txtResearch.click();
	}

	public String verifyTitle() {
		return driver.getTitle();
		
	}
}