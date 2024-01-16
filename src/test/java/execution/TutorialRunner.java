package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\features\\tutorial.feature"},
		glue = {"execution"},
		plugin = {"pretty"},
		publish = true
)

public class TutorialRunner extends AbstractTestNGCucumberTests
{

}
