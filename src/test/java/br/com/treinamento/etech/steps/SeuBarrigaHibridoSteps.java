package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaHibridoFuncionalidade;
import br.com.treinamento.etech.commons.AppiumRobot;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class SeuBarrigaHibridoSteps {

    private AppiumRobot appiumRobot;
    private SeuBarrigaHibridoFuncionalidade seuBarrigaHibridoFuncionalidade;

    public SeuBarrigaHibridoSteps() {
        this.appiumRobot = new AppiumRobot();
        this.seuBarrigaHibridoFuncionalidade = new SeuBarrigaHibridoFuncionalidade();
    }

    @Entao("^visualizo a mensagem \"([^\"]*)\"$")
    public void visualizoAMensagem(String textoMensagem){
        this.appiumRobot.validaExistenciaTexto(textoMensagem);
    }

    @E("^preencho os dados de cadastro \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void preenchoOsDadosDeCadastro(String nome, String email, String senha) {
        this.seuBarrigaHibridoFuncionalidade.preencherCampoNome(nome);
        this.seuBarrigaHibridoFuncionalidade.preencherCampoEmail(email);
        this.seuBarrigaHibridoFuncionalidade.preencherCampoSenha(senha);
    }

    @E("^seleciono a opção de novo usuario$")
    public void selecionoAOpcaoDeNovoUsuario() {
        this.seuBarrigaHibridoFuncionalidade.tocarBotaoNovoUsuario();
    }

    @E("^seleciono a opção de login$")
    public void selecionoAOpçãoDeLogin() {
        this.seuBarrigaHibridoFuncionalidade.tocarBotaoLogin();
    }

    @Entao("^visualizo a mensagem na view \"([^\"]*)\"$")
    public void visualizoAMensagemNaView(String textoMensagem) {
        this.appiumRobot.validaExistenciaTextoNaView(textoMensagem);
    }

    @E("^preencho os dados de login \"([^\"]*)\", \"([^\"]*)\"$")
    public void preenchoOsDadosDeLogin(String email, String senha) {
        this.seuBarrigaHibridoFuncionalidade.preencherCampoEmail(email);
        this.seuBarrigaHibridoFuncionalidade.preencherCampoSenha(senha);
    }
}
