package br.com.treinamento.etech.Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class SeuBarrigaHibridoContaPage {

    public SeuBarrigaHibridoContaPage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Spinner")
    private MobileElement spinnerContas;

    @AndroidFindBy(xpath ="//android.widget.EditText[@resource-id='nome']")
    private MobileElement txtNome;

    @AndroidFindBy(xpath ="//android.view.View[@text='Adicionar']")
    private MobileElement btnAdicionar;


    @AndroidFindBy(xpath ="//android.view.View[@text='Listar']")
    private MobileElement btnListar;

    public MobileElement getSpinnerContas() {
        return spinnerContas;
    }

    public MobileElement getTxtNome() {
        return txtNome;
    }

    public MobileElement getBtnAdicionar() {
        return btnAdicionar;
    }

    public MobileElement getBtnListar() {
        return btnListar;
    }
}
