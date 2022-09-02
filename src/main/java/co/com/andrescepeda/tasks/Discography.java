package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.andrescepeda.userinterfaces.DiscographyHome.BTN_ALBUM;
import static co.com.andrescepeda.userinterfaces.DiscographyHome.BTN_DISCO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Discography implements Task {

    WebDriver hisBrowser;

    public static Discography clickDisco(){
        return instrumented(Discography.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_DISCO));

    }
}
