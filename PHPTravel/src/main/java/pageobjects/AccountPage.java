package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.core.logging.Logger;

public class AccountPage extends ABasePageObjects {

	public AccountPage() {
		initObjects(this);
		
	}
	
		
	@FindBy(xpath="//h3[@class='RTL']")
	WebElement username;
	
	public void verifyaccount() {
		if(username.getText().contains("freddi5")) {
			logger.info("pass");		
			
		}
		
		
	}
	
	
	
}
