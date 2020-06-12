package e.commerce.drivers;

import static e.commerce.utils.Constants.ADD_ARGUMENTS_MAXIMIZED;
import static e.commerce.utils.Constants.SET_PRO_CHROME;
import static e.commerce.utils.Property.getChromeDriver;
import static e.commerce.utils.Property.getPRO;
import static e.commerce.utils.Property.getURL;
import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromiumDriver {

	public static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriver initMyChromium() {
		System.setProperty(SET_PRO_CHROME, getPRO().getProperty(getChromeDriver()));
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(ADD_ARGUMENTS_MAXIMIZED);
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(15, SECONDS);
		driver.get(getPRO().getProperty(getURL()));
		return driver;

	}

	public static WebDriver closeDriver() {
		if (driver != null) {
			driver.close();

		}
		return driver;

	}

}
