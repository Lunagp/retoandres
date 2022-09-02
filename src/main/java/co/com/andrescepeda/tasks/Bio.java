package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.BioHome.BTN_BIO;
import static co.com.andrescepeda.userinterfaces.BioHome.INFO_BIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Bio implements Task {

    public static Bio infoBio(){
        return instrumented(Bio.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_BIO));
        System.out.println(Text.of(INFO_BIO).viewedBy(actor).asString());
    }
}
