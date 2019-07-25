package stepdefs;


import java.sql.Driver;

import org.apache.logging.log4j.core.impl.Log4jContextFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.RegisterPage;


public class Registration {
	
	HomePage hp = new HomePage();
	RegisterPage rp = new RegisterPage();
	AccountPage ap = new AccountPage();
	
	
    @Given("^PHP Travels homepage open$")
    public void php_travels_homepage_open() throws Throwable {
        
    	hp.setURL();
    	
    }

    @When("^User click signup button$")
    public void user_click_signup_button() throws Throwable {
        
    	hp.signUp();
    	    	
    }

  
    @And("^User input data$")
    public void user_input_data() throws Throwable {
              
    	rp.inputdata();
    	    	    	
    }

    @And("^User submit data$")
    public void user_submit_data() throws Throwable {
        
    	rp.submit();
    	
    }

    @Then("^Verify my account page displayed$")
    public void verify_my_account_page_displayed() throws Throwable {
        
    	ap.verifyaccount();
      	    	
    	
    }
    
}