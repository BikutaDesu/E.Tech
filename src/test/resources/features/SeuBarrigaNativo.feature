#language: pt
#enconding: UTF-8
#Author: Victor Neves

  Funcionalidade: Seu Barriga Nativo

    @mobile @seuBarrigaNativo
    Cenario: Validar login inválido
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Nativo"
      E preencho os dados de cadastro "victor123@teste.com", "123456"
      Quando toco no botão "ENTRAR"
      Entao visualizo a mensagem "Problemas com o login"


