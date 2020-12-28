#language: pt
#encoding: UTF-8
#Author: Victor Neves

  Funcionalidade: Abas

    Contexto:
      Dado que esteja na aplicação
      E toco no botão "Abas"

    @mobile
    Cenario: Deslizar Aba1 para Aba2
      E visualizo a mensagem "Este é o conteúdo da Aba 1"
      Quando arrasto o dedo para a esquerda
      Então visualizo a mensagem "Este é o conteúdo da Aba 2"

    @mobile @abas
    Cenario: Deslizar Aba2 para Aba1
      E visualizo a mensagem "Este é o conteúdo da Aba 1"
      E arrasto o dedo para a esquerda
      E visualizo a mensagem "Este é o conteúdo da Aba 2"
      Quando arrasto o dedo para a direita
      Então visualizo a mensagem "Este é o conteúdo da Aba 1"