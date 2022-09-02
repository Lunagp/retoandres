package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EventHome {

    public static final Target SCROLL_EVENT = Target.the("bajar al boton de proximos eventos").located(By.xpath("html/body/div/div[3]/main/div/div/div/div[3]/div/div/div/div/div[2]/div[2]/div/div/div[13]"));
    public static final Target BTN_EVENT = Target.the("boton de proximos eventos").located(By.xpath("//*[contains( text(),'PRÓXIMOS eventos' )]"));
    public static final Target INFO_EVENT = Target.the("información de proximos eventos").located(By.xpath("html/body/div/div[2]/main/div/div/div/div/div[2]/div[2]/div/div/div/div"));

}
