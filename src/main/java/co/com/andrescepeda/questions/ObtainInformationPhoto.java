package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.PhotosHome.TXT_INFOPHOTO;

public class ObtainInformationPhoto implements Question<Boolean> {

    public static ObtainInformationPhoto inThePage(){
        return new ObtainInformationPhoto();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_INFOPHOTO.resolveFor(actor).getText().contains("Información");
    }
}
