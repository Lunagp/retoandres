package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.StoreHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

public class BuyItems implements Task {
    public static BuyItems inThePage(){
        return Tasks.instrumented(BuyItems.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(StoreHome.BTN_STORE));
        actor.attemptsTo(Scroll.to(StoreHome.BTN_ITEM1));
        actor.attemptsTo(Click.on(StoreHome.BTN_ITEM1));
        actor.attemptsTo(Click.on(StoreHome.BTN_ADD));
        actor.attemptsTo(Click.on(StoreHome.BTN_BUYING));

        actor.attemptsTo(Scroll.to(StoreHome.BTN_ITEM2));
        actor.attemptsTo(Click.on(StoreHome.BTN_ITEM2));
        actor.attemptsTo(Click.on(StoreHome.BTN_ADD));


        actor.attemptsTo(Scroll.to(StoreHome.BTN_FINISHBUY));
        actor.attemptsTo(Click.on(StoreHome.BTN_FINISHBUY));

        System.out.println(Text.of(StoreHome.TXT_ITEM1).viewedBy(actor).asString());
        System.out.println(Text.of(StoreHome.TXT_PRICEITEM1).viewedBy(actor).asString());
        System.out.println(Text.of(StoreHome.TXT_ITEM2).viewedBy(actor).asString());
        System.out.println(Text.of(StoreHome.TXT_PRICEITEM2).viewedBy(actor).asString());

    }
}
