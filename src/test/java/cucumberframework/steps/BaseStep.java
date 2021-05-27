package cucumberframework.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumberframework.factory.DriverFactory;
import cucumberframework.factory.PageProvider;

public class BaseStep {

	public static WebDriver driver;
	PageProvider provider;

	public WebDriver getDriver() {
		driver = DriverFactory.getDriver();
		System.out.println("Test Sarted");
		return driver;
	}

	public void closeDriver(WebDriver driver) {
		driver.close();
		driver.quit();
		System.out.println("Test Finished");
	}

	public void waitForSeconds(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void scrollWindow(WebDriver driver, int scrollTo) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + scrollTo + ");");
	}

}
