package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaHibridoPage {

    @AndroidFindBy(xpath = "//android.view.View[@text='Novo usuário?']")
    private MobileElement btnNovoUsuario;

    @AndroidFindBy(xpath = "//android.view.View[@text='Login']")
    private MobileElement btnLogin;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='nome']")
    private MobileElement txtNome;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='senha']")
    private MobileElement txtSenha;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='email']")
    private MobileElement txtEmail;

    public SeuBarrigaHibridoPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public MobileElement getTxtNome() {
        return txtNome;
    }

    public MobileElement getTxtSenha() {
        return txtSenha;
    }

    public MobileElement getTxtEmail() {
        return txtEmail;
    }

    public MobileElement getBtnNovoUsuario() { return btnNovoUsuario; }

    public MobileElement getBtnLogin() { return btnLogin; }


}
