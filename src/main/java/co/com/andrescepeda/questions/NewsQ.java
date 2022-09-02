package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.NewsHome.INFO_NEWS;

public class NewsQ implements Question<Boolean> {

    public static NewsQ newsAnswer(){
        return new NewsQ();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return INFO_NEWS.resolveFor(actor).getText().contains("Nueva noticia");
    }
}
