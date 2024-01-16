
package tutorialpkg;


import org.openqa.selenium.WebDriver;

import driverfactory.LaunchBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.TutorialPage;



public class TutorialStep 
{


	WebDriver driver;
	TutorialPage tp = new TutorialPage(LaunchBrowser.getDriver());
	

	@Given("User is at the Practice Form Tab")
	public void user_is_at_the_practice_form_tab() 
	{
	    driver=LaunchBrowser.getDriver();
	    driver.get("https://demoqa.com/automation-practice-form");
	}

	@When("User clicks on Book Store Application tab on left side of window")
	public void user_clicks_on_book_store_application_tab_on_left_side_of_window() 
	{
		tp.clickBook();
	   
	}

	@When("User fills the Student Registration Form")
	public void user_fills_the_student_registration_form() throws InterruptedException 
	{
	   tp.formFilling();
	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() 
	{
		
	}


	@Then("User redirects to the Next Page")
	public void user_redirects_to_the_next_page() {
	    System.out.println("Registration Successful");
	}


}
