package stepdefs;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;
import pageobjects.SearchHotelPage;
import utils.WebDriverFactory;

public class AStepDefObject {
	protected static WebDriver driver;

	protected static HomePage hp;
	protected static RegisterPage rp;
	protected static AccountPage ap;
	protected static LoginPage lp;
	protected static SearchHotelPage sp;
    
    public static void initObjects() {
    	driver = WebDriverFactory.newWebDriver();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set implicitly wait 
    	hp = new HomePage(driver);
    	rp = new RegisterPage(driver);
    	ap = new AccountPage(driver);
    	lp = new LoginPage(driver);
    	sp = new SearchHotelPage(driver);
    
	}
    
    public static void close() {
    	
    	WebDriverFactory.removeDriver(driver);
    	hp = null;
    	rp = null;
    	ap = null; 
    	lp = null;
    	sp = null;
    	
    }
}
