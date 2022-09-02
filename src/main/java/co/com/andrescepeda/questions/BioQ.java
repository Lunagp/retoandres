package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.BioHome.INFO_BIO;

public class BioQ implements Question<Boolean> {

    public static BioQ bioAnswer(){
        return new BioQ();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return INFO_BIO.resolveFor(actor).getText().contains("Biografia de Andrés Cepeda");
    }
}
