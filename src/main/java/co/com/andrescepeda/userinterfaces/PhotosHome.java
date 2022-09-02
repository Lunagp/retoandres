package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhotosHome {

    public static final Target BTN_PHOTOS = Target.the("Botón opción de fotos").located(By.xpath("//body/div/header/div/div[2]/div/nav/div[8]/a"));

    public static final Target TXT_IG = Target.the("Texto instagram").located(By.xpath("//h2[contains(text(), 'Instagram')]"));
    public static final Target PHOTO2 = Target.the("Botón opción segunda foto").located(By.xpath("//div/div[2]/div/a"));
    public static final Target TXT_INFOPHOTO = Target.the("Texto verificación información de foto").located(By.xpath("//body/div/div/div/div/div/div/div/div/div/section/main/div/div/article/div/div[2]/div/div[2]/div/ul/div/li/div/div/div[2]"));
}
