package com.andy.mycalculator;

public class MensagemValor {
    public static String getMensagem(String mensagem, Valor valor){
        return mensagem + valor.getResultado();

    }
}
