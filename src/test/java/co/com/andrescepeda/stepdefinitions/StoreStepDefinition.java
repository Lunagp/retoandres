package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.VerifyInformationBuy;
import co.com.andrescepeda.tasks.BuyItems;
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
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StoreStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setIni(){
        setTheStage(new OnlineCast());
        theActorCalled("Andres");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that enter the website  \"([^\"]*)\"$")
    public void that_enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }
    @When("^select the option Store and add two items to shopping cart and checkout$")
    public void select_the_option_Store_and_add_two_items_to_shopping_cart_and_checkout() {
        theActorInTheSpotlight().attemptsTo(BuyItems.inThePage());
    }


    @Then("^you should validate that the information name price of the first and second item is displayed in the console and compared with a text$")
    public void you_should_validate_that_the_information_name_price_of_the_first_and_second_item_is_displayed_in_the_console_and_compared_with_a_text() {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyInformationBuy.inThePage(),
               Matchers.equalTo(Boolean.FALSE)));
    }


}
