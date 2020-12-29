package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;

public class AbasFuncionalidade extends BaseTest {

    private AppiumRobot appiumRobot;

    public AbasFuncionalidade() {
        appiumRobot = new AppiumRobot();
    }

    public void arrastarTelaParaDireita() {
        appiumRobot.swipeTela(1, 100, 900, 500, 500);
    }

    public void arrastarTelaParaEsquerda() {
        appiumRobot.swipeTela(1, 900, 100, 500, 500);
    }

}
