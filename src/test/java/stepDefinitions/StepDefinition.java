package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



public class StepDefinition {

	@Given("User is on the netbanking landing page")
	public void user_is_on_the_netbanking_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to page URL");
	 
	}

	@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Login success");
	}

	@Then("Home page is opened")
	public void home_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Home page is populated");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Cards are displayed");
	}
	
	 @And("^Cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String trueOrFalse) throws Throwable {
	        System.out.println(trueOrFalse);
	    }
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String userName, String password) throws Throwable {
        System.out.println(userName + " and " + password );
    }
	
}
