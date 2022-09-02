package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.NewsQ;
import co.com.andrescepeda.tasks.News;
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

public class NewsStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inicial(){
        setTheStage(new OnlineCast());
        theActorCalled("Luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enters the website \"([^\"]*)\" n$")
    public void that_enters_the_website_n(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the News option$")
    public void select_the_News_option() {
        theActorInTheSpotlight().attemptsTo(News.infoNoticias());
    }

    @Then("^must validate that the information of the first news provided by the page, is displayed in the console and compared with a text$")
    public void must_validate_that_the_information_of_the_first_news_provided_by_the_page_is_displayed_in_the_console_and_compared_with_a_text() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(NewsQ.newsAnswer(),
                Matchers.equalTo(Boolean.FALSE)));
    }
}
