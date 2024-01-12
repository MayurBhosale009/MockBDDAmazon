package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverfactory.LaunchBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks
{
	WebDriver driver;
	@Before
	public void preReq()

	{	
        LaunchBrowser lb = new LaunchBrowser();
//>>>>>>> 62406837f05927793a5450abcb0053f3b95fd39c
		driver = lb.initBrowser();
		//added testng.xml
	}
	
	@After
	public void postReq() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
