package com.andy.mycalculator;


import org.junit.Test;

public class CalculadoraTest{

    @Test
    public void calculadoraSomaSucesso(){
    Calculadora calculadora = new Calculadora();

    //calculadora.somar(10.0, 25.0)
        System.out.println("O valor da soma é = " + calculadora.somar(10.0, 25.0));
    }

    @Test
    public void calculadoraSubtraiSucesso(){
        Calculadora calculadora = new Calculadora();

        System.out.println("O valor da subtração é = " + calculadora.subtrair(10.0, 25.0));
    }

    @Test
    public void calculadoraMultiplicaSucesso(){
        Calculadora calculadora = new Calculadora();


        System.out.println("O valor da multiplicação é = " + calculadora.multiplicar(10.0, 25.0));
    }
    @Test
    public void calculadoraDividirSucesso(){
        Calculadora calculadora = new Calculadora();


        System.out.println("O valor da divisão é = " + calculadora.dividir(10.0, 25.0));
    }

}
