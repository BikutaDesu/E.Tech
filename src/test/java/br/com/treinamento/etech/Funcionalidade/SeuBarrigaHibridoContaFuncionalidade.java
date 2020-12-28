package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.Pages.SeuBarrigaHibridoContaPage;
import br.com.treinamento.etech.commons.BaseTest;

public class SeuBarrigaHibridoContaFuncionalidade extends BaseTest {

    private SeuBarrigaHibridoContaPage seuBarrigaHibridoContaPage;

    public SeuBarrigaHibridoContaFuncionalidade() {
        this.seuBarrigaHibridoContaPage = new SeuBarrigaHibridoContaPage(driver);
    }

    public void tocarSpinnerContas() {
        this.seuBarrigaHibridoContaPage.getSpinnerContas().click();
    }

    public void preencherCampoNome(String texto) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driverWait.until(ExpectedConditions.visibilityOf(this.seuBarrigaHibridoContaPage.getTxtNome()));
        this.seuBarrigaHibridoContaPage.getTxtNome().sendKeys(texto);
    }

    public void tocarEmAdicionar() {
        this.seuBarrigaHibridoContaPage.getBtnAdicionar().click();
    }

    public void tocarEmListar() {
        this.seuBarrigaHibridoContaPage.getBtnListar().click();
    }
}
