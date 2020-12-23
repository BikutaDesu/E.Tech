package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaNativoPage {

    public SeuBarrigaNativoPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
    private MobileElement txtNome;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Senha']")
    private MobileElement txtSenha;

    public MobileElement getTxtNome() {
        return txtNome;
    }

    public MobileElement getTxtSenha() {
        return txtSenha;
    }
}
