package co.com.andrescepeda.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.andrescepeda.userinterfaces.StoreHome.*;

public class VerifyInformationBuy implements Question<Boolean> {

    public static VerifyInformationBuy inThePage(){
        return new VerifyInformationBuy();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return  TXT_ITEM1.resolveFor(actor).getText().contains("Nombre articulo 1")
                && TXT_PRICEITEM1.resolveFor(actor).getText().contains("Precio del primer articulo")
                && TXT_ITEM2.resolveFor(actor).getText().contains("Precio del segundo articulo")
                && TXT_PRICEITEM2.resolveFor(actor).getText().contains("Precio del segundo articulo");
    }
}
