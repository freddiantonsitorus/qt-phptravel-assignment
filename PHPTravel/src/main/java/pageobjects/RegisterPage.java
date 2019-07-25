package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends ABasePageObjects {

	public RegisterPage() {
		initObjects(this);
		
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Mobile Number']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']")
	WebElement signup;
	
	public void inputdata() {
		
		firstname.sendKeys("freddi5");
    	lastname.sendKeys("sitorus5");
    	mobilenumber.sendKeys("mobile5");
    	email.sendKeys("freddi5@mailinator.com");
    	password.sendKeys("password5");
    	confirmpassword.sendKeys("password5");
    	
	}
	
	public void submit() {
		signup.click();
		
	}

}

