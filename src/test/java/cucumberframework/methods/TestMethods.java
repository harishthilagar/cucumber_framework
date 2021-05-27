package cucumberframework.methods;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumberframework.factory.PageProvider;
import cucumberframework.pageobjects.AddAddress;
import cucumberframework.pageobjects.AddressPage;
import cucumberframework.pageobjects.DestroyAddress;
import cucumberframework.pageobjects.HomePage;
import cucumberframework.pageobjects.LoginPage;
import cucumberframework.steps.BaseStep;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestMethods extends BaseStep{

	public void signInBtn(PageProvider provider) {
		HomePage homepage = provider.getHomePage();
		homepage.signIn();
	}

	public void enterEmail(PageProvider provider,String userName) {
		LoginPage loginPage = provider.getLoginPage();
		loginPage.enterEmail(userName);
	}
	
	public void enterPassword(PageProvider provider,String passwordValue) {
		LoginPage loginPage = provider.getLoginPage();
		loginPage.enterPassword(passwordValue);
	}
	
	public void clickButton(PageProvider provider) {
		LoginPage loginPage = provider.getLoginPage();
		loginPage.clickButton();
	}

	public void addressBtn(PageProvider provider) {
		AddressPage addressPage = provider.getAddressPage();
		addressPage.address();
	}
	
	public void clickNewAddres(PageProvider provider) {
		AddAddress addAddress = provider.addAddress();
		addAddress.newAddress();
	}
	
	public void addAddress(List<String> list,PageProvider provider,WebDriver driver) {
		AddAddress addAddress = provider.addAddress();
		addAddress.firstName(list.get(2));
		addAddress.lastName(list.get(3));
		addAddress.address1(list.get(4));
		addAddress.city(list.get(5));
		addAddress.zipCode(list.get(6));
		scrollWindow(driver, 700);
	}
	public void clickSubmit(PageProvider provider,WebDriver driver) {
		AddAddress addAddress = provider.addAddress();
		addAddress.clicksubmit();
		scrollWindow(driver, 700);
		addAddress.clickList();
		waitForSeconds(3);
	}

	public void deleteAddress(PageProvider provider) {
		DestroyAddress delete = provider.deleteAddress();
//		delete.deleteAddress("firstName1", "lastName1");
		delete.deleteAddresses();
	}
}
