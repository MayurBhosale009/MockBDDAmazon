package stepdefinition;

import driverfactory.LaunchBrowser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.LoginPage;

public class LoginCorrectTodaysDeal 
{
	LoginPage lp=new LoginPage(LaunchBrowser.getDriver());

	
	
	
	
	@When("User enters the Email or mobile phone number as {string}")
	public void user_enters_the_email_or_mobile_phone_number_as(String username) {
	   lp.mobTextbox(username); 
	   lp.mobContinue();
	}

	@When("User clicks on Continue button and User enters the password as {string}")
	public void user_clicks_on_continue_button_and_user_enters_the_password_as(String password) {
	   lp.passTextbox(password);
	 
	   
	}
	@When("User redirects to the Homepage")
	public void user_redirects_to_the_homepage() {

	}

	@When("User clicks on Todays deal")
	public void user_clicks_on_todays_deal() {
		

		
		
		lp.Todaydeals();
	}

	@When("User clicks on Mobile & computer accesories")
	public void user_clicks_on_mobile_computer_accesories() throws InterruptedException {
		Thread.sleep(2000);
		lp.Mobile_accesories();
	}

	@When("User navigate and clicks on mice and keyboard accesories")
	public void user_navigate_and_clicks_on_mice_and_keyboard_accesories() throws InterruptedException {
		Thread.sleep(2000);
		lp.mice_kboard();

	}

	@When("User navigate and clicks on wired keyboard")
	public void user_navigate_and_clicks_on_wired_keyboard() {
		lp.wire_kboard();
	}

	@When("user navigate to next page and clicks on add to cart button")
	public void user_navigate_to_next_page_and_clicks_on_add_to_cart_button() throws InterruptedException {
		lp.Addedintocart();
	}

	@Then("product should be added into the cart")
	public void product_should_be_added_into_the_cart() {
		System.out.println(" product added successfully ");
	}

}
