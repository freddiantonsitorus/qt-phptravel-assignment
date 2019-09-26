package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {

	WebDriver driver;
	WebDriverWait wait;
	Logger logger = LogManager.getLogger(AccountPage.class);
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
			
	@FindBy(xpath="//h3[@class='RTL']")
	WebElement username;
	
	public void verifyaccount() {
		//wait.until(ExpectedConditions.visibilityOf(username));
		logger.info(username.getText());
		
//			if(username.getText().contains("freddi Sitorus")) {
//			logger.info("OK");		
//			
						
	}
	
	public String getUsername() {
		return username.getText();
		
	}
		
}
