package stepdefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\features\\login.feature"},
		glue = {"stepdefinition"},
		plugin = {"pretty"},
		publish = true
)

public class LoginRunner extends AbstractTestNGCucumberTests
{

}
