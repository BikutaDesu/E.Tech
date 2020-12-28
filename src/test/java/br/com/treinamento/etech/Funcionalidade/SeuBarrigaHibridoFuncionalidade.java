package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaHibridoPage;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaHibridoFuncionalidade extends BaseTest {

    private SeuBarrigaHibridoPage seuBarrigaHibridoPage;

    public SeuBarrigaHibridoFuncionalidade() {
        this.seuBarrigaHibridoPage = new SeuBarrigaHibridoPage(driver);
    }

    public void preencherCampoNome(String nome) {
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getTxtNome()));
        this.seuBarrigaHibridoPage.getTxtNome().sendKeys(nome);
    }

    public void preencherCampoEmail(String email) {
        this.seuBarrigaHibridoPage.getTxtEmail().sendKeys(email);
    }

    public void preencherCampoSenha(String senha) {
        this.seuBarrigaHibridoPage.getTxtSenha().sendKeys(senha);
    }

    public void tocarBotaoNovoUsuario() {
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getBtnNovoUsuario()));
        this.seuBarrigaHibridoPage.getBtnNovoUsuario().click();
    }

    public void tocarBotaoLogin() {
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoPage.getBtnNovoUsuario()));
        this.seuBarrigaHibridoPage.getBtnLogin().click();
    }

}
