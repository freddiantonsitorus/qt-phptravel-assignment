package stepdefs;

import java.util.Map;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;


public class SearchHotelStefDef extends AStepDefObject {

    @Given("^PHP Travel homepage is displayed$")
    public void php_travel_homepage_is_displayed() throws Throwable {
    	hp.setURL();
    	driver.manage().window().fullscreen();
    	
    }

    @When("^User input data hotel$")
    public void user_input_data_hotel(DataTable dt) throws Throwable {
    	Map<String, String> data = dt.asMap(String.class, String.class);
    	
    	sp.clickcity();
    	sp.inputCity(data.get("city")); 
    	sp.inputCheckIn(data.get("checkin"));
    	sp.inputCheckOut(data.get("checkout"));
    	sp.inputGuest(data.get("guest"));

    	
    }

    @And("^User click search$")
    public void user_click_search() throws Throwable {
        sp.submit();
    	
    }

    @Then("^Verify hotel list is displayed$")
    public void verify_hotel_list_is_displayed() throws Throwable {
        
    	
    }
    
    
}