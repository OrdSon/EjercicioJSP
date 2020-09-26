/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.ArrayList;

/**
 *
 * @author samuelson
 */
public class Calculadora {
    public Calculadora(){
        
    }
    
    public int sumar(int primero, int segundo){
        return (primero+segundo);
    }
    public int multiplicar(int primero, int segundo){
        return (primero*segundo);
    }
    public int mayor(int primero, int segundo){
        if (primero > segundo) {
            return primero;
        }else{
            return segundo;
        }
    }
    public int potiencia(int primero, int segundo){
        return (int)Math.pow(primero, segundo);
    }
    
    public String binario(int valor) {
	if (valor <= 0) {
		return "0";
	}
	StringBuilder binario = new StringBuilder();
	while (valor > 0) {
		int residuo = (int) (valor % 2);
		valor = valor / 2;
		binario.insert(0, String.valueOf(residuo));
	}
	return binario.toString();
}
}
