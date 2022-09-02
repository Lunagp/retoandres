package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NewsHome {

    public static final Target BTN_NEWS = Target.the("boton de noticias").located(By.xpath("html/body/div/header/div/div[2]/div/nav/div[4]"));
    public static final Target INFO_NEWS = Target.the("boton de noticias").located(By.xpath("html/body/div/div[3]/main/div/div[4]/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/a"));

}
