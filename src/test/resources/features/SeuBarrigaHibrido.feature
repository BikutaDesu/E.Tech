#language: pt
#encoding: UTF-8
#Author: Victor Neves

  Funcionalidade: Seu Barriga Hibrido

    @mobile @seuBarrigaHibrido
    Cenario: Criar novo usuario
      Dado que esteja na aplicação
      E toco no botão "SeuBarriga Híbrido"
      E seleciono a opção de novo usuario
      E preencho os dados de cadastro "Victor", "victrotiroei@teste.com", "123456"
      Quando toco no botão "Cadastrar"
      Entao visualizo a mensagem na view "Usuário inserido com sucesso"

