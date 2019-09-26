package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
	
	public static void removeDriver(WebDriver driver) {
		driver.close();
		driver.quit();
	}
			
	public static WebDriver newWebDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installer\\Automation\\WebDriver\\Working WebDriver package\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
} 