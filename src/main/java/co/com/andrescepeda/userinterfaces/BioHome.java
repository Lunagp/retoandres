package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BioHome {

    public static final Target BTN_BIO = Target.the("boton de biografia").located(By.xpath("html/body/div/header/div/div[2]/div/nav/div[3]"));
    public static final Target INFO_BIO = Target.the("informacion de biografia de biografia").located(By.xpath("html/body/div/div[3]/main /div/div[3]/div/div/div/div/div/div/div[2]/div[2]/div/div"));
}
