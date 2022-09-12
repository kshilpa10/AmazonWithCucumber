package in.amazon.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Features"

		,glue="in.amazon.testscripts"
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}