package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.WebDriverFactory;

public abstract class ABasePageObjects {

	protected WebDriver driver;
	protected WebDriverWait wait;
	protected static final Logger logger = LogManager.getLogger(ABasePageObjects.class);
    
    protected WebDriver getDriver() {
        return WebDriverFactory.getInstance().getWebDriver();
    }
	
    protected void initObjects(Object child) {
    	this.driver = getDriver();
    	PageFactory.initElements(driver, child);
    	this.wait = new WebDriverWait(this.driver, 100);
    	
	}
} 

