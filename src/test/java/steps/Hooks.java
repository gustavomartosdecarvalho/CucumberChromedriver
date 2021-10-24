package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.WebDriverFactory;

public class Hooks {

	@Before
	public void setUpTest() {
		WebDriverFactory.openChrome();
	}
	
	@After
	public void tearDownTest() {
		WebDriverFactory.killDriver();
	}
}
