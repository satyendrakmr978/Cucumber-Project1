package StepDefinations;



import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue= {"StepDefinations"},
monochrome=true,
//plugin= {"usage"}
 plugin= {"pretty","html:target/cucumber-reports/report.html",
 "pretty","json:target/cucumber-reports/cucumber.json",
 "pretty","junit:target/cucumber-reports/cucumber.xml"}
		)
public class TestRunner {

}
