package stepdefinition;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import driverfactory.LaunchBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.LoginPage;
import io.cucumber.datatable.DataTable;

public class LoginStep 
{
	WebDriver driver;//static
	LoginPage lp = new LoginPage(LaunchBrowser.getDriver());

	@Given("User is at the Login Page")
	public void user_is_at_the_login_page() 
	{
		driver = LaunchBrowser.getDriver();
		driver.get("https://www.amazon.in");
	}

	@When("User Howers on signin")
	public void user_howers_on_signin() 
	{

	}

	@When("User clicks on Signin tab")
	public void user_clicks_on_signin_tab() 
	{
		lp.signinTab();
	}

	@When("User enters the Email or mobile phone number as {string} and User clicks on Continue button and User enters the password as {string}")
	public void user_enters_the_email_or_mobile_phone_number_as_and_user_clicks_on_continue_button_and_user_enters_the_password_as(String string, String string2, io.cucumber.datatable.DataTable dataTable) throws InterruptedException 
	{
		List<List<String>> data = dataTable.asLists(String.class);
		ArrayList<String> al = new ArrayList<String>();

		for(List<String> value:data)     
		{
			for(String list_ele:value) 
			{ 
				al.add(list_ele);
			}
		} 
	//| abc@gmail.com | pass@abc || 918788584611 | Pass@123 || mno@gmail.com | pass@mno |
		String wrong_url = "https://www.amazon.in/ap/signin";
		String wrong_title = "Amazon Sign In";
		String right_url = "https://www.amazon.in/?ref_=nav_ya_signin";
		String right_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		for(int i=0; i<al.size(); i=i+2)//2
		{
			lp.mobTextbox(al.get(i));//918788584611
			lp.mobContinue();
			lp.passTextbox(al.get(i+1));//Pass@123
			lp.signinButton();

			String cur_title = driver.getTitle();//Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
			String cur_url = driver.getCurrentUrl();
			System.out.println("Current Title: "+cur_title);
			System.out.println("Current URL: "+cur_url);
						
			if(cur_title.equals(wrong_title))
			{
				driver.get("https://www.amazon.in");
				lp.signinTab();
			}
			else if(cur_title.equals(right_title))
			{
				lp.signOut();
			}
		}
	}

	@When("User clicks on Signin button")
	public void user_clicks_on_signin_button() 
	{				
		lp.signinButton();
	}

	@Then("User redirects to the Home Page of Amazon Site")
	public void user_redirects_to_the_home_page_of_amazon_site() 
	{

	}
}
