package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.HomeFuncionalidade;
import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoContaFuncionalidade;
import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class SeuBarrigaHibridoContaSteps {

    private HomeFuncionalidade homeFuncionalidade;
    private SeuBarrigaHibridoFuncionalidade seuBarrigaHibridoFuncionalidade;
    private SeuBarrigaHibridoContaFuncionalidade seuBarrigaHibridoContaFuncionalidade;
    private AppiumRobot appiumRobot;

    public SeuBarrigaHibridoContaSteps() {
        homeFuncionalidade = new HomeFuncionalidade();
        seuBarrigaHibridoFuncionalidade = new SeuBarrigaHibridoFuncionalidade();
        seuBarrigaHibridoContaFuncionalidade = new SeuBarrigaHibridoContaFuncionalidade();
        appiumRobot = new AppiumRobot();
    }

    @Dado("^que esteja na tela de login da pagina \"([^\"]*)\"$")
    public void queEstejaNaTelaDeLoginDaPagina(String texto) {
        Assert.assertTrue(this.homeFuncionalidade.validaAcessoHome());
        this.appiumRobot.clicarPorTexto(texto);
        this.seuBarrigaHibridoFuncionalidade.tocarBotaoLogin();
    }

    @Quando("^toco no spinner contas$")
    public void tocoNoSpinner() {
        this.seuBarrigaHibridoContaFuncionalidade.tocarSpinnerContas();
    }

    @E("^toco na view Adicionar$")
    public void tocoNaView() {
        this.seuBarrigaHibridoContaFuncionalidade.tocarEmAdicionar();
    }

    @E("^preencho o campo texto com \"([^\"]*)\"$")
    public void preenchoOCampoTextoCom(String texto) {
        this.seuBarrigaHibridoContaFuncionalidade.preencherCampoNome(texto);
    }
}
