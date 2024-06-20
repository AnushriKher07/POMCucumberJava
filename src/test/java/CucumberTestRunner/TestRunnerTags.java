package CucumberTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags= "@smoke and regression and not perf ",features = "src/test/resources/Features/login.feature",glue ={"StepDefinations"}, 
plugin= {"pretty","html:target/htmlreport.html"})

public class TestRunnerTags {

}
