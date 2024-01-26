package pageclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver;// public static
	
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
	//*********************************************************
// todays deals
	
	private @FindBy (xpath = "//*[@href='/deals?ref_=nav_cs_gb']")
	WebElement Todaysdeal;
	
	private @FindBy (xpath ="//*[@src='https://m.media-amazon.com/images/W/MEDIAX_849526-T1/images/G/31/img20/Events/Jup21dealsgrid/computer_accessories.jpg']")
	WebElement Mobile_key_accesories;
	
	private @FindBy (xpath = "//*[@src='https://m.media-amazon.com/images/I/41X6hey-ExL._AC_UF226,226_FMjpg_.jpg']")
	WebElement mice_keyboard;
	
//	private @FindBy (xpath = "//*[@src='https://m.media-amazon.com/images/W/MEDIAX_849526-T1/images/I/31ysMr8xIbL._AC_SR400,600_.jpg']")
//	WebElement wire_keyboard;
	private @FindBy (xpath = "(//*[@class='a-section octopus-dlp-image-shield'])[8]")
	WebElement wire_keyboard;
	
	private @FindBy (xpath = "//*[@id='add-to-cart-button']")
	WebElement AddtoCart;
//	
//	
//	private @FindBy (xpath = "(//*[text()='Sign Out'])[1]")
//	WebElement signout;
//	private @FindBy (xpath = "(//*[text()='Sign Out'])[1]")
//	WebElement signout;
//	
	
	// ***********************************************
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
		mob_textbox.sendKeys(username); // 8788584611
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
	
	public void signOut() throws InterruptedException
	{
		Actions act = new Actions(driver);
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(60));
		wdw.until(ExpectedConditions.visibilityOf(logout_hower));
		act.moveToElement(logout_hower).build().perform();
		Thread.sleep(2000);
		signout.click();
	}
	
	// todays deals  methods
	//*****************************************************************
	public void Todaydeals()
	{
		Todaysdeal.click();
	}
	
	public void Mobile_accesories()
	{
		Mobile_key_accesories.click();
	}
	public void mice_kboard()
	{
		mice_keyboard.click();
	}
	public void wire_kboard()
	{

//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.visibilityOf(wire_keyboard));
		wire_keyboard.click();
		
	}
	public void Addedintocart() throws InterruptedException
	{
		//Thread.sleep(2000);
		AddtoCart.click();
		
	}
	
}


