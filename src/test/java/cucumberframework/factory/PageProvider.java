package cucumberframework.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumberframework.pageobjects.AddAddress;
import cucumberframework.pageobjects.AddressPage;
import cucumberframework.pageobjects.DestroyAddress;
import cucumberframework.pageobjects.HomePage;
import cucumberframework.pageobjects.LoginPage;



public class PageProvider {
	WebDriver driver;

	public PageProvider(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		HomePage homePage = new HomePage(driver);
		PageFactory.initElements(driver, homePage);
		return homePage;
	}

	public LoginPage getLoginPage() {
		LoginPage loginPage = new LoginPage(driver);
		PageFactory.initElements(driver, loginPage);
		return loginPage;
	}
	
	public AddressPage getAddressPage() {
		AddressPage addressPage = new AddressPage(driver);
		PageFactory.initElements(driver, addressPage);
		return addressPage;
	}
	
	public AddAddress addAddress() {
		AddAddress addAddress = new AddAddress(driver);
		PageFactory.initElements(driver, addAddress);
		return addAddress;
	}
	
	public DestroyAddress deleteAddress() {
		DestroyAddress deleteAddress = new DestroyAddress(driver);
		PageFactory.initElements(driver, deleteAddress);
		return deleteAddress;
		
	}

}
