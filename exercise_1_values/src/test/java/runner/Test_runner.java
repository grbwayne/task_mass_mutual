package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;	

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "json:target/cucumber.json" },
				features = "src/test/java/features",
				glue = { "step_definitions" },
				dryRun = false
				)
public class Test_runner {

}
