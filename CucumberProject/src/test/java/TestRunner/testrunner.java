package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = {"StepDefs"},
    tags = "@LegalCopilot",
    plugin = {"pretty", "html:target/htmlReport.html"}
)
public class testrunner {
	
}

//tags = "@LegalCopilot or @CarlyleLegal"
