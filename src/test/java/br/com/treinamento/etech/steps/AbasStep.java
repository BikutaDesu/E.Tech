package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.AbasFuncionalidade;
import cucumber.api.java.pt.Quando;

public class AbasStep {

    private AbasFuncionalidade abasFuncionalidade;

    public AbasStep() {
        abasFuncionalidade = new AbasFuncionalidade();
    }

    @Quando("^arrasto o dedo para a direita$")
    public void arrastoODedoParaADireita() {
        this.abasFuncionalidade.arrastarTelaParaDireita();
    }

    @Quando("^arrasto o dedo para a esquerda$")
    public void arrastoODedoParaAEsquerda() {
        this.abasFuncionalidade.arrastarTelaParaEsquerda();
    }
}
