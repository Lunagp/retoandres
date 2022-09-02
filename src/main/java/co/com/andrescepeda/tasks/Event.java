package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.EventHome.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Event implements Task {

    public static Event infoEvento(){
        return instrumented(Event.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SCROLL_EVENT));
        actor.attemptsTo(Click.on(BTN_EVENT));
        System.out.println(Text.of(INFO_EVENT).viewedBy(actor).asString());
    }
}
