package stepdefs;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.impl.Log4jContextFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;

public class RegistrationStepDef extends AStepDefObject{
		
	
    @Given("^PHP Travels homepage open$")
    public void php_travels_homepage_open() throws Throwable {
        hp.setURL();
    	
    }
    @When("^User click signup button$")
    public void user_click_signup_button() throws Throwable {
        hp.signUp();
    	    	
    }  
    @And("^User input data$")
    public void user_input_data(DataTable dt) throws Throwable {
    	Map<String, String> data = dt.asMap(String.class, String.class);
    	
        rp.inputFirstName(data.get("firstName"));
        rp.inputLastName(data.get("lastName"));
        rp.inputMobileNumber(data.get("mobileNumber"));
        rp.inputEmail(data.get("email"));
        rp.inputPassword(data.get("password"));
        rp.inputConfirmPassword(data.get("confirmPassword"));
    }
    @And("^User submit data on Registration Page$")
    public void user_submit_data() throws Throwable {
        rp.submit();
    	
    }
    @Then("^Verify my account page displayed$")
    public void verify_my_account_page_displayed() throws Throwable {
        
    	ap.verifyaccount();
        
    	           	  	
    }       
    @And("^User input existing data$")
    public void user_input_existing_data(DataTable dt) throws Throwable {
    	Map<String, String> data = dt.asMap(String.class, String.class);
        
    	rp.inputFirstName(data.get("firstName"));
        rp.inputLastName(data.get("lastName"));
        rp.inputMobileNumber(data.get("mobileNumber"));
        rp.inputEmail(data.get("email"));
        rp.inputPassword(data.get("password"));
        rp.inputConfirmPassword(data.get("confirmPassword"));
        
    }
    @Then("^Verify error message$")
    public void verify_error_message() throws Throwable {
    
    	
    	
    }
    
}