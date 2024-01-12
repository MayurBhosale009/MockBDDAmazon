package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser 
{
	public static WebDriver driver;//static
	public WebDriver initBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
