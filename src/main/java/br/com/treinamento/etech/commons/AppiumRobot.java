package br.com.treinamento.etech.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppiumRobot extends BaseTest{

    public void clicarPorTexto(String valor){
       driver.findElement(By.xpath("//*[@text='"+valor+"']")).click();
    }

    public boolean validaExistenciaTexto(String texto){
        //driverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//android.widget.TextView[@text='"+texto+"']")), texto));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.widget.TextView[@text='"+texto+"']")).isDisplayed();
    }

    public boolean validaExistenciaTextoNaView(String texto){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath("//android.view.View[@text='"+texto+"']")).isDisplayed();
    }
}
