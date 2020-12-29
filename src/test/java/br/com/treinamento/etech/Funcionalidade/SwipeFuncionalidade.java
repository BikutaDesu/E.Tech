package br.com.treinamento.etech.Funcionalidade;

import br.com.treinamento.etech.commons.AppiumRobot;
import br.com.treinamento.etech.commons.BaseTest;

public class SwipeFuncionalidade extends BaseTest {

    private AppiumRobot appiumRobot;

    public SwipeFuncionalidade() {
        appiumRobot = new AppiumRobot();
    }

    public void deslizarTela(Integer quantidade, String direcao) {
        switch (direcao) {
            case "direita":
                appiumRobot.swipeTela(quantidade, 1000, 100,100,100);
                break;
            case "esquerda":
                appiumRobot.swipeTela(quantidade, 100, 1000,100,100);
                break;
            case "cima":
                appiumRobot.swipeTela(quantidade, 100, 100,800,100);
                break;
            case "baixo":
                appiumRobot.swipeTela(quantidade, 100, 100,100,800);
                break;
        }

    }

}
