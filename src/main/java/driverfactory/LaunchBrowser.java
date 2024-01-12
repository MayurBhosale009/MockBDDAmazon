package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser 
{
	public static WebDriver driver;
	public WebDriver initBrowser()
	{
<<<<<<< HEAD
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("start-maximized");
		driver = new ChromeDriver(op);
		//driver.manage().window().maximize();
=======
		ChromeOptions cop = new ChromeOptions();
		cop.addArguments("--incognito");
		cop.addArguments("start-maximized");//remove driver.manage().window().maximize();

		driver = new ChromeDriver(cop);
>>>>>>> 62406837f05927793a5450abcb0053f3b95fd39c
		return driver;
	}

	public static WebDriver getDriver()
	{
		return driver;
	}
}
