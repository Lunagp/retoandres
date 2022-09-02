package co.com.andrescepeda.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StoreHome {

    public static final Target BTN_STORE = Target.the("Botón opción de tienda").located(By.xpath("//header/div/div[2]/div/nav/div[10]/a[contains(text(), 'TIENDA')]"));

    public static final Target BTN_ITEM1 = Target.the("Botón opción primer articulo").located(By.xpath("//body/div/div/div/article/div/div/div/div[2]/div/div/div[2]/div/ul/li/a"));
    public static final Target BTN_ADD = Target.the("Botón opción añadir al carrito").located(By.xpath("//button[contains(text(),'Añadir al carrito')]"));

    public static final Target BTN_ITEM2 = Target.the("Botón opción segundo articulo").located(By.xpath("//body/div/div/div/div/div/div/div[2]/section/ul/li[1]/a"));

    public static final Target BTN_BUYING = Target.the("Botón opción seguir comprando").located(By.xpath("//a[contains(text(),'Seguir comprando')]"));
    public static final Target BTN_FINISHBUY = Target.the("Botón opción finalizar compra").located(By.xpath("//a[contains(text(),'Finalizar compra')]"));
    public static final Target TXT_BUY = Target.the("Texto tu pedido").located(By.xpath("//h3[contains(text(),'Tu pedido')]"));

    public static final Target TXT_ITEM1 = Target.the("Texto nombre del primer articulo").located(By.xpath("//body/div/div/div/article/div/div/div/div/div[2]/div/div/div/div/form[2]/div[2]/table/tbody/tr/td"));
    public static final Target TXT_PRICEITEM1 = Target.the("Texto precio del primer ariculo").located(By.xpath("//body/div/div/div/article/div/div/div/div/div[2]/div/div/div/div/form[2]/div[2]/table/tbody/tr/td[2]/span/bdi"));
    public static final Target TXT_ITEM2 = Target.the("Texto nombre del segundo articulo").located(By.xpath("//body/div/div/div/article/div/div/div/div/div[2]/div/div/div/div/form[2]/div[2]/table/tbody/tr[2]/td"));
    public static final Target TXT_PRICEITEM2 = Target.the("Texto precio del segundo ariculo").located(By.xpath("//body/div/div/div/article/div/div/div/div/div[2]/div/div/div/div/form[2]/div[2]/table/tbody/tr[2]/td[2]/span/bdi"));
}
