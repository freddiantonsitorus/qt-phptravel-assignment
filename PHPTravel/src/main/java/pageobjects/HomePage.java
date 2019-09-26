package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	public void setURL() {
		driver.get("https://www.phptravels.net/");
				
	}
	
	public void signUp() {
		
		driver.get("https://www.phptravels.net/register");
		driver.manage().window().fullscreen();
		
	}
	
	public void closeBrowser() {
		driver.close();
		
	}
}
