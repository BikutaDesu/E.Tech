package br.com.treinamento.etech.commons;

import org.openqa.selenium.By;

public class AppiumRobot extends BaseTest{

    public void clicarPorTexto(String texto){
       driver.findElement(By.xpath("//*[@text='"+texto+"']")).click();
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
