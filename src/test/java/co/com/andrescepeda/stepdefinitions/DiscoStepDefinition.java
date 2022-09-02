package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.DiscographyQ;
import co.com.andrescepeda.tasks.Discography;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DiscoStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void inicial(){
        setTheStage(new OnlineCast());
        theActorCalled("Luna");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enters the website \"([^\"]*)\" d$")
    public void that_enters_the_website_d(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the Discography option and select a song$")
    public void select_the_Discography_option_and_select_a_song() {
        theActorInTheSpotlight().attemptsTo(Discography.clickDisco());
        String spotify = hisBrowser.findElement(By.xpath("html/body/div/div[2]/main/div/div/div/div/div[2]/div[3]/div/div/div/figure/a")).getAttribute("href");
        hisBrowser.navigate().to(spotify);
        System.out.println(spotify);
    }

    @Then("^you will need to verify that it takes me to the spotify platform$")
    public void you_will_need_to_verify_that_it_takes_me_to_the_spotify_platform() {

    }

    @When("^select the Discography option and select a song a$")
    public void select_the_Discography_option_and_select_a_song_a() {
        theActorInTheSpotlight().attemptsTo(Discography.clickDisco());
    }

    @Then("^you will need to verify that it takes me to the spotify platform a$")
    public void you_will_need_to_verify_that_it_takes_me_to_the_spotify_platform_a() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(DiscographyQ.discoAnswer(),
                Matchers.equalTo(Boolean.TRUE)));
    }
}
