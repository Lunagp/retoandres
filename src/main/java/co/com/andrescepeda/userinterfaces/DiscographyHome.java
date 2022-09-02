package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DiscographyHome {

    public static final Target BTN_DISCO = Target.the("boton de discografia").located(By.xpath("html/body/div/header/div/div[2]/div/nav/div[7]"));
    public static final Target BTN_ALBUM = Target.the("boton de album").located(By.xpath("html/body/div/div[2]/main/div/div/div/div/div[2]/div[3]/div/div/div"));
    public static final Target TITLE_DISCO = Target.the("titulo de discografia").located(By.xpath("html/body/div/div[2]/div/div[2]/h1"));



}
