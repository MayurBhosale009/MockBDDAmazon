package pageclasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialPage 
{
	WebDriver driver;
	
	private @FindBy(xpath="//*[text()='Book Store Application']")
	WebElement click_book;
	
	private @FindBy(xpath="//*[@id='firstName']")
	WebElement firstname;
	
	private @FindBy(xpath="//*[@id='lastName']")
	WebElement lastname;
	
	private @FindBy(xpath="//*[@id='userEmail']")
	WebElement email;
	
	private @FindBy(xpath="//*[@id='gender-radio-1']")
	WebElement gender;
	
	private @FindBy(xpath="//*[@id='userNumber']")
	WebElement mob;
	
	private @FindBy(xpath="//*[@id='dateOfBirthInput']")
	WebElement dob;
	
	private @FindBy(xpath="//*[@class='react-datepicker__month-select']")
	WebElement dob_month;
	
	private @FindBy(xpath="//*[@class='react-datepicker__year-select']")
	WebElement dob_year;
	
	private @FindBy(xpath="//*[text()='9']")
	WebElement dob_date;// vary date next time
	
	private @FindBy(xpath="//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	WebElement subject;
	
	private @FindBy(xpath="//*[text()='Sports']")
	WebElement hob_sports;
	
	private @FindBy(xpath="//*[text()='Reading']")
	WebElement hob_reading;
	
	private @FindBy(xpath="//*[text()='Music']")
	WebElement hob_music;
	
	private @FindBy(xpath="//*[@id='uploadPicture']")
	WebElement upload_pic_button;
	
	private @FindBy(xpath="//*[@id='currentAddress']")
	WebElement address;
	
	private @FindBy(xpath="//*[text()='Select State']")
	WebElement state;
	
	private @FindBy(xpath="//*[@id='city']")
	WebElement city;
	
	private @FindBy(xpath="//*[text()='Submit']")
	WebElement submit_button;
		
	public TutorialPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void clickBook()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", click_book);
		click_book.click();
	}
	
	public void formFilling() throws InterruptedException
	{
		firstname.sendKeys("Mayur");
		lastname.sendKeys("Bhosale");
		email.sendKeys("mb01@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", gender);
		mob.sendKeys("9797979797");
	
		dob.click();
		Thread.sleep(2000);
		Select sel_month = new Select(dob_month);
		sel_month.selectByIndex(8);
		Thread.sleep(2000);
		Select sel_year = new Select(dob_year);
		sel_year.selectByVisibleText("1989");
		Thread.sleep(2000);
		dob_date.click();

		subject.click();
		Actions act = new Actions(driver);
		act.sendKeys("mat").sendKeys(Keys.ENTER)
		.sendKeys("EnGlI").sendKeys(Keys.ENTER).build().perform();
		
		hob_sports.click();
		upload_pic_button.sendKeys("C:\\Users\\om\\Pictures\\Screenshot 2023-06-23 193617.png");
		
		address.sendKeys("XYZ Street");
		act.sendKeys(Keys.TAB).build().perform();

		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", submit_button);
	}
}
