#language: pt
#encoding: UTF-8
#Author: Victor Neves

  Funcionalidade: Seu Barriga Hibrido Conta

    Contexto:
      Dado que esteja na tela de login da pagina "SeuBarriga Híbrido"
      E preencho os dados de login "victor@teste.com", "123456"
      E toco no botão "Entrar"

     @mobile
    Cenario: Adicionar nova conta
      Quando toco no spinner contas
      E toco na view Adicionar
      E preencho o campo texto com "Teste"
      E toco no botão "Salvar"
      E visualizo a mensagem na view "Conta adicionada com sucesso!"

    @seuBarrigaHibridoConta @mobile
    Cenario: Adicionar existente conta
      Quando toco no spinner contas
      E toco na view Adicionar
      E preencho o campo texto com "Teste"
      E toco no botão "Salvar"
      E visualizo a mensagem na view "Já existe uma conta com esse nome!"