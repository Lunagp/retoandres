package co.com.andrescepeda.tasks;

import co.com.andrescepeda.userinterfaces.PhotosHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;

public class SelectPhoto implements Task {

    public static SelectPhoto inThePage(){
        return Tasks.instrumented(SelectPhoto.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PhotosHome.BTN_PHOTOS));
        actor.attemptsTo(Scroll.to(PhotosHome.TXT_IG));

    }
}
