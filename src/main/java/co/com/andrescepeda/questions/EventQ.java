package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.EventHome.INFO_EVENT;

public class EventQ implements Question<Boolean> {

    public static  EventQ eventoAnswer(){
        return new EventQ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return INFO_EVENT.resolveFor(actor).getText().contains("Información del concierto más reciente");
    }
}
