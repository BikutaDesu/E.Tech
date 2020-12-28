package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;

public class AbasFuncionalidade extends BaseTest {

    private AppiumRobot appiumRobot;

    public AbasFuncionalidade() {
        appiumRobot = new AppiumRobot();
    }

    public void arrastarTelaParaDireita() {
        appiumRobot.swipeHorizontal(1, 100, 900);
    }

    public void arrastarTelaParaEsquerda() {
        appiumRobot.swipeHorizontal(1, 900, 100);
    }

}
