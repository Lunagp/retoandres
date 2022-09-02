package co.com.andrescepeda.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.NewsHome.BTN_NEWS;
import static co.com.andrescepeda.userinterfaces.NewsHome.INFO_NEWS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class News implements Task {

    public static News infoNoticias(){
        return instrumented(News.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_NEWS));
        System.out.println(Text.of(INFO_NEWS).viewedBy(actor).asString());
    }
}
