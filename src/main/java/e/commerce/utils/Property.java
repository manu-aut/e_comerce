package e.commerce.utils;

import static java.lang.System.getProperty;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {

	protected static Properties PRO = new Properties();
	private static final String FIREFOX_BINARY = "ruta.firefox";
	private static final String CHROME_DRIVER = "ruta.chromedriver";
	private static final String URL = "URL";
	private static final String USERNAME = "username";
	private static final String PASSWORD = "password";

	public static String getUrl() {
		return URL;
	}

	public static String getChromeDriver() {
		return CHROME_DRIVER;
	}

	public static Properties getPRO() {
		return PRO;
	}

	public static String getUsername() {
		return USERNAME;
	}

	public static String getPassword() {
		return PASSWORD;
	}

	public static String getFirefoxBinary() {
		return FIREFOX_BINARY;
	}

	public static String getURL() {
		return URL;
	}

	public static void load() {
		PRO = new Properties();

		try {
			InputStream inputStream = new FileInputStream("./serenity.properties");
			PRO.load(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (getProperty(URL) != null) {
			PRO.setProperty(URL, PRO.getProperty(URL));
		}

		if (getProperty(CHROME_DRIVER) != null) {
			PRO.setProperty(CHROME_DRIVER, PRO.getProperty(CHROME_DRIVER));
		}
		if (getProperty(FIREFOX_BINARY) != null) {
			PRO.setProperty(FIREFOX_BINARY, PRO.getProperty(FIREFOX_BINARY));
		}

		if (System.getProperty(USERNAME) != null) {
			PRO.setProperty(USERNAME, PRO.getProperty(USERNAME));

		}

		if (System.getProperty(PASSWORD) != null) {
			PRO.setProperty(PASSWORD, PRO.getProperty(PASSWORD));

		}

	}

}
