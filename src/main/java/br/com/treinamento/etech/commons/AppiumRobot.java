package br.com.treinamento.etech.commons;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

public class AppiumRobot extends BaseTest{

    private TouchAction touchAction;

    public AppiumRobot() {
        touchAction = new TouchAction(driver);
    }

    public void clicarPorTexto(String texto){
        driver.findElement(By.xpath("//*[@text='"+texto+"']")).click();
    }

    public boolean validaExistenciaTexto(String texto){
        //driverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//android.widget.TextView[@text='"+texto+"']")), texto));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+texto+"']")).isDisplayed();
    }

    public boolean validaExistenciaTextoNaView(String texto){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.view.View[@text='"+texto+"']")).isDisplayed();
    }

    public void swipeHorizontal(Integer quantidade, Integer xOrigem, Integer xDestino) {
        for (int i = 0; i < quantidade; i++) {
            touchAction.press(new PointOption().withCoordinates(xOrigem, 500))
                    .moveTo(new PointOption().withCoordinates(xDestino, 500))
                    .release()
                    .perform();
        }
    }
}
