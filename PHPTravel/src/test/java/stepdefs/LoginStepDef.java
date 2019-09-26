package stepdefs;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;


	public class LoginStepDef extends AStepDefObject{
		
		Logger logger = LogManager.getLogger(AccountPage.class);

	    @Given("^PHP Travels Login page is displayed$")
	    public void php_travels_login_page_is_displayed() throws Throwable {
	    	driver.get("https://www.phptravels.net/login");
	    }

	    @When("^User enter valid account$")
	    public void user_enter_valid_account(DataTable dt) throws Throwable {
	    	Map<String, String> data = dt.asMap(String.class, String.class);
	        lp.inputEmail(data.get("Email"));
	        lp.inputPassword(data.get("Password")); 
	        
	    }
	    
	    @And("^User submit data on Login Page$")
	    public void user_submit_data() throws Throwable {
	        lp.login();
	    }

	    @Then("^Verify username is displayed correctly$")
	    public void verify_username_is_displayed_correctly() throws Throwable {
	    	logger.info(ap.getUsername());
	    	
	    }

	   

	}
	

