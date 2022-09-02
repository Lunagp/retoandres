package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.andrescepeda.userinterfaces.DiscographyHome.TITLE_DISCO;

public class DiscographyQ implements Question<Boolean> {

    public static DiscographyQ discoAnswer(){
        return new DiscographyQ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE_DISCO.resolveFor(actor).getText().contains("DISCOGRAFÍA");
    }
}
