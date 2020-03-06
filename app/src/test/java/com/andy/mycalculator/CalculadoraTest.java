package com.andy.mycalculator;

import org.junit.Test;

public class CalculadoraTest{

    @Test
    public void calculadoraSomaSucesso(){
        Operacao operacao =  new Operacao();
        Valor valor = new Valor(10,20,0);
        Operacao.somar(valor);


    //calculadora.somar(10.0, 25.0)

        System.out.println(MensagemValor.getMensagem(MensagemOperacao.SOMA_SUCESSO, valor));
    }

    @Test
    public void calculadoraSubtracaoSucesso(){
        Operacao operacao =  new Operacao();
        Valor valor = new Valor(10,20,0);
        Operacao.subtrair(valor);

        System.out.println(MensagemValor.getMensagem(MensagemOperacao.SUBTRACAO_SUCESSO, valor));
    }

    @Test
    public void calculadoraMultiplicacaoSucesso(){
        Operacao operacao =  new Operacao();
        Valor valor = new Valor(10,20,0);
        Operacao.multiplicar(valor);

        System.out.println(MensagemValor.getMensagem(MensagemOperacao.MULTIPLICACAO_SUCESSO, valor));
    }

    @Test
    public void calculadoraDivisaoSucesso(){
        Operacao operacao =  new Operacao();
        Valor valor = new Valor(10,20,0);
        Operacao.dividir(valor);

        System.out.println(MensagemValor.getMensagem(MensagemOperacao.DIVISAO_SUCESSO, valor));
    }

}
