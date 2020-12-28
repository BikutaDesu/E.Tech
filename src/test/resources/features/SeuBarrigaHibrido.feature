#language: pt
#encoding: UTF-8
#Author: Victor Neves

  Funcionalidade: Seu Barriga Hibrido

    @mobile
    Cenario: Criar novo usuario
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Híbrido"
      E seleciono a opção de novo usuario
      E preencho os dados de cadastro "Victor", "victor@teste.com", "123456"
      Quando toco no botão "Cadastrar"
      Entao visualizo a mensagem na view "Usuário inserido com sucesso"

    @mobile
    Cenario: Criar novo usuario com email existente
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Híbrido"
      E seleciono a opção de novo usuario
      E preencho os dados de cadastro "Victor", "teste@teste.com", "123456"
      Quando toco no botão "Cadastrar"
      Entao visualizo a mensagem na view "Endereço de email já utilizado"

    @mobile @seuBarrigaHibrido
    Cenario: Login com usuário existente
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Híbrido"
      E seleciono a opção de login
      E preencho os dados de login "victor@teste.com", "123456"
      Quando toco no botão "Entrar"
      Entao visualizo a mensagem na view "Seu Barriga. Nunca mais esqueça de pagar o aluguel."