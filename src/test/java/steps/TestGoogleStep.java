package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobject.GooglePageObject;

public class TestGoogleStep {

	GooglePageObject gpo = new GooglePageObject();
	
	@Given("I open the browser and navigate to {string}")
	public void i_open_the_browser_and_navigate_to_google(String url) {
		gpo.openUrl(url);
	}

	@Then("I validate the title")
	public void i_validate_the_title() {
		System.out.println("resp::"+ gpo.verifyTitle());
		assertEquals("Google", gpo.verifyTitle());
	}
}
