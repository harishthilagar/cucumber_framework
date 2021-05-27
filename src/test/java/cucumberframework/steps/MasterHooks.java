package cucumberframework.steps;

import org.openqa.selenium.WebDriver;

import cucumberframework.methods.TestMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MasterHooks extends BaseStep {

	WebDriver driver;
	TestMethods testMethod = new TestMethods();

	@Before
	public void setup() {
		driver = getDriver();
	}

	@After
	public void tearDown() {
		closeDriver(driver);
	}

}
