package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ABasePageObjects {
	
	public HomePage() {
		initObjects(this);
		
	}

		
	public void setURL() {
		
		driver.get("https://www.phptravels.net/");
				
	}
	
	public void signUp() {
		
		driver.get("https://www.phptravels.net/register");
		driver.manage().window().fullscreen();
		
	}
	
}
