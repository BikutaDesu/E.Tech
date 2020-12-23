package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaNativoFuncionalidade;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class SeuBarrigaNativoSteps {

    private SeuBarrigaNativoFuncionalidade seuBarrigaNativoFuncionalidade;

    public  SeuBarrigaNativoSteps() {
        this.seuBarrigaNativoFuncionalidade = new SeuBarrigaNativoFuncionalidade();
    }

    @E("^preencho os campos de login incorretos$")
    public void preenchoOsCamposDeLogin() {
        this.seuBarrigaNativoFuncionalidade.preencherCampoNome();
        this.seuBarrigaNativoFuncionalidade.preencherCampoSenha();
    }

    @Entao("^visualizo o erro de login$")
    public void visualizoOErroDeLogin() {
        this.seuBarrigaNativoFuncionalidade.validaExistenciaMensagemLoginInvalido();
    }
}
