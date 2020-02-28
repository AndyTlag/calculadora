package com.andy.mycalculator;


import org.junit.Test;

public class CalculadoraTest{

    @Test
    public void calculadoraSomaSucesso(){
    Calculadora calculadora = new Calculadora();

    //calculadora.somar(10.0, 25.0)
        System.out.println("O valor da soma é = " + calculadora.somar(10.0, 25.0));
    }

}
