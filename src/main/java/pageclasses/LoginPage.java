package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	private @FindBy (xpath = "//*[text()='Hello, sign in']")
	WebElement signin_tab;

	private @FindBy (xpath = "//*[@id='ap_email']")
	WebElement mob_textbox;

	private @FindBy (xpath = "//*[@class='a-button-input']")
	WebElement mob_continue;

	private @FindBy (xpath = "//*[@type='password']")
	WebElement pass_textbox;

	private @FindBy (xpath = "//*[@id='signInSubmit']")
	WebElement signin_button;
	
	private @FindBy (xpath = "//*[text()='There was a problem']")
	WebElement wrong_pass;
	
	private @FindBy (xpath = "//*[@id='nav-link-accountList-nav-line-1']")
	WebElement logout_hower;
	
	private @FindBy (xpath = "(//*[text()='Sign Out'])[1]")
	WebElement signout;

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void signinTab()
	{
		signin_tab.click();
	}
	
	public void mobTextbox(String username)
	{
		mob_textbox.clear();
		mob_textbox.sendKeys(username);
	}
	
	public void mobContinue()
	{
		mob_continue.click();
	}
	
	public void passTextbox(String password)
	{
		pass_textbox.clear();
		pass_textbox.sendKeys(password);
	}
	
	public void signinButton()
	{
		signin_button.click();
	}
	
	public WebElement wrongPass()
	{
		return wrong_pass;
//		return logout_hower;
	}
	public WebElement rightPass()
	{
//		return wrong_pass;
		return logout_hower;
	}
	
	public void signOut() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(logout_hower).build().perform();
		Thread.sleep(2000);
		signout.click();
	}
}


