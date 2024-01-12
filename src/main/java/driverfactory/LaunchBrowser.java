package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser 
{
	public static WebDriver driver;
	public WebDriver initBrowser()
	{
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--incognito");
		cop.addArguments("start-maximized");//remove driver.manage().window().maximize();

		driver = new ChromeDriver(cop);
		return driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
