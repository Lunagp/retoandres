package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.EventQ;
import co.com.andrescepeda.tasks.Event;
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

public class EventStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inicial(){
        setTheStage(new OnlineCast());
        theActorCalled("Luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enters the website \"([^\"]*)\" e$")
    public void that_enters_the_website_e(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the Events option and the upcoming events option$")
    public void select_the_Events_option_and_the_upcoming_events_option() {
        theActorInTheSpotlight().attemptsTo(Event.infoEvento());
    }

    @Then("^You will need to validate that the first post information supplied by the page is displayed in the console and compared to a text$")
    public void you_will_need_to_validate_that_the_first_post_information_supplied_by_the_page_is_displayed_in_the_console_and_compared_to_a_text() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(EventQ.eventoAnswer(),
                Matchers.equalTo(Boolean.FALSE)));
    }

}
