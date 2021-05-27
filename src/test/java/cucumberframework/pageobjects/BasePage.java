package cucumberframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumberframework.constants.UIconstants;
import cucumberframework.utils.PropertyReader;


public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	PropertyReader prop = new PropertyReader();
	int expWait = Integer.parseInt(prop.getProperty(UIconstants.EXPLICIT_WAIT));

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, expWait);
	}

	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	public void sendKeys(WebElement element, String key) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(key);
	}

}
