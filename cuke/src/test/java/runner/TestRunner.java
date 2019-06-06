package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"},
				glue= {"steps"},
				plugin = { "pretty", "html:target/cucumber-reports" },
				monochrome = true
		)

public class TestRunner {
	
}
