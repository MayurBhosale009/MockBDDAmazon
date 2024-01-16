package stepdefinition;

import org.openqa.selenium.WebDriver;

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
		driver = lb.initBrowser();
	}
	
//	@After
//	public void postReq() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.quit();
//	}
}
