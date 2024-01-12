package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser 
{
	public static WebDriver driver;//static
	public WebDriver initBrowser()
	{
<<<<<<< HEAD
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--incognito");
		cop.addArguments("start-maximized");//remove driver.manage().window().maximize();

		driver = new ChromeDriver(cop);
=======
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("start-maximized");
		
		driver = new ChromeDriver(op);
		
		//driver.manage().window().maximize();
>>>>>>> 53bf8b12a95c2599653f1178afd00705906576be
		return driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
