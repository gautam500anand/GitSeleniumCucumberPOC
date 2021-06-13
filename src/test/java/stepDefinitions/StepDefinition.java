package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class StepDefinition extends Base {

	@Given("User is on the netbanking landing page")
	public void user_is_on_the_netbanking_landing_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to page URL");

	}

	@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password() throws Throwable {
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
	public void user_login_into_application_with_something_and_something(String userName, String password)
			throws Throwable {
		System.out.println(userName + " and " + password);
	}

	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
		driver = InitializeDriver();

	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
		driver.manage().window().maximize();

	}

	@Given("^Click on login link on homepage to land on secure sign in Page$")
	public void click_on_login_link_on_homepage_to_land_on_secure_sign_in_Page() throws Throwable {
		LandingPage lp = new LandingPage(driver);

		lp.getSignIn().click();

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage SgPg = new LoginPage(driver);
		SgPg.getUserName().sendKeys(username);
		SgPg.getPassword().sendKeys(password);
		
		SgPg.getLogin().click();

	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

}
