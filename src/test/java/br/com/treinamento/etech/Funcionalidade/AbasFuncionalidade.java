package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.AbasPage;
import br.com.treinamento.etech.commons.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class AbasFuncionalidade extends BaseTest {

    private AbasPage abasPage;
    private TouchAction touchAction;

    public AbasFuncionalidade() {
        touchAction = new TouchAction(driver);
    }

    public void arrastarTelaParaDireita() {
        touchAction.press(new PointOption().withCoordinates(100, 500))
                .moveTo(new PointOption().withCoordinates(900, 500))
                .release()
                .perform();
    }

    public void arrastarTelaParaEsquerda() {
        touchAction.press(new PointOption().withCoordinates(900, 500))
                .moveTo(new PointOption().withCoordinates(100, 500))
                .release()
                .perform();
    }

}
