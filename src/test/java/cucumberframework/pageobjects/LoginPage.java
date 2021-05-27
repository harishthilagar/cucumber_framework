package cucumberframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="session_email")
	private WebElement email;
	
	
	@FindBy(how=How.XPATH ,using = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(name="commit")
	private WebElement signInButton;
	
	public void enterEmail(String userName) {
	sendKeys(email,userName);
	}
	
	public void enterPassword(String passwordValue) {
		sendKeys(password,passwordValue);
	}
	
	public void clickButton() {
		click(signInButton);
	}

}
