package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SeuBarrigaNativoFuncionalidade;
import cucumber.api.java.pt.E;

public class SeuBarrigaNativoSteps {

    private SeuBarrigaNativoFuncionalidade seuBarrigaNativoFuncionalidade;

    public  SeuBarrigaNativoSteps() {
        this.seuBarrigaNativoFuncionalidade = new SeuBarrigaNativoFuncionalidade();
    }

    @E("^preencho os dados de cadastro \"([^\"]*)\", \"([^\"]*)\"$")
    public void preenchoOsDadosDeCadastro(String email, String senha) throws Throwable {
        this.seuBarrigaNativoFuncionalidade.preencherCampoNome(email);
        this.seuBarrigaNativoFuncionalidade.preencherCampoSenha(senha);
    }

}
