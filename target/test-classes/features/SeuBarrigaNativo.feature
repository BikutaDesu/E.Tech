#language: pt
#enconding: UTF-8
#Author: Victor Neves

  Funcionalidade: Seu Barriga Nativo

    @mobile @seuBarrigaNativo
    Cenario: Validar login inválido
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Nativo"
      E preencho os campos de login
      Quando toco no botão "ENTRAR"
      Entao visualizo o erro de login