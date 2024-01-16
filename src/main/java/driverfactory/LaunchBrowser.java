package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser 
{
	public static WebDriver driver;
	public WebDriver initBrowser()
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("start-maximized");
		driver = new ChromeDriver(op);
		return driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
