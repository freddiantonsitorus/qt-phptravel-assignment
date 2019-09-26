package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement emailtxt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordtxt;
	
	@FindBy(xpath="//button[@class='btn btn-action btn-lg btn-block loginbtn']")
	WebElement loginbtn;
	
	public void inputEmail (String email) {
		emailtxt.sendKeys(email);
	}
	
	public void inputPassword (String password) {
		passwordtxt.sendKeys(password);
	}
	
	public void login() {
		loginbtn.click();
		
	}
}
