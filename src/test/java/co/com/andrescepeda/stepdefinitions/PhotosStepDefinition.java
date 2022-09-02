package co.com.andrescepeda.stepdefinitions;

import co.com.andrescepeda.questions.ObtainInformationPhoto;
import co.com.andrescepeda.tasks.SelectPhoto;
import co.com.andrescepeda.userinterfaces.PhotosHome;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PhotosStepDefinition {


    @Managed
    WebDriver hisBrowser;

     @Before
     public void setIni(){
         setTheStage(new OnlineCast());
         theActorCalled("Andres");
         theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
     }


    @Given("^that enter the website \"([^\"]*)\"$")
    public void that_enter_the_website(String url) {
        theActorInTheSpotlight().wasAbleTo(Open.url(url));
    }


    @When("^select the option Photos and select the second image$")
    public void select_the_option_Photos_and_select_the_second_image() throws InterruptedException {
     theActorInTheSpotlight().attemptsTo(SelectPhoto.inThePage());

     String photo = hisBrowser.findElement(By.xpath("//div/div[2]/div/a")).getAttribute("href");
     hisBrowser.navigate().to(photo);
     System.out.println(photo);
     Thread.sleep(3000);


        String information = hisBrowser.findElement(By.xpath("//div/div[2]/div/div[2]/div/ul/div/li/div/div/div[2]/div/span")).getText();
        System.out.println(information);
     }

    @Then("^should validate that the information name, price of the first and second item, is displayed in the console and compared with a text\\.$")
    public void should_validate_that_the_information_name_price_of_the_first_and_second_item_is_displayed_in_the_console_and_compared_with_a_text() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ObtainInformationPhoto.inThePage(),
                Matchers.equalTo(Boolean.FALSE)));
    }

}
