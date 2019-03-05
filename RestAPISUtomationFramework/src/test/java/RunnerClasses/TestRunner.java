package RunnerClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FunctionalTest",
        glue = {"stepDefinitions"},
        dryRun = false

)
public class TestRunner {
}
