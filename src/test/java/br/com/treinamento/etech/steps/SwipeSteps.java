package br.com.treinamento.etech.steps;

import br.com.treinamento.etech.Funcionalidade.SwipeFuncionalidade;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Quando;

public class SwipeSteps {

    private SwipeFuncionalidade swipeFuncionalidade;

    public SwipeSteps() {
        this.swipeFuncionalidade = new SwipeFuncionalidade();
    }

    @Quando("^deslizo a tela \"([^\"]*)\" vezes$")
    public void deslizoATelaVezes(String quantidade) {

    }

    @Quando("^deslizo a tela \"([^\"]*)\" vezes para \"([^\"]*)\"$")
    public void deslizoATela(String quantidade, String direcao) {
        this.swipeFuncionalidade.deslizarTela(Integer.parseInt(quantidade), direcao);
    }
}
