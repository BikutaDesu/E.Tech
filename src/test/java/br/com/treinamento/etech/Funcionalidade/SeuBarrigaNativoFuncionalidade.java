package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaNativoPage;
import br.com.treinamento.etech.commons.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeuBarrigaNativoFuncionalidade extends BaseTest {

    private SeuBarrigaNativoPage seuBarrigaNativoPage;

    public SeuBarrigaNativoFuncionalidade() {
        this.seuBarrigaNativoPage = new SeuBarrigaNativoPage(driver);
    }

    public void preencherCampoNome(String nome) {
        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaNativoPage.getTxtNome()));
        this.seuBarrigaNativoPage.getTxtNome().sendKeys(nome);
    }

    public void preencherCampoSenha(String senha) {
        this.seuBarrigaNativoPage.getTxtSenha().sendKeys(senha);
    }

}
