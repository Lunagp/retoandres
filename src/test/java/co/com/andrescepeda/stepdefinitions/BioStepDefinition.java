package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.BioQ;
import co.com.andrescepeda.tasks.Bio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BioStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inicial(){
        setTheStage(new OnlineCast());
        theActorCalled("Luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enters the website \"([^\"]*)\"$")
    public void that_enters_the_website(String url) {
       theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the BIO option$")
    public void select_the_BIO_option() {
        theActorInTheSpotlight().attemptsTo(Bio.infoBio());
    }

    @Then("^you will need to validate that the information provided by the page is displayed in the console and compared to a text$")
    public void you_will_need_to_validate_that_the_information_provided_by_the_page_is_displayed_in_the_console_and_compared_to_a_text() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(BioQ.bioAnswer(),
                Matchers.equalTo(Boolean.FALSE)));
    }


}
