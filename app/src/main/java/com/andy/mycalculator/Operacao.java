package com.andy.mycalculator;

public class Operacao {

    public static void somar(Valor valor){
        valor.setResultado(valor.getValor1() + valor.getValor2());
    }

    public static void subtrair(Valor valor){
        valor.setResultado(valor.getValor1() - valor.getValor2());
    }

    public static void multiplicar(Valor valor){
        valor.setResultado(valor.getValor1() * valor.getValor2());
    }

    public static void dividir(Valor valor){
        valor.setResultado(valor.getValor1() / valor.getValor2());
    }



}
