package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AbasPage {

    @AndroidFindBy(xpath = "")
    private MobileElement txtAba1;

    @AndroidFindBy(xpath = "")
    private MobileElement txtAba2;

    public AbasPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public MobileElement getTxtAba1() {
        return txtAba1;
    }

    public MobileElement getTxtAba2() {
        return txtAba2;
    }

}
