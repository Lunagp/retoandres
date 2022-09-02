package co.com.andrescepeda.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/biografia.feature",
        glue = "co/com/andrescepeda/stepdefinitions"
)
public class BioRunner {
}
