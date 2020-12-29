#language: pt
#encoding: UTF-8
#Author: Victor Neves
  
  Funcionalidade: Swipe
    
    Contexto: 
      Dado que esteja na aplicação
      E toco no botão "Swipe"

    @mobile @swipe
    Cenario: Mover da primeira a última tela
      Quando deslizo a tela "2" vezes para "direita"
      Então visualizo a mensagem "Chegar até o fim!"