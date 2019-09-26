package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

public RegisterPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstnametxt;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastnametxt;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement mobilenumbertxt;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement emailtxt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordtxt;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement confirmpasswordtxt;
	
	@FindBy(xpath="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
	WebElement signup;
	
	public void inputFirstName(String firstname) {
		firstnametxt.sendKeys(firstname);

	}
	public void inputLastName(String lasttname) {
		lastnametxt.sendKeys(lasttname);

	}
	public void inputMobileNumber(String mobileNumber) {
		mobilenumbertxt.sendKeys(mobileNumber);

	}
	public void inputEmail(String email) {
		emailtxt.sendKeys(email);

	}
	public void inputPassword(String password) {
		passwordtxt.sendKeys(password);

	}
	public void inputConfirmPassword(String confirmpassword) {
		confirmpasswordtxt.sendKeys(confirmpassword);

	}
	public void submit() {
		signup.click();
		
	}
	


}

