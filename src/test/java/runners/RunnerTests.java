package runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			//Execution Report
			plugin = { 
						"pretty",
						"html:target/reports/evidencia-html.html",
						"json:target/reports/evidencia-json.json"
			},
			monochrome = true,
			strict = false,
			dryRun = false,
			//Features to be Executed. Can be a folder, many folder or only a single feature
			features = { 
						 //"classpath:features"
						"classpath:features/TestGoogle.feature"	
			},
			//Tests steps selected
			glue = {
					"classpath:steps"
			}
			//Used to select group tests by tag
			//,tags = {""}
		)
public class RunnerTests {
	
	@BeforeClass
	public static void AberturaProjeto() {
		//boot method for the entire test battery
	}
	
}
