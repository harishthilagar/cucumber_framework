package cucumberframework.steps;

import java.util.List;

import cucumberframework.factory.PageProvider;
import cucumberframework.methods.TestMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestAddressSteps extends BaseStep {

	PageProvider provider;
	TestMethods testMethod = new TestMethods();

	@Given("The tester click the signin link")
	public void theTesterClickTheSigninLink() {
		provider = new PageProvider(driver);
		testMethod.signInBtn(provider);
		System.out.println("sigin");
	}

	@Given("^tester enters the valid username([^\"]*)$")
	public void testerEntersTheValidUsername(String username) {
		testMethod.enterEmail(provider, username);
	}

	@Given("^tester enters the valid password([^\\\"]*)$")
	public void testerEntersTheValidPassword(String passwordValue) {
		testMethod.enterPassword(provider, passwordValue);
	}

	@When("the tester clickon the login button")
	public void theTesterClickonTheLoginButton() {
		testMethod.clickButton(provider);
	}

	@Then("the tester should be logged in successfully")
	public void theTesterShouldBeLoggedInSuccessfully() {
		System.out.println("the tester logged in successfully");
	}

	@Given("The tester click the address button")
	public void theTesterClickTheAddressButton() {
		testMethod.addressBtn(provider);
	}

	@Given("The tester fill the address data")
	public void theTesterFillTheAddressData(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		for (List<String> list : data) {
			if (list.get(0).equalsIgnoreCase("Yes")) {
				testMethod.clickNewAddres(provider);
				testMethod.addAddress(list, provider, driver);
				testMethod.clickSubmit(provider, driver);
			} else {
				continue;
			}
		}
	}

	@Then("the address should be added successfully")
	public void theAddressShouldBeAddedSuccessfully() {
		System.out.println("the address added successfully");
	}

	@Given("delete the addresses in page")
	public void deleteTheAddressesInPage() {
		testMethod.deleteAddress(provider);
	}

	@Then("the address should be deleted successfully")
	public void theAddressShouldBeDeletedSuccessfully() {
		System.out.print("the address should be deleted successfully");
	}

}
